package com.training.server.system.entity;

import com.training.server.BaseEntity;
import io.swagger.annotations.ApiModelProperty;

import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

/**
 * @author andy
 * @date 2021/12/1
 */
@Table(name = "sys_menu")
public class Menu extends BaseEntity {

    @Id
    @Column(name = "menu_id")
    @NotNull
    @ApiModelProperty(value = "ID", hidden = true)
    private Long id;

    @ApiModelProperty(value = "菜单标题")
    private String title;

    @Column(name = "name")
    @ApiModelProperty(value = "菜单组件名称")
    private String componentName;

    @ApiModelProperty(value = "排序")
    private Integer menuSort = 999;

    @ApiModelProperty(value = "组件路径")
    private String component;

    @ApiModelProperty(value = "路由地址")
    private String path;

    @ApiModelProperty(value = "菜单类型，目录、菜单、按钮")
    private Integer type;

    @ApiModelProperty(value = "权限标识")
    private String permission;

    @ApiModelProperty(value = "菜单图标")
    private String icon;

    @ApiModelProperty(value = "上级菜单")
    private Long pid;

    @ApiModelProperty(value = "是否隐藏")
    private Boolean hidden;

    @ApiModelProperty(value = "外链菜单")
    private Boolean iFrame;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getComponentName() {
        return componentName;
    }

    public void setComponentName(String componentName) {
        this.componentName = componentName;
    }

    public Integer getMenuSort() {
        return menuSort;
    }

    public void setMenuSort(Integer menuSort) {
        this.menuSort = menuSort;
    }

    public String getComponent() {
        return component;
    }

    public void setComponent(String component) {
        this.component = component;
    }

    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }

    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
    }

    public String getPermission() {
        return permission;
    }

    public void setPermission(String permission) {
        this.permission = permission;
    }

    public String getIcon() {
        return icon;
    }

    public void setIcon(String icon) {
        this.icon = icon;
    }

    public Long getPid() {
        return pid;
    }

    public void setPid(Long pid) {
        this.pid = pid;
    }

    public Boolean getHidden() {
        return hidden;
    }

    public void setHidden(Boolean hidden) {
        this.hidden = hidden;
    }

    public Boolean getiFrame() {
        return iFrame;
    }

    public void setiFrame(Boolean iFrame) {
        this.iFrame = iFrame;
    }
}
