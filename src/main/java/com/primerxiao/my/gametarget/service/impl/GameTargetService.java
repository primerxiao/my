package com.primerxiao.my.gametarget.service.impl;

import com.primerxiao.my.common.service.impl.BaseService;
import com.primerxiao.my.gametarget.dao.ICqActionDao;
import com.primerxiao.my.gametarget.entity.CqAction;
import com.primerxiao.my.gametarget.service.IGameTargetService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

/**
 * 目标游戏库的处理类
 */
@Service("gameTargetService")
public class GameTargetService extends BaseService<CqAction,Integer> implements IGameTargetService {


    @Autowired
    private ICqActionDao cqActionDao;

}
