package com.ruoyi.demo.controller;

import cn.dev33.satoken.annotation.SaCheckPermission;
import com.ruoyi.common.annotation.Log;
import com.ruoyi.common.annotation.RepeatSubmit;
import com.ruoyi.common.core.controller.BaseController;
import com.ruoyi.common.core.domain.PageQuery;
import com.ruoyi.common.core.domain.R;
import com.ruoyi.common.core.page.TableDataInfo;
import com.ruoyi.common.core.validate.AddGroup;
import com.ruoyi.common.core.validate.EditGroup;
import com.ruoyi.common.enums.BusinessType;
import com.ruoyi.common.utils.poi.ExcelUtil;
import com.ruoyi.demo.domain.bo.TestDemoBo;
import com.ruoyi.demo.domain.vo.TestDemoVo;
import com.ruoyi.demo.service.ITestDemoService;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import lombok.RequiredArgsConstructor;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.Arrays;
import java.util.List;

/**
 * 测试单
 *
 * @author ruoyi
 * @date 2024-04-09
 */
@Validated
@RequiredArgsConstructor
@RestController
@RequestMapping("/demo/demo")
public class TestDemoController extends BaseController {

    private final ITestDemoService iTestDemoService;

    /**
     * 查询测试单列表
     */
    @SaCheckPermission("demo:demo:list")
    @GetMapping("/list")
    public TableDataInfo<TestDemoVo> list(TestDemoBo bo, PageQuery pageQuery) {
        return iTestDemoService.queryPageList(bo, pageQuery);
    }

    /**
     * 导出测试单列表
     */
    @SaCheckPermission("demo:demo:export")
    @Log(title = "测试单", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    public void export(TestDemoBo bo, HttpServletResponse response) {
        List<TestDemoVo> list = iTestDemoService.queryList(bo);
        ExcelUtil.exportExcel(list, "测试单", TestDemoVo.class, response);
    }

    /**
     * 获取测试单详细信息
     *
     * @param id 主键
     */
    @SaCheckPermission("demo:demo:query")
    @GetMapping("/{id}")
    public R<TestDemoVo> getInfo(@NotNull(message = "主键不能为空")
                                     @PathVariable Long id) {
        return R.ok(iTestDemoService.queryById(id));
    }

    /**
     * 新增测试单
     */
    @SaCheckPermission("demo:demo:add")
    @Log(title = "测试单", businessType = BusinessType.INSERT)
    @RepeatSubmit()
    @PostMapping()
    public R<Void> add(@Validated(AddGroup.class) @RequestBody TestDemoBo bo) {
        return toAjax(iTestDemoService.insertByBo(bo));
    }

    /**
     * 修改测试单
     */
    @SaCheckPermission("demo:demo:edit")
    @Log(title = "测试单", businessType = BusinessType.UPDATE)
    @RepeatSubmit()
    @PutMapping()
    public R<Void> edit(@Validated(EditGroup.class) @RequestBody TestDemoBo bo) {
        return toAjax(iTestDemoService.updateByBo(bo));
    }

    /**
     * 删除测试单
     *
     * @param ids 主键串
     */
    @SaCheckPermission("demo:demo:remove")
    @Log(title = "测试单", businessType = BusinessType.DELETE)
    @DeleteMapping("/{ids}")
    public R<Void> remove(@NotEmpty(message = "主键不能为空")
                          @PathVariable Long[] ids) {
        return toAjax(iTestDemoService.deleteWithValidByIds(Arrays.asList(ids), true));
    }
}
