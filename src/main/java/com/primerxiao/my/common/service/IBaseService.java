package com.primerxiao.my.common.service;

public interface IBaseService<T, ID> {
    T findById(ID id);
}
