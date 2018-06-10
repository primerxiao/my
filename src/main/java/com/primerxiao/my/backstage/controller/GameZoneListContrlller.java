package com.primerxiao.my.backstage.controller;

import com.primerxiao.my.backstage.dao.CqActionRepository;
import com.primerxiao.my.backstage.entity.TbGameZoneList;
import com.primerxiao.my.backstage.entity.game.GameCqAction;
import com.primerxiao.my.backstage.service.IGameZoneListService;
import com.primerxiao.my.common.utils.EDCodeUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.web.PageableDefault;
import org.springframework.web.bind.annotation.*;

import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@RestController
@RequestMapping("/gameZoneList")
public class GameZoneListContrlller {

    @Autowired
    private IGameZoneListService gameZoneListService;


    @Autowired
    private CqActionRepository cqActionRepository;

    @RequestMapping("/search")
    public String search(@RequestParam(value = "id", required = false) Integer id) throws UnsupportedEncodingException {

        return this.gameZoneListService.getOne(id).toString();
    }

    @RequestMapping("/getAll")
    public List<TbGameZoneList> getAll() throws UnsupportedEncodingException {
        List<TbGameZoneList> all = this.gameZoneListService.getAll();

        for (TbGameZoneList tbGameZoneList : all) {
            System.out.println(tbGameZoneList.toString());
        }
        return all;
    }

    @RequestMapping("/insert")
    public TbGameZoneList insert() throws UnsupportedEncodingException {
        TbGameZoneList tbGameZoneList1 = new TbGameZoneList();
        tbGameZoneList1.setId(4);
        tbGameZoneList1.setCreateTime(new Date());
        tbGameZoneList1.setDataSourceId(1);
        //latin1
        //tbGameZoneList1.setName(new String("你".getBytes("gb2312"),"latin1"));

        tbGameZoneList1.setName("你");
        //tbGameZoneList1.setName(new String("你".getBytes("gb2312"),"latin1"));
        tbGameZoneList1.setStatus(1);
        TbGameZoneList insert = this.gameZoneListService.insert(tbGameZoneList1);

        return insert;
    }

    @RequestMapping("/saveAndFlush")
    public String saveAndFlush() {
        TbGameZoneList tbGameZoneList1 = new TbGameZoneList();
        tbGameZoneList1.setId(4);
        tbGameZoneList1.setCreateTime(new Date());
        tbGameZoneList1.setDataSourceId(1);
        tbGameZoneList1.setName("411111");
        tbGameZoneList1.setStatus(1);
        this.gameZoneListService.saveAndFlush(tbGameZoneList1);
        return "helloworld";
    }

    @RequestMapping("/deleteInBatch")
    public String deleteInBatch() {
        TbGameZoneList tbGameZoneList1 = new TbGameZoneList();
        tbGameZoneList1.setId(4);
        tbGameZoneList1.setCreateTime(new Date());
        tbGameZoneList1.setDataSourceId(1);
        tbGameZoneList1.setName("411111");
        tbGameZoneList1.setStatus(1);
        TbGameZoneList tbGameZoneList2 = new TbGameZoneList();
        tbGameZoneList2.setId(5);
        tbGameZoneList2.setCreateTime(new Date());
        tbGameZoneList2.setDataSourceId(1);
        tbGameZoneList2.setName("411111");
        tbGameZoneList2.setStatus(1);
        ArrayList<TbGameZoneList> tbGameZoneLists = new ArrayList<TbGameZoneList>();
        tbGameZoneLists.add(tbGameZoneList1);
        tbGameZoneLists.add(tbGameZoneList2);
        this.gameZoneListService.deleteInBatch(tbGameZoneLists);
        return "helloworld";
    }

    @RequestMapping("/deleteAllInBatch")
    public String deleteAllInBatch() {
        this.gameZoneListService.deleteAllInBatch();
        return "helloworld";
    }

    @RequestMapping("/findAllById")
    public List<TbGameZoneList> findAllById() {
        List<TbGameZoneList> allById = this.gameZoneListService.findAllById();
        return allById;
    }

    @RequestMapping(value = "/test")

    public List<GameCqAction> test(@PageableDefault(value = 15, sort = {"id"}, direction = Sort.Direction.ASC) Pageable pageable) throws UnsupportedEncodingException, IllegalAccessException, NoSuchFieldException {
        // List<GameCqAction> all = this.gameZoneListService.findAll();

        //EDCodeUtil.setDCode(all);
        Page<GameCqAction> all = cqActionRepository.findAll(pageable);
        List<GameCqAction> content = all.getContent();
        for (GameCqAction gameCqAction : content) {
            System.out.println(gameCqAction.toString());
        }
        EDCodeUtil.setDCode(content);
        return content;
    }

}
