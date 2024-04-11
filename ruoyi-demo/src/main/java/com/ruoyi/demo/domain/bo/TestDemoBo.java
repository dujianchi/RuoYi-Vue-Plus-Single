package com.ruoyi.demo.domain.bo;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.ruoyi.common.core.domain.BaseEntity;
import com.ruoyi.common.core.validate.AddGroup;
import com.ruoyi.common.core.validate.EditGroup;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * 测试单业务对象 test_demo
 *
 * @author ruoyi
 * @date 2024-04-11
 */

@Data
@EqualsAndHashCode(callSuper = true)
public class TestDemoBo extends BaseEntity {

    /**
     * 主键
     */
    @NotNull(message = "主键不能为空", groups = { EditGroup.class })
    @JsonProperty(value = "id")
    private Long id;

    /**
     * 部门id
     */
    @NotNull(message = "部门id不能为空", groups = { AddGroup.class, EditGroup.class })
    @JsonProperty(value = "deptId")
    private Long deptId;

    /**
     * 用户id
     */
    @NotNull(message = "用户id不能为空", groups = { AddGroup.class, EditGroup.class })
    @JsonProperty(value = "userId")
    private Long userId;

    /**
     * 排序号
     */
    @NotNull(message = "排序号不能为空", groups = { AddGroup.class, EditGroup.class })
    @JsonProperty(value = "orderNum")
    private Long orderNum;

    /**
     * key键
     */
    @NotBlank(message = "key键不能为空", groups = { AddGroup.class, EditGroup.class })
    @JsonProperty(value = "testKey")
    private String testKey;

    /**
     * 值
     */
    @NotBlank(message = "值不能为空", groups = { AddGroup.class, EditGroup.class })
    @JsonProperty(value = "value")
    private String value;


}
