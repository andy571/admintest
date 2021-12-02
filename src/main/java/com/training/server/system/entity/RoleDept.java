package com.training.server.system.entity;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.persistence.Column;
import javax.persistence.Table;

/**
 * @author andy
 * @date 2021/12/1
 */
@Table(name = "sys_roles_depts")
@ApiModel(value="RolesDepts对象", description="角色部门关联")
public class RoleDept {

    @Column(name = "role_id")
    @ApiModelProperty(value = "角色ID")
    private Long roleId;

    @Column(name = "dept_id")
    @ApiModelProperty(value = "部门ID")
    private Long deptId;

    public Long getRoleId() {
        return roleId;
    }

    public void setRoleId(Long roleId) {
        this.roleId = roleId;
    }

    public Long getDeptId() {
        return deptId;
    }

    public void setDeptId(Long deptId) {
        this.deptId = deptId;
    }
}
