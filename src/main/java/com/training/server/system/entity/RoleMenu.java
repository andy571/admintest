package com.training.server.system.entity;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.persistence.Column;
import javax.persistence.Table;

/**
 * @author andy
 * @date 2021/12/1
 */
@Table(name = "sys_role_menu")
@ApiModel(value="RoleMenu对象", description="角色菜单关联")
public class RoleMenu {

    @Column(name = "role_id")
    @ApiModelProperty(value = "角色ID")
    private Long roleId;

    @Column(name = "menu_id")
    @ApiModelProperty(value = "部门ID")
    private Long menuId;

    public Long getRoleId() {
        return roleId;
    }

    public void setRoleId(Long roleId) {
        this.roleId = roleId;
    }

    public Long getMenuId() {
        return menuId;
    }

    public void setMenuId(Long menuId) {
        this.menuId = menuId;
    }
}
