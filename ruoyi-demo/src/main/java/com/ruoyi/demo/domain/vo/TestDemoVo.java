package com.ruoyi.demo.domain.vo;

import com.alibaba.excel.annotation.ExcelIgnoreUnannotated;
import com.alibaba.excel.annotation.ExcelProperty;
import lombok.Data;

import java.io.Serializable;

/**
 * 测试单视图对象 test_demo
 *
 * @author ruoyi
 * @date 2024-04-09
 */
@Data
@ExcelIgnoreUnannotated
public class TestDemoVo implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 主键
     */
    @ExcelProperty(value = "主键")
    private Long id;

    /**
     * 部门id
     */
    @ExcelProperty(value = "部门id")
    private Long deptId;

    /**
     * 用户id
     */
    @ExcelProperty(value = "用户id")
    private Long userId;

    /**
     * 排序号
     */
    @ExcelProperty(value = "排序号")
    private Long orderNum;

    /**
     * key键
     */
    @ExcelProperty(value = "key键")
    private String testKey;

    /**
     * 值
     */
    @ExcelProperty(value = "值")
    private String value;


}
