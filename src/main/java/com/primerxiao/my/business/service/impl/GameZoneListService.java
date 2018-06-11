package com.primerxiao.my.business.service.impl;


import com.primerxiao.my.business.dao.GameZoneListRepository;
import com.primerxiao.my.business.entity.TbGameZoneList;
import com.primerxiao.my.business.service.IGameZoneListService;
import org.springframework.beans.factory.annotation.Autowired;
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




}
