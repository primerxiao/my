package com.primerxiao.my.backstage.entity.game;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.Objects;

@Entity
@Table(name = "account", schema = "business")
public class GameAccount {
    private int id;
    private String name;
    private String password;
    private int type;
    private Integer point;
    private int pointtime;
    private int online;
    private Timestamp regDate;
    private Integer licence;
    private Long regFlag;
    private String netbarIp;
    private String ipMask;
    private short addType;
    private int vip;
    private String superpass;

    @Id
    @Column(name = "id")
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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
    @Column(name = "password")
    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
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
    @Column(name = "point")
    public Integer getPoint() {
        return point;
    }

    public void setPoint(Integer point) {
        this.point = point;
    }

    @Basic
    @Column(name = "pointtime")
    public int getPointtime() {
        return pointtime;
    }

    public void setPointtime(int pointtime) {
        this.pointtime = pointtime;
    }

    @Basic
    @Column(name = "online")
    public int getOnline() {
        return online;
    }

    public void setOnline(int online) {
        this.online = online;
    }

    @Basic
    @Column(name = "reg_date")
    public Timestamp getRegDate() {
        return regDate;
    }

    public void setRegDate(Timestamp regDate) {
        this.regDate = regDate;
    }

    @Basic
    @Column(name = "licence")
    public Integer getLicence() {
        return licence;
    }

    public void setLicence(Integer licence) {
        this.licence = licence;
    }

    @Basic
    @Column(name = "reg_flag")
    public Long getRegFlag() {
        return regFlag;
    }

    public void setRegFlag(Long regFlag) {
        this.regFlag = regFlag;
    }

    @Basic
    @Column(name = "netbar_ip")
    public String getNetbarIp() {
        return netbarIp;
    }

    public void setNetbarIp(String netbarIp) {
        this.netbarIp = netbarIp;
    }

    @Basic
    @Column(name = "ip_mask")
    public String getIpMask() {
        return ipMask;
    }

    public void setIpMask(String ipMask) {
        this.ipMask = ipMask;
    }

    @Basic
    @Column(name = "add_type")
    public short getAddType() {
        return addType;
    }

    public void setAddType(short addType) {
        this.addType = addType;
    }

    @Basic
    @Column(name = "VIP")
    public int getVip() {
        return vip;
    }

    public void setVip(int vip) {
        this.vip = vip;
    }

    @Basic
    @Column(name = "superpass")
    public String getSuperpass() {
        return superpass;
    }

    public void setSuperpass(String superpass) {
        this.superpass = superpass;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }

        if (o == null || getClass() != o.getClass()) {
            return false;
        }

        GameAccount that = (GameAccount) o;
        return id == that.id &&
                type == that.type &&
                pointtime == that.pointtime &&
                online == that.online &&
                addType == that.addType &&
                vip == that.vip &&
                Objects.equals(name, that.name) &&
                Objects.equals(password, that.password) &&
                Objects.equals(point, that.point) &&
                Objects.equals(regDate, that.regDate) &&
                Objects.equals(licence, that.licence) &&
                Objects.equals(regFlag, that.regFlag) &&
                Objects.equals(netbarIp, that.netbarIp) &&
                Objects.equals(ipMask, that.ipMask) &&
                Objects.equals(superpass, that.superpass);
    }

    @Override
    public int hashCode() {

        return Objects.hash(id, name, password, type, point, pointtime, online, regDate, licence, regFlag, netbarIp, ipMask, addType, vip, superpass);
    }
}
