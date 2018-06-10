package com.primerxiao.my.backstage.dao;


import com.primerxiao.my.backstage.entity.game.GameCqAction;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.PagingAndSortingRepository;

public interface CqActionRepository extends PagingAndSortingRepository<GameCqAction, Integer> {


}
