package com.training.server.system.entity;

import io.swagger.annotations.ApiModelProperty;

import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

/**
 * @author andy
 * @date 2021/12/1
 */
@Table(name = "sys_job")
public class Job extends BaseEntity {

    @Id
    @ApiModelProperty(value = "ID")
    @Column(name = "job_id")
    private Long id;

    @ApiModelProperty(value = "岗位名称")
    @NotBlank
    private String name;

    @ApiModelProperty(value = "岗位状态")
    @NotNull
    private Boolean enabled;

    @ApiModelProperty(value = "排序")
    private Integer jobSort;

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

    public Boolean getEnabled() {
        return enabled;
    }

    public void setEnabled(Boolean enabled) {
        this.enabled = enabled;
    }

    public Integer getJobSort() {
        return jobSort;
    }

    public void setJobSort(Integer jobSort) {
        this.jobSort = jobSort;
    }
}
