package com.training.server.system.entity;

import com.training.server.BaseEntity;
import io.mybatis.provider.Entity;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

/**
 * @author andy
 * @date 2021/12/1
 */
@Entity.Table(value = "sys_role")
public class Role extends BaseEntity {

    @Entity.Column(id = true, value = "role_id")
    @NotNull
    @ApiModelProperty(value = "ID", hidden = true)
    private Long id;

    @NotBlank
    @ApiModelProperty(value = "名称", hidden = true)
    private String name;

//    @ApiModelProperty(value =e "数据权限，全部 、 本级 、 自定义")
////    private String dataScop = DataScopeEnum.THIS_LEVEL.getValue();

    @ApiModelProperty(value = "级别，数值越小，级别越大")
    private Integer level = 3;

    @ApiModelProperty(value = "描述")
    private String description;

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
}
