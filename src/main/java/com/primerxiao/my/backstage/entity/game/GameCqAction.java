package com.primerxiao.my.backstage.entity.game;

import com.primerxiao.my.common.annotation.EDCode;

import javax.persistence.*;
import java.math.BigInteger;
import java.util.Objects;

@EDCode
@Entity
@Table(name = "cq_action", schema = "business")
public class GameCqAction {
    private BigInteger id;
    private int idNext;
    private int idNextfail;
    private int type;
    private int data;
    @EDCode
    private String param;
    private Integer idNextFail;

    @Id
    @Column(name = "id")
    public BigInteger getId() {
        return id;
    }

    public void setId(BigInteger id) {
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

    @Basic
    @Column(name = "id_next_fail")
    public Integer getIdNextFail() {
        return idNextFail;
    }

    public void setIdNextFail(Integer idNextFail) {
        this.idNextFail = idNextFail;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {

            return true;
        }
        if (o == null || getClass() != o.getClass()) {

            return false;
        }
        GameCqAction that = (GameCqAction) o;
        return id == that.id &&
                idNext == that.idNext &&
                idNextfail == that.idNextfail &&
                type == that.type &&
                data == that.data &&
                Objects.equals(param, that.param) &&
                Objects.equals(idNextFail, that.idNextFail);
    }

    @Override
    public int hashCode() {

        return Objects.hash(id, idNext, idNextfail, type, data, param, idNextFail);
    }
}
