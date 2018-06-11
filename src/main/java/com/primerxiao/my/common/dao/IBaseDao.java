package com.primerxiao.my.common.dao;

import org.springframework.data.jpa.repository.JpaRepository;

public interface IBaseDao<T,ID> extends JpaRepository<T, ID> {
}
