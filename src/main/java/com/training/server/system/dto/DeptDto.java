package com.training.server.system.dto;

import com.training.server.BaseDto;

import java.util.List;

/**
 * @author andy
 * @date 2021/12/2
 */
public class DeptDto extends BaseDto {

    private Long id;

    private String name;

    private Long pid;

    private Integer subCount;

    private Integer deptSort;

    private Boolean enabled;

    private List<DeptDto> children;



}
