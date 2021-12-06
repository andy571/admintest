package com.training.server;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

import javax.persistence.Column;
import java.io.Serializable;
import java.time.LocalDateTime;

/**
 * @author andy
 * @date 2021/11/30
 */
public class BaseEntity implements Serializable {

    @Column(name = "create_time")
    private LocalDateTime createTime;

    @Column(name = "create_by")
    private Long createBy;

    @Column(name = "update_time")
    private LocalDateTime updateTime;

    @Column(name = "update_by")
    private Long updateBy;

    public LocalDateTime getCreateTime() {
        return createTime;
    }

    public void setCreateTime(LocalDateTime createTime) {
        this.createTime = createTime;
    }

    public Long getCreateBy() {
        return createBy;
    }

    public void setCreateBy(Long createBy) {
        this.createBy = createBy;
    }

    public LocalDateTime getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(LocalDateTime updateTime) {
        this.updateTime = updateTime;
    }

    public Long getUpdateBy() {
        return updateBy;
    }

    public void setUpdateBy(Long updateBy) {
        this.updateBy = updateBy;
    }

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this, ToStringStyle.DEFAULT_STYLE);
    }
}
