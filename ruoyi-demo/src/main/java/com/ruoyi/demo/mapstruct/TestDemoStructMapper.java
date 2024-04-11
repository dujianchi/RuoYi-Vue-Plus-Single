package com.ruoyi.demo.mapstruct;

import com.ruoyi.demo.domain.TestDemo;
import com.ruoyi.demo.domain.bo.TestDemoBo;
import com.ruoyi.demo.domain.vo.TestDemoVo;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper(componentModel = "spring")
public interface TestDemoStructMapper {

    TestDemo fromBo(TestDemoBo e);
    TestDemoVo toVo(TestDemo e);
    List<TestDemoVo> toVoList(List<TestDemo> e);

}
