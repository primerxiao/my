package com.primerxiao.my.backstage.dao;


import com.primerxiao.my.backstage.entity.TbGameZoneList;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.ArrayList;

/**
 * @author primerxiao
 */
public interface GameZoneListRepository extends JpaRepository<TbGameZoneList, Integer> {


}