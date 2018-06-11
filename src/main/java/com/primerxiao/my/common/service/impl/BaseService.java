package com.primerxiao.my.common.service.impl;

import com.primerxiao.my.common.dao.IBaseDao;
import com.primerxiao.my.common.service.IBaseService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.Optional;

public class BaseService<T,ID> implements IBaseService<T,ID> {


    @Autowired
    protected  IBaseDao<T,ID> baseDao;

    /**
     * 根据id查询对象
     * @param id 主键对象
     * @return
     */
    @Override
    public T findById(ID id){

        Optional<T> byId = this.baseDao.findById( id);
        return byId.orElse(null);
    }

}
