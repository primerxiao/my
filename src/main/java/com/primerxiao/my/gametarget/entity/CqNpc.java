package com.primerxiao.my.gametarget.entity;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "cq_npc", schema = "newdb2")
public class CqNpc {
    private int id;
    private Integer ownerid;
    private Integer playerid;
    private String name;
    private Integer type;
    private Integer lookface;
    private byte length;
    private byte fat;
    private Integer idxserver;
    private Integer mapid;
    private Integer cellx;
    private Integer celly;
    private Integer task0;
    private Integer task1;
    private Integer task2;
    private Integer task3;
    private Integer task4;
    private Integer task5;
    private Integer task6;
    private Integer task7;
    private int data0;
    private int data1;
    private int data2;
    private int data3;
    private String datastr;
    private int linkid;
    private short life;
    private short maxlife;
    private int base;
    private short sort;
    private int itemid;
    private short sizeFront;
    private short sizeBack;
    private short sizeLeft;
    private short sizeRight;
    private short defence;
    private short magicDef;
    private String ownerName;
    private String defaultOwnerName;
    private int initialPrice;
    private long price;
    private long deposit;
    private int buyRatio;
    private byte feeType;
    private short incomeValue;
    private byte preferential;
    private int harvestDate;

    @Id
    @Column(name = "id")
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Basic
    @Column(name = "ownerid")
    public Integer getOwnerid() {
        return ownerid;
    }

    public void setOwnerid(Integer ownerid) {
        this.ownerid = ownerid;
    }

    @Basic
    @Column(name = "playerid")
    public Integer getPlayerid() {
        return playerid;
    }

    public void setPlayerid(Integer playerid) {
        this.playerid = playerid;
    }

