package com.primerxiao.my.business.service;


import com.primerxiao.my.business.entity.TbGameZoneList;


import java.util.List;
import java.util.Optional;

/**
 * 处理类
 */
public interface IGameZoneListService {

    Optional<TbGameZoneList> getOne(Integer id);

    List<TbGameZoneList> getAll();

    TbGameZoneList insert(TbGameZoneList tbGameZoneList1);

    void flush();

    TbGameZoneList saveAndFlush(TbGameZoneList var1);

    void deleteInBatch(Iterable<TbGameZoneList> var1);


    void deleteAllInBatch();

    List<TbGameZoneList> findAllById();

}
