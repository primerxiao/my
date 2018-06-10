package com.primerxiao.my.backstage.entity.game;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "cq_newtaskdetail", schema = "business")
public class GameCqNewtaskdetail {
    private int id;
    private int userid;
    private int taskid;
    private int taskphase;
    private byte taskcomplete;
    private int taskbegintime;
    private int completeTimes;
    private int data1;
    private int data2;
    private int data3;
    private int data4;
    private int data5;
    private int data6;
    private int data7;
    private int data8;
    private int data9;
    private int data10;

    @Id
    @Column(name = "id")
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Basic
    @Column(name = "userid")
    public int getUserid() {
        return userid;
    }

    public void setUserid(int userid) {
        this.userid = userid;
    }

    @Basic
    @Column(name = "taskid")
    public int getTaskid() {
        return taskid;
    }

    public void setTaskid(int taskid) {
        this.taskid = taskid;
    }

    @Basic
    @Column(name = "taskphase")
    public int getTaskphase() {
        return taskphase;
    }

    public void setTaskphase(int taskphase) {
        this.taskphase = taskphase;
    }

    @Basic
    @Column(name = "taskcomplete")
    public byte getTaskcomplete() {
        return taskcomplete;
    }

    public void setTaskcomplete(byte taskcomplete) {
        this.taskcomplete = taskcomplete;
    }

    @Basic
    @Column(name = "taskbegintime")
    public int getTaskbegintime() {
        return taskbegintime;
    }

    public void setTaskbegintime(int taskbegintime) {
        this.taskbegintime = taskbegintime;
    }

    @Basic
    @Column(name = "complete_times")
    public int getCompleteTimes() {
        return completeTimes;
    }

    public void setCompleteTimes(int completeTimes) {
        this.completeTimes = completeTimes;
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
    @Column(name = "data4")
    public int getData4() {
        return data4;
    }

    public void setData4(int data4) {
        this.data4 = data4;
    }

    @Basic
    @Column(name = "data5")
    public int getData5() {
        return data5;
    }

    public void setData5(int data5) {
        this.data5 = data5;
    }

    @Basic
    @Column(name = "data6")
    public int getData6() {
        return data6;
    }

    public void setData6(int data6) {
        this.data6 = data6;
    }

    @Basic
    @Column(name = "data7")
    public int getData7() {
        return data7;
    }

    public void setData7(int data7) {
        this.data7 = data7;
    }

    @Basic
    @Column(name = "data8")
    public int getData8() {
        return data8;
    }

    public void setData8(int data8) {
        this.data8 = data8;
    }

    @Basic
    @Column(name = "data9")
    public int getData9() {
        return data9;
    }

    public void setData9(int data9) {
        this.data9 = data9;
    }

    @Basic
    @Column(name = "data10")
    public int getData10() {
        return data10;
    }

    public void setData10(int data10) {
        this.data10 = data10;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {

            return true;
        }
        if (o == null || getClass() != o.getClass()) {

            return false;
        }
        GameCqNewtaskdetail that = (GameCqNewtaskdetail) o;
        return id == that.id &&
                userid == that.userid &&
                taskid == that.taskid &&
                taskphase == that.taskphase &&
                taskcomplete == that.taskcomplete &&
                taskbegintime == that.taskbegintime &&
                completeTimes == that.completeTimes &&
                data1 == that.data1 &&
                data2 == that.data2 &&
                data3 == that.data3 &&
                data4 == that.data4 &&
                data5 == that.data5 &&
                data6 == that.data6 &&
                data7 == that.data7 &&
                data8 == that.data8 &&
                data9 == that.data9 &&
                data10 == that.data10;
    }

    @Override
    public int hashCode() {

        return Objects.hash(id, userid, taskid, taskphase, taskcomplete, taskbegintime, completeTimes, data1, data2, data3, data4, data5, data6, data7, data8, data9, data10);
    }
}