    @Basic
    @Column(name = "name")
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Basic
    @Column(name = "type")
    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
    }

    @Basic
    @Column(name = "lookface")
    public Integer getLookface() {
        return lookface;
    }

    public void setLookface(Integer lookface) {
        this.lookface = lookface;
    }

    @Basic
    @Column(name = "length")
    public byte getLength() {
        return length;
    }

    public void setLength(byte length) {
        this.length = length;
    }

    @Basic
    @Column(name = "fat")
    public byte getFat() {
        return fat;
    }

    public void setFat(byte fat) {
        this.fat = fat;
    }

    @Basic
    @Column(name = "idxserver")
    public Integer getIdxserver() {
        return idxserver;
    }

    public void setIdxserver(Integer idxserver) {
        this.idxserver = idxserver;
    }

    @Basic
    @Column(name = "mapid")
    public Integer getMapid() {
        return mapid;
    }

    public void setMapid(Integer mapid) {
        this.mapid = mapid;
    }

    @Basic
    @Column(name = "cellx")
    public Integer getCellx() {
        return cellx;
    }

    public void setCellx(Integer cellx) {
        this.cellx = cellx;
    }

    @Basic
    @Column(name = "celly")
    public Integer getCelly() {
        return celly;
    }

    public void setCelly(Integer celly) {
        this.celly = celly;
    }

    @Basic
    @Column(name = "task0")
    public Integer getTask0() {
        return task0;
    }

    public void setTask0(Integer task0) {
        this.task0 = task0;
    }

    @Basic
    @Column(name = "task1")
    public Integer getTask1() {
        return task1;
    }

    public void setTask1(Integer task1) {
        this.task1 = task1;
    }

    @Basic
    @Column(name = "task2")
    public Integer getTask2() {
        return task2;
    }

    public void setTask2(Integer task2) {
        this.task2 = task2;
    }

    @Basic
    @Column(name = "task3")
    public Integer getTask3() {
        return task3;
    }

    public void setTask3(Integer task3) {
        this.task3 = task3;
    }

    @Basic
    @Column(name = "task4")
    public Integer getTask4() {
        return task4;
    }

    public void setTask4(Integer task4) {
        this.task4 = task4;
    }

    @Basic
    @Column(name = "task5")
    public Integer getTask5() {
        return task5;
    }

    public void setTask5(Integer task5) {
        this.task5 = task5;
    }

    @Basic
    @Column(name = "task6")
    public Integer getTask6() {
        return task6;
    }

    public void setTask6(Integer task6) {
        this.task6 = task6;
    }

    @Basic
    @Column(name = "task7")
    public Integer getTask7() {
        return task7;
    }

    public void setTask7(Integer task7) {
        this.task7 = task7;
    }

    @Basic
    @Column(name = "data0")
    public int getData0() {
        return data0;
    }

    public void setData0(int data0) {
        this.data0 = data0;
    }

    @Basic
    @Column(name = "data1")
    public int getData1() {
        return data1;
    }

    public void setData1(int data1) {
        this.data1 = data1;
    }

    @Basic
    @Column(name = "data2")
    public int getData2() {
        return data2;
    }

    public void setData2(int data2) {
        this.data2 = data2;
    }

    @Basic
    @Column(name = "data3")
    public int getData3() {
        return data3;
    }

    public void setData3(int data3) {
        this.data3 = data3;
    }

    @Basic
    @Column(name = "datastr")
    public String getDatastr() {
        return datastr;
    }

    public void setDatastr(String datastr) {
        this.datastr = datastr;
    }

    @Basic
    @Column(name = "linkid")
    public int getLinkid() {
        return linkid;
    }

    public void setLinkid(int linkid) {
        this.linkid = linkid;
    }

    @Basic
    @Column(name = "life")
    public short getLife() {
        return life;
    }

    public void setLife(short life) {
        this.life = life;
    }

    @Basic
    @Column(name = "maxlife")
    public short getMaxlife() {
        return maxlife;
    }

    public void setMaxlife(short maxlife) {
        this.maxlife = maxlife;
    }

    @Basic
    @Column(name = "base")
    public int getBase() {
        return base;
    }

    public void setBase(int base) {
        this.base = base;
    }

    @Basic
    @Column(name = "sort")
    public short getSort() {
        return sort;
    }

    public void setSort(short sort) {
        this.sort = sort;
    }

    @Basic
    @Column(name = "itemid")
    public int getItemid() {
        return itemid;
    }

    public void setItemid(int itemid) {
        this.itemid = itemid;
    }

    @Basic
    @Column(name = "size_front")
    public short getSizeFront() {
        return sizeFront;
    }

    public void setSizeFront(short sizeFront) {
        this.sizeFront = sizeFront;
    }

    @Basic
    @Column(name = "size_back")
    public short getSizeBack() {
        return sizeBack;
    }

    public void setSizeBack(short sizeBack) {
        this.sizeBack = sizeBack;
    }

    @Basic
    @Column(name = "size_left")
    public short getSizeLeft() {
        return sizeLeft;
    }

    public void setSizeLeft(short sizeLeft) {
        this.sizeLeft = sizeLeft;
    }

    @Basic
    @Column(name = "size_right")
    public short getSizeRight() {
        return sizeRight;
    }

    public void setSizeRight(short sizeRight) {
        this.sizeRight = sizeRight;
    }

    @Basic
    @Column(name = "defence")
    public short getDefence() {
        return defence;
    }

    public void setDefence(short defence) {
        this.defence = defence;
    }

    @Basic
    @Column(name = "magic_def")
    public short getMagicDef() {
        return magicDef;
    }

    public void setMagicDef(short magicDef) {
        this.magicDef = magicDef;
    }

    @Basic
    @Column(name = "owner_name")
    public String getOwnerName() {
        return ownerName;
    }

    public void setOwnerName(String ownerName) {
        this.ownerName = ownerName;
    }

    @Basic
    @Column(name = "default_owner_name")
    public String getDefaultOwnerName() {
        return defaultOwnerName;
    }

    public void setDefaultOwnerName(String defaultOwnerName) {
        this.defaultOwnerName = defaultOwnerName;
    }

    @Basic
    @Column(name = "initial_price")
    public int getInitialPrice() {
        return initialPrice;
    }

    public void setInitialPrice(int initialPrice) {
        this.initialPrice = initialPrice;
    }

    @Basic
    @Column(name = "price")
    public long getPrice() {
        return price;
    }

    public void setPrice(long price) {
        this.price = price;
    }

    @Basic
    @Column(name = "deposit")
    public long getDeposit() {
        return deposit;
    }

    public void setDeposit(long deposit) {
        this.deposit = deposit;
    }

    @Basic
    @Column(name = "buy_ratio")
    public int getBuyRatio() {
        return buyRatio;
    }

    public void setBuyRatio(int buyRatio) {
        this.buyRatio = buyRatio;
    }

    @Basic
    @Column(name = "fee_type")
    public byte getFeeType() {
        return feeType;
    }

    public void setFeeType(byte feeType) {
        this.feeType = feeType;
    }

    @Basic
    @Column(name = "income_value")
    public short getIncomeValue() {
        return incomeValue;
    }

    public void setIncomeValue(short incomeValue) {
        this.incomeValue = incomeValue;
    }

    @Basic
    @Column(name = "preferential")
    public byte getPreferential() {
        return preferential;
    }

    public void setPreferential(byte preferential) {
        this.preferential = preferential;
    }

    @Basic
    @Column(name = "harvest_date")
    public int getHarvestDate() {
        return harvestDate;
    }

    public void setHarvestDate(int harvestDate) {
        this.harvestDate = harvestDate;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        CqNpc cqNpc = (CqNpc) o;
        return id == cqNpc.id &&
                length == cqNpc.length &&
                fat == cqNpc.fat &&
                data0 == cqNpc.data0 &&
                data1 == cqNpc.data1 &&
                data2 == cqNpc.data2 &&
                data3 == cqNpc.data3 &&
                linkid == cqNpc.linkid &&
                life == cqNpc.life &&
                maxlife == cqNpc.maxlife &&
                base == cqNpc.base &&
                sort == cqNpc.sort &&
                itemid == cqNpc.itemid &&
                sizeFront == cqNpc.sizeFront &&
                sizeBack == cqNpc.sizeBack &&
                sizeLeft == cqNpc.sizeLeft &&
                sizeRight == cqNpc.sizeRight &&
                defence == cqNpc.defence &&
                magicDef == cqNpc.magicDef &&
                initialPrice == cqNpc.initialPrice &&
                price == cqNpc.price &&
                deposit == cqNpc.deposit &&
                buyRatio == cqNpc.buyRatio &&
                feeType == cqNpc.feeType &&
                incomeValue == cqNpc.incomeValue &&
                preferential == cqNpc.preferential &&
                harvestDate == cqNpc.harvestDate &&
                Objects.equals(ownerid, cqNpc.ownerid) &&
                Objects.equals(playerid, cqNpc.playerid) &&
                Objects.equals(name, cqNpc.name) &&
                Objects.equals(type, cqNpc.type) &&
                Objects.equals(lookface, cqNpc.lookface) &&
                Objects.equals(idxserver, cqNpc.idxserver) &&
                Objects.equals(mapid, cqNpc.mapid) &&
                Objects.equals(cellx, cqNpc.cellx) &&
                Objects.equals(celly, cqNpc.celly) &&
                Objects.equals(task0, cqNpc.task0) &&
                Objects.equals(task1, cqNpc.task1) &&
                Objects.equals(task2, cqNpc.task2) &&
                Objects.equals(task3, cqNpc.task3) &&
                Objects.equals(task4, cqNpc.task4) &&
                Objects.equals(task5, cqNpc.task5) &&
                Objects.equals(task6, cqNpc.task6) &&
                Objects.equals(task7, cqNpc.task7) &&
                Objects.equals(datastr, cqNpc.datastr) &&
                Objects.equals(ownerName, cqNpc.ownerName) &&
                Objects.equals(defaultOwnerName, cqNpc.defaultOwnerName);
    }

    @Override
    public int hashCode() {

        return Objects.hash(id, ownerid, playerid, name, type, lookface, length, fat, idxserver, mapid, cellx, celly, task0, task1, task2, task3, task4, task5, task6, task7, data0, data1, data2, data3, datastr, linkid, life, maxlife, base, sort, itemid, sizeFront, sizeBack, sizeLeft, sizeRight, defence, magicDef, ownerName, defaultOwnerName, initialPrice, price, deposit, buyRatio, feeType, incomeValue, preferential, harvestDate);
    }
}
