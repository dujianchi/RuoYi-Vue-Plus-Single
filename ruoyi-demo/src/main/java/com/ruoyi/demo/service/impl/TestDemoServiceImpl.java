package com.ruoyi.demo.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.core.toolkit.Wrappers;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.ruoyi.common.core.domain.PageQuery;
import com.ruoyi.common.core.page.TableDataInfo;
import com.ruoyi.common.utils.StringUtils;
import com.ruoyi.demo.domain.TestDemo;
import com.ruoyi.demo.domain.bo.TestDemoBo;
import com.ruoyi.demo.domain.vo.TestDemoVo;
import com.ruoyi.demo.mapper.TestDemoMapper;
import com.ruoyi.demo.mapstruct.TestDemoStructMapper;
import com.ruoyi.demo.service.ITestDemoService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Collection;
import java.util.List;
import java.util.Map;

/**
 * 测试单Service业务层处理
 *
 * @author ruoyi
 * @date 2024-04-09
 */
@RequiredArgsConstructor
@Service
public class TestDemoServiceImpl implements ITestDemoService {

    private final TestDemoMapper baseMapper;
    private final TestDemoStructMapper testDemoStructMapper;

    /**
     * 查询测试单
     */
    @Override
    public TestDemoVo queryById(Long id){
        return baseMapper.selectVoById(id);
    }

    /**
     * 查询测试单列表
     */
    @Override
    public TableDataInfo<TestDemoVo> queryPageList(TestDemoBo bo, PageQuery pageQuery) {
        LambdaQueryWrapper<TestDemo> lqw = buildQueryWrapper(bo);
        Page<TestDemoVo> result = baseMapper.selectVoPage(pageQuery.build(), lqw);
        return TableDataInfo.build(result);
    }

    /**
     * 查询测试单列表
     */
    @Override
    public List<TestDemoVo> queryList(TestDemoBo bo) {
        LambdaQueryWrapper<TestDemo> lqw = buildQueryWrapper(bo);
        return baseMapper.selectVoList(lqw);
    }

    private LambdaQueryWrapper<TestDemo> buildQueryWrapper(TestDemoBo bo) {
        Map<String, Object> params = bo.getParams();
        LambdaQueryWrapper<TestDemo> lqw = Wrappers.lambdaQuery();
        lqw.eq(bo.getDeptId() != null, TestDemo::getDeptId, bo.getDeptId());
        lqw.eq(bo.getUserId() != null, TestDemo::getUserId, bo.getUserId());
        lqw.eq(bo.getOrderNum() != null, TestDemo::getOrderNum, bo.getOrderNum());
        lqw.eq(StringUtils.isNotBlank(bo.getTestKey()), TestDemo::getTestKey, bo.getTestKey());
        lqw.eq(StringUtils.isNotBlank(bo.getValue()), TestDemo::getValue, bo.getValue());
        return lqw;
    }

    /**
     * 新增测试单
     */
    @Override
    public Boolean insertByBo(TestDemoBo bo) {
        TestDemo add = testDemoStructMapper.fromBo(bo);
        validEntityBeforeSave(add);
        boolean flag = baseMapper.insert(add) > 0;
        if (flag) {
            bo.setId(add.getId());
        }
        return flag;
    }

    /**
     * 修改测试单
     */
    @Override
    public Boolean updateByBo(TestDemoBo bo) {
        TestDemo update = testDemoStructMapper.fromBo(bo);
        validEntityBeforeSave(update);
        return baseMapper.updateById(update) > 0;
    }

    /**
     * 保存前的数据校验
     */
    private void validEntityBeforeSave(TestDemo entity){
        //TODO 做一些数据校验,如唯一约束
    }

    /**
     * 批量删除测试单
     */
    @Override
    public Boolean deleteWithValidByIds(Collection<Long> ids, Boolean isValid) {
        if(isValid){
            //TODO 做一些业务上的校验,判断是否需要校验
        }
        return baseMapper.deleteBatchIds(ids) > 0;
    }
}
