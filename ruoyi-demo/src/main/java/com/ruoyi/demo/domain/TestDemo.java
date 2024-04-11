package com.ruoyi.demo.domain;

import com.baomidou.mybatisplus.annotation.*;
import com.ruoyi.common.core.domain.BaseEntity;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * 测试单对象 test_demo
 *
 * @author ruoyi
 * @date 2024-04-11
 */
@Data
@EqualsAndHashCode(callSuper = true)
@TableName("test_demo")
public class TestDemo extends BaseEntity {

    private static final long serialVersionUID=1L;

    /**
     * 主键
     */
    @TableId(value = "`id`")
    private Long id;
    /**
     * 部门id
     */
    @TableField(value = "`dept_id`")
    private Long deptId;
    /**
     * 用户id
     */
    @TableField(value = "`user_id`")
    private Long userId;
    /**
     * 排序号
     */
    @TableField(value = "`order_num`")
    private Long orderNum;
    /**
     * key键
     */
    @TableField(value = "`test_key`")
    private String testKey;
    /**
     * 值
     */
    @TableField(value = "`value`")
    private String value;
    /**
     * 版本
     */
    @Version
    @TableField(value = "`version`")
    private Long version;
    /**
     * 删除标志
     */
    @TableLogic
    @TableField(value = "`del_flag`")
    private Long delFlag;

}
