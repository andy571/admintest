package com.training.server.system.entity;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.persistence.Column;
import javax.persistence.Table;

/**
 * @author andy
 * @date 2021/12/1
 */
@Table(name = "sys_user_role")
@ApiModel(value="UserRole对象", description="用户角色关联")
public class UserRole {

    @Column(name = "user_id")
    @ApiModelProperty(value = "用户ID")
    private Long userId;

    @Column(name = "role_id")
    @ApiModelProperty(value = "角色ID")
    private Long roleId;

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public Long getRoleId() {
        return roleId;
    }

    public void setRoleId(Long roleId) {
        this.roleId = roleId;
    }
}
