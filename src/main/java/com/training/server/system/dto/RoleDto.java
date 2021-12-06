package com.training.server.system.dto;

import com.training.server.BaseDto;

/**
 * @author andy
 * @date 2021/12/2
 */
public class RoleDto extends BaseDto {

    private Long id;

    private String name;

//    @ApiModelProperty(value =e "数据权限，全部 、 本级 、 自定义")
////    private String dataScop = DataScopeEnum.THIS_LEVEL.getValue();

    private Integer level;

    private String description;

    private MenuDto menu;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getLevel() {
        return level;
    }

    public void setLevel(Integer level) {
        this.level = level;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public MenuDto getMenu() {
        return menu;
    }

    public void setMenu(MenuDto menu) {
        this.menu = menu;
    }
}
