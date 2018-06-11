package com.primerxiao.my.gametarget.entity;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "cq_task", schema = "newdb2")
public class CqTask {
    private int id;
    private int idNext;
    private int idNextfail;
    private String itemname1;
    private String itemname2;
    private int money;
    private int profession;
    private int sex;
    private int minPk;
    private int maxPk;
    private int team;
    private int metempsychosis;
    private byte query;
    private byte marriage;
    private byte clientActive;

    @Id
    @Column(name = "id")
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Basic
    @Column(name = "id_next")
    public int getIdNext() {
        return idNext;
    }

    public void setIdNext(int idNext) {
        this.idNext = idNext;
    }

    @Basic
    @Column(name = "id_nextfail")
    public int getIdNextfail() {
        return idNextfail;
    }

    public void setIdNextfail(int idNextfail) {
        this.idNextfail = idNextfail;
    }

    @Basic
    @Column(name = "itemname1")
    public String getItemname1() {
        return itemname1;
    }

    public void setItemname1(String itemname1) {
        this.itemname1 = itemname1;
    }

    @Basic
    @Column(name = "itemname2")
    public String getItemname2() {
        return itemname2;
    }

    public void setItemname2(String itemname2) {
        this.itemname2 = itemname2;
    }

    @Basic
    @Column(name = "money")
    public int getMoney() {
        return money;
    }

    public void setMoney(int money) {
        this.money = money;
    }

    @Basic
    @Column(name = "profession")
    public int getProfession() {
        return profession;
    }

    public void setProfession(int profession) {
        this.profession = profession;
    }

    @Basic
    @Column(name = "sex")
    public int getSex() {
        return sex;
    }

    public void setSex(int sex) {
        this.sex = sex;
    }

    @Basic
    @Column(name = "min_pk")
    public int getMinPk() {
        return minPk;
    }

    public void setMinPk(int minPk) {
        this.minPk = minPk;
    }

    @Basic
    @Column(name = "max_pk")
    public int getMaxPk() {
        return maxPk;
    }

    public void setMaxPk(int maxPk) {
        this.maxPk = maxPk;
    }

    @Basic
    @Column(name = "team")
    public int getTeam() {
        return team;
    }

    public void setTeam(int team) {
        this.team = team;
    }

    @Basic
    @Column(name = "metempsychosis")
    public int getMetempsychosis() {
        return metempsychosis;
    }

    public void setMetempsychosis(int metempsychosis) {
        this.metempsychosis = metempsychosis;
    }

    @Basic
    @Column(name = "query")
    public byte getQuery() {
        return query;
    }

    public void setQuery(byte query) {
        this.query = query;
    }

    @Basic
    @Column(name = "marriage")
    public byte getMarriage() {
        return marriage;
    }

    public void setMarriage(byte marriage) {
        this.marriage = marriage;
    }

    @Basic
    @Column(name = "client_active")
    public byte getClientActive() {
        return clientActive;
    }

    public void setClientActive(byte clientActive) {
        this.clientActive = clientActive;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        CqTask cqTask = (CqTask) o;
        return id == cqTask.id &&
                idNext == cqTask.idNext &&
                idNextfail == cqTask.idNextfail &&
                money == cqTask.money &&
                profession == cqTask.profession &&
                sex == cqTask.sex &&
                minPk == cqTask.minPk &&
                maxPk == cqTask.maxPk &&
                team == cqTask.team &&
                metempsychosis == cqTask.metempsychosis &&
                query == cqTask.query &&
                marriage == cqTask.marriage &&
                clientActive == cqTask.clientActive &&
                Objects.equals(itemname1, cqTask.itemname1) &&
                Objects.equals(itemname2, cqTask.itemname2);
    }

    @Override
    public int hashCode() {

        return Objects.hash(id, idNext, idNextfail, itemname1, itemname2, money, profession, sex, minPk, maxPk, team, metempsychosis, query, marriage, clientActive);
    }
}
