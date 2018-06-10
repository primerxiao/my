package com.primerxiao.my.backstage.service.impl;


import com.primerxiao.my.backstage.dao.CqActionRepository;
import com.primerxiao.my.backstage.dao.GameZoneListRepository;

import com.primerxiao.my.backstage.entity.TbGameZoneList;
import com.primerxiao.my.backstage.entity.game.GameCqAction;
import com.primerxiao.my.backstage.service.IGameZoneListService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;


/**
 * @author primerxiao
 */
@Service
public class GameZoneListService implements IGameZoneListService {
    @Autowired
    private GameZoneListRepository gameZoneListRepository;
    @Autowired
    private CqActionRepository cqActionRepository;

    /**
     * 根据主键查询出对象
     */
    @Override
    public Optional<TbGameZoneList> getOne(Integer id) {
        TbGameZoneList tbGameZoneList = new TbGameZoneList();
        tbGameZoneList.setId(1);

        return this.gameZoneListRepository.findById(id);
    }

    @Override
    public List<TbGameZoneList> getAll() {
        return this.gameZoneListRepository.findAll();
    }

    @Override
    public TbGameZoneList insert(TbGameZoneList po) {
        return this.gameZoneListRepository.save(po);
    }

    @Override
    public GameCqAction insert(GameCqAction cqAction) {
        return this.cqActionRepository.save(cqAction);
    }

    @Override
    public void flush() {

        this.flush();
    }

    @Override
    public TbGameZoneList saveAndFlush(TbGameZoneList var1) {
        return this.saveAndFlush(var1);
    }

    @Override
    public void deleteInBatch(Iterable<TbGameZoneList> var1) {
        this.gameZoneListRepository.deleteInBatch(var1);
    }

    @Override
    public void deleteAllInBatch() {

        this.gameZoneListRepository.deleteAllInBatch();
    }

    @Override
    public List<TbGameZoneList> findAllById() {

        ArrayList<Integer> tbGameZoneLists = new ArrayList<Integer>();
        tbGameZoneLists.add(new Integer("1"));
        tbGameZoneLists.add(new Integer("2"));
        return this.gameZoneListRepository.findAllById(tbGameZoneLists);
    }

    @Override
    public List<GameCqAction> findAll() {
        long count = this.cqActionRepository.count();
        System.out.println(count);
        //return this.cqActionRepository.findAll();
        return null;
    }


}
