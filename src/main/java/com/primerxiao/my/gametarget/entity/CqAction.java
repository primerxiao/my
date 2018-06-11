package com.primerxiao.my.gametarget.entity;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "cq_action", schema = "newdb2")
public class CqAction {
    private int id;
    private int idNext;
    private int idNextfail;
    private int type;
    private int data;
    private String param;

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
    @Column(name = "type")
    public int getType() {
        return type;
    }

    public void setType(int type) {
        this.type = type;
    }

    @Basic
    @Column(name = "data")
    public int getData() {
        return data;
    }

    public void setData(int data) {
        this.data = data;
    }

    @Basic
    @Column(name = "param")
    public String getParam() {
        return param;
    }

    public void setParam(String param) {
        this.param = param;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        CqAction cqAction = (CqAction) o;
        return id == cqAction.id &&
                idNext == cqAction.idNext &&
                idNextfail == cqAction.idNextfail &&
                type == cqAction.type &&
                data == cqAction.data &&
                Objects.equals(param, cqAction.param);
    }

    @Override
    public int hashCode() {

        return Objects.hash(id, idNext, idNextfail, type, data, param);
    }

    @Override
    public String toString() {
        return "CqAction{" +
                "id=" + id +
                ", idNext=" + idNext +
                ", idNextfail=" + idNextfail +
                ", type=" + type +
                ", data=" + data +
                ", param='" + param + '\'' +
                '}';
    }
}
