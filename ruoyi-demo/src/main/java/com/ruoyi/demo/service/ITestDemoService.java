package com.ruoyi.demo.service;

import com.ruoyi.common.core.domain.PageQuery;
import com.ruoyi.common.core.page.TableDataInfo;
import com.ruoyi.demo.domain.bo.TestDemoBo;
import com.ruoyi.demo.domain.vo.TestDemoVo;

import java.util.Collection;
import java.util.List;

/**
 * 测试单Service接口
 *
 * @author ruoyi
 * @date 2024-04-11
 */
public interface ITestDemoService {

    /**
     * 查询测试单
     */
    TestDemoVo queryById(Long id);

    /**
     * 查询测试单列表
     */
    TableDataInfo<TestDemoVo> queryPageList(TestDemoBo bo, PageQuery pageQuery);

    /**
     * 查询测试单列表
     */
    List<TestDemoVo> queryList(TestDemoBo bo);

    /**
     * 新增测试单
     */
    Boolean insertByBo(TestDemoBo bo);

    /**
     * 修改测试单
     */
    Boolean updateByBo(TestDemoBo bo);

    /**
     * 校验并批量删除测试单信息
     */
    Boolean deleteWithValidByIds(Collection<Long> ids, Boolean isValid);
}
