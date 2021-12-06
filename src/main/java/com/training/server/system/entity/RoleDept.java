package com.training.server.system.entity;

import io.mybatis.provider.Entity;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * @author andy
 * @date 2021/12/1
 */
@Entity.Table(value = "sys_roles_depts")
@ApiModel(value="RolesDepts对象", description="角色部门关联")
public class RoleDept {

    @Entity.Column(value = "role_id")
    @ApiModelProperty(value = "角色ID")
    private Long roleId;

    @Entity.Column(value = "dept_id")
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
