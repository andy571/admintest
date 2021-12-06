package com.training.server.system.mapper;

import com.training.server.system.entity.Job;
import io.mybatis.mapper.Mapper;

/**
 * @author andy
 * @date 2021/11/30
 */
@org.apache.ibatis.annotations.Mapper
public interface JobMapper extends Mapper<Job, Long> {
}
