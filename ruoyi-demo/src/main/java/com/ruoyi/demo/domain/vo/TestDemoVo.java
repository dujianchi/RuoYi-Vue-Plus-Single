package com.ruoyi.demo.domain.vo;

import com.alibaba.excel.annotation.ExcelIgnoreUnannotated;
import com.alibaba.excel.annotation.ExcelProperty;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

import java.io.Serializable;

/**
 * 测试单视图对象 test_demo
 *
 * @author ruoyi
 * @date 2024-04-11
 */
@Data
@ExcelIgnoreUnannotated
public class TestDemoVo implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 主键
     */
    @ExcelProperty(value = "主键")
    @JsonProperty(value = "id")
    private Long id;

    /**
     * 部门id
     */
    @ExcelProperty(value = "部门id")
    @JsonProperty(value = "deptId")
    private Long deptId;

    /**
     * 用户id
     */
    @ExcelProperty(value = "用户id")
    @JsonProperty(value = "userId")
    private Long userId;

    /**
     * 排序号
     */
    @ExcelProperty(value = "排序号")
    @JsonProperty(value = "orderNum")
    private Long orderNum;

    /**
     * key键
     */
    @ExcelProperty(value = "key键")
    @JsonProperty(value = "testKey")
    private String testKey;

    /**
     * 值
     */
    @ExcelProperty(value = "值")
    @JsonProperty(value = "value")
    private String value;


}
