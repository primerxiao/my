package com.primerxiao.my.backstage.entity.game;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "cq_newtaskconfig", schema = "business")
public class GameCqNewtaskconfig {
    private int id;
    private int beginscript;
    private int completescript;
    private int withdrawalscript;
    private int challengebossscript;

    @Id
    @Column(name = "id")
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Basic
    @Column(name = "beginscript")
    public int getBeginscript() {
        return beginscript;
    }

    public void setBeginscript(int beginscript) {
        this.beginscript = beginscript;
    }

    @Basic
    @Column(name = "completescript")
    public int getCompletescript() {
        return completescript;
    }

    public void setCompletescript(int completescript) {
        this.completescript = completescript;
    }

    @Basic
    @Column(name = "withdrawalscript")
    public int getWithdrawalscript() {
        return withdrawalscript;
    }

    public void setWithdrawalscript(int withdrawalscript) {
        this.withdrawalscript = withdrawalscript;
    }

    @Basic
    @Column(name = "challengebossscript")
    public int getChallengebossscript() {
        return challengebossscript;
    }

    public void setChallengebossscript(int challengebossscript) {
        this.challengebossscript = challengebossscript;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {

            return true;
        }
        if (o == null || getClass() != o.getClass()) {

            return false;
        }
        GameCqNewtaskconfig that = (GameCqNewtaskconfig) o;
        return id == that.id &&
                beginscript == that.beginscript &&
                completescript == that.completescript &&
                withdrawalscript == that.withdrawalscript &&
                challengebossscript == that.challengebossscript;
    }

    @Override
    public int hashCode() {

        return Objects.hash(id, beginscript, completescript, withdrawalscript, challengebossscript);
    }
}
