package com.training.server.system.entity;

import io.mybatis.provider.Entity;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * @author andy
 * @date 2021/12/1
 */
@Entity.Table(value = "sys_role_menu")
@ApiModel(value="RoleMenu对象", description="角色菜单关联")
public class RoleMenu {

    @Entity.Column(value = "role_id")
    @ApiModelProperty(value = "角色ID")
    private Long roleId;

    @Entity.Column(value = "menu_id")
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
