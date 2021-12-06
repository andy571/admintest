package com.training.server;

import java.util.List;

/**
 * @author andy
 * @date 2021/12/6
 */
public interface BaseConverter<E, D> {

    E toEntity(D dto);

    D toDto(E entity);

    List<E> toEntity(List<D> dtoList);

    List <D> toDto(List<E> entityList);

}
