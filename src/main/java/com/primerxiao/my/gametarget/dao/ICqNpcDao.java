package com.primerxiao.my.gametarget.dao;

import com.primerxiao.my.gametarget.entity.CqAction;
import com.primerxiao.my.gametarget.entity.CqNpc;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ICqNpcDao extends JpaRepository<CqNpc, Integer> {
}
