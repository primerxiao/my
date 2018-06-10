package com.primerxiao.my.backstage.service;


import com.primerxiao.my.backstage.entity.TbGameZoneList;
import com.primerxiao.my.backstage.entity.game.GameCqAction;

import java.util.List;
import java.util.Optional;

/**
 * 处理类
 */
public interface IGameZoneListService {

    Optional<TbGameZoneList> getOne(Integer id);

    List<TbGameZoneList> getAll();

    TbGameZoneList insert(TbGameZoneList tbGameZoneList1);

    GameCqAction insert(GameCqAction cqAction);

    void flush();

    TbGameZoneList saveAndFlush(TbGameZoneList var1);

    void deleteInBatch(Iterable<TbGameZoneList> var1);


    void deleteAllInBatch();

    List<TbGameZoneList> findAllById();

    List<GameCqAction> findAll();
}
