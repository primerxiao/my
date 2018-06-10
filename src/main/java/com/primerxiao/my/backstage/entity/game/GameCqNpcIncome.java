package com.primerxiao.my.backstage.entity.game;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "cq_npc_income", schema = "business")
public class GameCqNpcIncome {
    private int id;
    private int npcId;
    private int ownerId;
    private int ownerType;
    private long incomeExp;
    private long incomeMoney;

    @Id
    @Column(name = "id")
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Basic
    @Column(name = "npc_id")
    public int getNpcId() {
        return npcId;
    }

    public void setNpcId(int npcId) {
        this.npcId = npcId;
    }

    @Basic
    @Column(name = "owner_id")
    public int getOwnerId() {
        return ownerId;
    }

    public void setOwnerId(int ownerId) {
        this.ownerId = ownerId;
    }

    @Basic
    @Column(name = "owner_type")
    public int getOwnerType() {
        return ownerType;
    }

    public void setOwnerType(int ownerType) {
        this.ownerType = ownerType;
    }

    @Basic
    @Column(name = "income_exp")
    public long getIncomeExp() {
        return incomeExp;
    }

    public void setIncomeExp(long incomeExp) {
        this.incomeExp = incomeExp;
    }

    @Basic
    @Column(name = "income_money")
    public long getIncomeMoney() {
        return incomeMoney;
    }

    public void setIncomeMoney(long incomeMoney) {
        this.incomeMoney = incomeMoney;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {

            return true;
        }
        if (o == null || getClass() != o.getClass()) {

            return false;
        }
        GameCqNpcIncome that = (GameCqNpcIncome) o;
        return id == that.id &&
                npcId == that.npcId &&
                ownerId == that.ownerId &&
                ownerType == that.ownerType &&
                incomeExp == that.incomeExp &&
                incomeMoney == that.incomeMoney;
    }

    @Override
    public int hashCode() {

        return Objects.hash(id, npcId, ownerId, ownerType, incomeExp, incomeMoney);
    }
}
