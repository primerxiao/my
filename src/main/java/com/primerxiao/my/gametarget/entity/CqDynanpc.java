package com.primerxiao.my.gametarget.entity;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "cq_dynanpc", schema = "newdb2")
public class CqDynanpc {
    private int id;
    private int ownerid;
    private byte ownertype;
    private String name;
    private short type;
    private int lookface;
    private byte length;
    private byte fat;
    private byte idxserver;
    private int mapid;
    private short cellx;
    private short celly;
    private int task0;
    private int task1;
    private int task2;
    private int task3;
    private int task4;
    private int task5;
    private int task6;
    private int task7;
    private int data0;
    private int data1;
    private int data2;
    private int data3;
    private String datastr;
    private int linkid;
    private int life;
    private int maxlife;
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
    public int getOwnerid() {
        return ownerid;
    }

    public void setOwnerid(int ownerid) {
        this.ownerid = ownerid;
    }

    @Basic
    @Column(name = "ownertype")
    public byte getOwnertype() {
        return ownertype;
    }

    public void setOwnertype(byte ownertype) {
        this.ownertype = ownertype;
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
    public short getType() {
        return type;
    }

    public void setType(short type) {
        this.type = type;
    }

    @Basic
    @Column(name = "lookface")
    public int getLookface() {
        return lookface;
    }

    public void setLookface(int lookface) {
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
    public byte getIdxserver() {
        return idxserver;
    }

    public void setIdxserver(byte idxserver) {
        this.idxserver = idxserver;
    }

    @Basic
    @Column(name = "mapid")
    public int getMapid() {
        return mapid;
    }

    public void setMapid(int mapid) {
        this.mapid = mapid;
    }

    @Basic
    @Column(name = "cellx")
    public short getCellx() {
        return cellx;
    }

    public void setCellx(short cellx) {
        this.cellx = cellx;
    }

    @Basic
    @Column(name = "celly")
    public short getCelly() {
        return celly;
    }

    public void setCelly(short celly) {
        this.celly = celly;
    }

    @Basic
    @Column(name = "task0")
    public int getTask0() {
        return task0;
    }

    public void setTask0(int task0) {
        this.task0 = task0;
    }

    @Basic
    @Column(name = "task1")
    public int getTask1() {
        return task1;
    }

    public void setTask1(int task1) {
        this.task1 = task1;
    }

    @Basic
    @Column(name = "task2")
    public int getTask2() {
        return task2;
    }

    public void setTask2(int task2) {
        this.task2 = task2;
    }

    @Basic
    @Column(name = "task3")
    public int getTask3() {
        return task3;
    }

    public void setTask3(int task3) {
        this.task3 = task3;
    }

    @Basic
    @Column(name = "task4")
    public int getTask4() {
        return task4;
    }

    public void setTask4(int task4) {
        this.task4 = task4;
    }

    @Basic
    @Column(name = "task5")
    public int getTask5() {
        return task5;
    }

    public void setTask5(int task5) {
        this.task5 = task5;
    }

    @Basic
    @Column(name = "task6")
    public int getTask6() {
        return task6;
    }

    public void setTask6(int task6) {
        this.task6 = task6;
    }

    @Basic
    @Column(name = "task7")
    public int getTask7() {
        return task7;
    }

    public void setTask7(int task7) {
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
    public int getLife() {
        return life;
    }

    public void setLife(int life) {
        this.life = life;
    }

    @Basic
    @Column(name = "maxlife")
    public int getMaxlife() {
        return maxlife;
    }

    public void setMaxlife(int maxlife) {
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
        CqDynanpc cqDynanpc = (CqDynanpc) o;
        return id == cqDynanpc.id &&
                ownerid == cqDynanpc.ownerid &&
                ownertype == cqDynanpc.ownertype &&
                type == cqDynanpc.type &&
                lookface == cqDynanpc.lookface &&
                length == cqDynanpc.length &&
                fat == cqDynanpc.fat &&
                idxserver == cqDynanpc.idxserver &&
                mapid == cqDynanpc.mapid &&
                cellx == cqDynanpc.cellx &&
                celly == cqDynanpc.celly &&
                task0 == cqDynanpc.task0 &&
                task1 == cqDynanpc.task1 &&
                task2 == cqDynanpc.task2 &&
                task3 == cqDynanpc.task3 &&
                task4 == cqDynanpc.task4 &&
                task5 == cqDynanpc.task5 &&
                task6 == cqDynanpc.task6 &&
                task7 == cqDynanpc.task7 &&
                data0 == cqDynanpc.data0 &&
                data1 == cqDynanpc.data1 &&
                data2 == cqDynanpc.data2 &&
                data3 == cqDynanpc.data3 &&
                linkid == cqDynanpc.linkid &&
                life == cqDynanpc.life &&
                maxlife == cqDynanpc.maxlife &&
                base == cqDynanpc.base &&
                sort == cqDynanpc.sort &&
                itemid == cqDynanpc.itemid &&
                sizeFront == cqDynanpc.sizeFront &&
                sizeBack == cqDynanpc.sizeBack &&
                sizeLeft == cqDynanpc.sizeLeft &&
                sizeRight == cqDynanpc.sizeRight &&
                defence == cqDynanpc.defence &&
                magicDef == cqDynanpc.magicDef &&
                initialPrice == cqDynanpc.initialPrice &&
                price == cqDynanpc.price &&
                deposit == cqDynanpc.deposit &&
                buyRatio == cqDynanpc.buyRatio &&
                feeType == cqDynanpc.feeType &&
                incomeValue == cqDynanpc.incomeValue &&
                preferential == cqDynanpc.preferential &&
                harvestDate == cqDynanpc.harvestDate &&
                Objects.equals(name, cqDynanpc.name) &&
                Objects.equals(datastr, cqDynanpc.datastr) &&
                Objects.equals(ownerName, cqDynanpc.ownerName) &&
                Objects.equals(defaultOwnerName, cqDynanpc.defaultOwnerName);
    }

    @Override
    public int hashCode() {

        return Objects.hash(id, ownerid, ownertype, name, type, lookface, length, fat, idxserver, mapid, cellx, celly, task0, task1, task2, task3, task4, task5, task6, task7, data0, data1, data2, data3, datastr, linkid, life, maxlife, base, sort, itemid, sizeFront, sizeBack, sizeLeft, sizeRight, defence, magicDef, ownerName, defaultOwnerName, initialPrice, price, deposit, buyRatio, feeType, incomeValue, preferential, harvestDate);
    }
}
