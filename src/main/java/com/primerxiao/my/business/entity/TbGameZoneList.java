package com.primerxiao.my.business.entity;

import com.primerxiao.my.common.Entity.EntityParent;
import com.primerxiao.my.common.annotation.EDCode;

import javax.persistence.*;
import java.util.Date;

/**
 * @author primerxiao
 */
@EDCode
@Entity
@Table
public class TbGameZoneList extends EntityParent {

    /**
     * 区编码（主键）
     */
    @Id
    @GeneratedValue
    private Integer id;
    /**
     * 区名称
     */
    @EDCode
    @Column(nullable = false)
    private String name;
    /**
     * 状态 1正常 2暂停 3停用
     */
    @Column(nullable = false)
    private Integer status;
    /**
     * 数据源id
     */
    @Column(nullable = false)
    private Integer dataSourceId;
    /**
     * 创建时间
     */
    @Column(nullable = false)
    private Date createTime;


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public int getDataSourceId() {
        return dataSourceId;
    }

    public void setDataSourceId(int dataSourceId) {
        this.dataSourceId = dataSourceId;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    @Override
    public String toString() {
        return "TbGameZoneList{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", status=" + status +
                ", dataSourceId=" + dataSourceId +
                ", createTime=" + createTime +

                '}';
    }

    public static void main(String[] args) {
        TbGameZoneList tbGameZoneList = new TbGameZoneList();
        tbGameZoneList.setId(0);

        EDCode declaredAnnotation = tbGameZoneList.getClass().getDeclaredAnnotation(EDCode.class);
        System.out.println(declaredAnnotation);
    }
}
