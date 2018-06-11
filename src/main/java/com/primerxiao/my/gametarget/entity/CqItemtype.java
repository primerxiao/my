package com.primerxiao.my.gametarget.entity;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "cq_itemtype", schema = "newdb2")
public class CqItemtype {
    private int id;
    private String name;
    private byte reqProfession;
    private byte level;
    private byte reqLevel;
    private byte reqSex;
    private short reqForce;
    private short reqDex;
    private short reqHealth;
    private short reqSoul;
    private short monopoly;
    private short weight;
    private int price;
    private int idAction;
    private short attackMax;
    private short attackMin;
    private short defense;
    private short magicAtkMin;
    private short dodge;
    private short life;
    private int mana;
    private short amount;
    private short amountLimit;
    private byte ident;
    private byte gem1;
    private byte gem2;
    private byte magic1;
    private byte magic2;
    private byte magic3;
    private short magicAtkMax;
    private short magicDef;
    private short atkRange;
    private short atkSpeed;
    private short hitrate;
    private int monsterType;
    private short target;
    private byte ableMask;
    private byte expType;
    private int emoney;
    private Byte official1;
    private Byte official2;
    private Byte official3;
    private Byte official4;
    private Byte official5;
    private Byte official6;
    private Byte official7;
    private Byte official8;
    private Byte official9;
    private Byte official10;
    private byte official11;
    private byte official12;
    private byte official13;
    private int soulValue;
    private byte gem3;

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
    @Column(name = "req_profession")
    public byte getReqProfession() {
        return reqProfession;
    }

    public void setReqProfession(byte reqProfession) {
        this.reqProfession = reqProfession;
    }

    @Basic
    @Column(name = "level")
    public byte getLevel() {
        return level;
    }

    public void setLevel(byte level) {
        this.level = level;
    }

    @Basic
    @Column(name = "req_level")
    public byte getReqLevel() {
        return reqLevel;
    }

    public void setReqLevel(byte reqLevel) {
        this.reqLevel = reqLevel;
    }

    @Basic
    @Column(name = "req_sex")
    public byte getReqSex() {
        return reqSex;
    }

    public void setReqSex(byte reqSex) {
        this.reqSex = reqSex;
    }

    @Basic
    @Column(name = "req_force")
    public short getReqForce() {
        return reqForce;
    }

    public void setReqForce(short reqForce) {
        this.reqForce = reqForce;
    }

    @Basic
    @Column(name = "req_dex")
    public short getReqDex() {
        return reqDex;
    }

    public void setReqDex(short reqDex) {
        this.reqDex = reqDex;
    }

    @Basic
    @Column(name = "req_health")
    public short getReqHealth() {
        return reqHealth;
    }

    public void setReqHealth(short reqHealth) {
        this.reqHealth = reqHealth;
    }

    @Basic
    @Column(name = "req_soul")
    public short getReqSoul() {
        return reqSoul;
    }

    public void setReqSoul(short reqSoul) {
        this.reqSoul = reqSoul;
    }

    @Basic
    @Column(name = "monopoly")
    public short getMonopoly() {
        return monopoly;
    }

    public void setMonopoly(short monopoly) {
        this.monopoly = monopoly;
    }

    @Basic
    @Column(name = "weight")
    public short getWeight() {
        return weight;
    }

    public void setWeight(short weight) {
        this.weight = weight;
    }

    @Basic
    @Column(name = "price")
    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    @Basic
    @Column(name = "id_action")
    public int getIdAction() {
        return idAction;
    }

    public void setIdAction(int idAction) {
        this.idAction = idAction;
    }

    @Basic
    @Column(name = "attack_max")
    public short getAttackMax() {
        return attackMax;
    }

    public void setAttackMax(short attackMax) {
        this.attackMax = attackMax;
    }

    @Basic
    @Column(name = "attack_min")
    public short getAttackMin() {
        return attackMin;
    }

    public void setAttackMin(short attackMin) {
        this.attackMin = attackMin;
    }

    @Basic
    @Column(name = "defense")
    public short getDefense() {
        return defense;
    }

    public void setDefense(short defense) {
        this.defense = defense;
    }

    @Basic
    @Column(name = "magic_atk_min")
    public short getMagicAtkMin() {
        return magicAtkMin;
    }

    public void setMagicAtkMin(short magicAtkMin) {
        this.magicAtkMin = magicAtkMin;
    }

    @Basic
    @Column(name = "dodge")
    public short getDodge() {
        return dodge;
    }

    public void setDodge(short dodge) {
        this.dodge = dodge;
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
    @Column(name = "mana")
    public int getMana() {
        return mana;
    }

    public void setMana(int mana) {
        this.mana = mana;
    }

    @Basic
    @Column(name = "amount")
    public short getAmount() {
        return amount;
    }

    public void setAmount(short amount) {
        this.amount = amount;
    }

    @Basic
    @Column(name = "amount_limit")
    public short getAmountLimit() {
        return amountLimit;
    }

    public void setAmountLimit(short amountLimit) {
        this.amountLimit = amountLimit;
    }

    @Basic
    @Column(name = "ident")
    public byte getIdent() {
        return ident;
    }

    public void setIdent(byte ident) {
        this.ident = ident;
    }

    @Basic
    @Column(name = "gem1")
    public byte getGem1() {
        return gem1;
    }

    public void setGem1(byte gem1) {
        this.gem1 = gem1;
    }

    @Basic
    @Column(name = "gem2")
    public byte getGem2() {
        return gem2;
    }

    public void setGem2(byte gem2) {
        this.gem2 = gem2;
    }

    @Basic
    @Column(name = "magic1")
    public byte getMagic1() {
        return magic1;
    }

    public void setMagic1(byte magic1) {
        this.magic1 = magic1;
    }

    @Basic
    @Column(name = "magic2")
    public byte getMagic2() {
        return magic2;
    }

    public void setMagic2(byte magic2) {
        this.magic2 = magic2;
    }

    @Basic
    @Column(name = "magic3")
    public byte getMagic3() {
        return magic3;
    }

    public void setMagic3(byte magic3) {
        this.magic3 = magic3;
    }

    @Basic
    @Column(name = "magic_atk_max")
    public short getMagicAtkMax() {
        return magicAtkMax;
    }

    public void setMagicAtkMax(short magicAtkMax) {
        this.magicAtkMax = magicAtkMax;
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
    @Column(name = "atk_range")
    public short getAtkRange() {
        return atkRange;
    }

    public void setAtkRange(short atkRange) {
        this.atkRange = atkRange;
    }

    @Basic
    @Column(name = "atk_speed")
    public short getAtkSpeed() {
        return atkSpeed;
    }

    public void setAtkSpeed(short atkSpeed) {
        this.atkSpeed = atkSpeed;
    }

    @Basic
    @Column(name = "hitrate")
    public short getHitrate() {
        return hitrate;
    }

    public void setHitrate(short hitrate) {
        this.hitrate = hitrate;
    }

    @Basic
    @Column(name = "monster_type")
    public int getMonsterType() {
        return monsterType;
    }

    public void setMonsterType(int monsterType) {
        this.monsterType = monsterType;
    }

    @Basic
    @Column(name = "target")
    public short getTarget() {
        return target;
    }

    public void setTarget(short target) {
        this.target = target;
    }

    @Basic
    @Column(name = "able_mask")
    public byte getAbleMask() {
        return ableMask;
    }

    public void setAbleMask(byte ableMask) {
        this.ableMask = ableMask;
    }

    @Basic
    @Column(name = "exp_type")
    public byte getExpType() {
        return expType;
    }

    public void setExpType(byte expType) {
        this.expType = expType;
    }

    @Basic
    @Column(name = "emoney")
    public int getEmoney() {
        return emoney;
    }

    public void setEmoney(int emoney) {
        this.emoney = emoney;
    }

    @Basic
    @Column(name = "official1")
    public Byte getOfficial1() {
        return official1;
    }

    public void setOfficial1(Byte official1) {
        this.official1 = official1;
    }

    @Basic
    @Column(name = "official2")
    public Byte getOfficial2() {
        return official2;
    }

    public void setOfficial2(Byte official2) {
        this.official2 = official2;
    }

    @Basic
    @Column(name = "official3")
    public Byte getOfficial3() {
        return official3;
    }

    public void setOfficial3(Byte official3) {
        this.official3 = official3;
    }

    @Basic
    @Column(name = "official4")
    public Byte getOfficial4() {
        return official4;
    }

    public void setOfficial4(Byte official4) {
        this.official4 = official4;
    }

    @Basic
    @Column(name = "official5")
    public Byte getOfficial5() {
        return official5;
    }

    public void setOfficial5(Byte official5) {
        this.official5 = official5;
    }

    @Basic
    @Column(name = "official6")
    public Byte getOfficial6() {
        return official6;
    }

    public void setOfficial6(Byte official6) {
        this.official6 = official6;
    }

    @Basic
    @Column(name = "official7")
    public Byte getOfficial7() {
        return official7;
    }

    public void setOfficial7(Byte official7) {
        this.official7 = official7;
    }

    @Basic
    @Column(name = "official8")
    public Byte getOfficial8() {
        return official8;
    }

    public void setOfficial8(Byte official8) {
        this.official8 = official8;
    }

    @Basic
    @Column(name = "official9")
    public Byte getOfficial9() {
        return official9;
    }

    public void setOfficial9(Byte official9) {
        this.official9 = official9;
    }

    @Basic
    @Column(name = "official10")
    public Byte getOfficial10() {
        return official10;
    }

    public void setOfficial10(Byte official10) {
        this.official10 = official10;
    }

    @Basic
    @Column(name = "official11")
    public byte getOfficial11() {
        return official11;
    }

    public void setOfficial11(byte official11) {
        this.official11 = official11;
    }

    @Basic
    @Column(name = "official12")
    public byte getOfficial12() {
        return official12;
    }

    public void setOfficial12(byte official12) {
        this.official12 = official12;
    }

    @Basic
    @Column(name = "official13")
    public byte getOfficial13() {
        return official13;
    }

    public void setOfficial13(byte official13) {
        this.official13 = official13;
    }

    @Basic
    @Column(name = "soul_value")
    public int getSoulValue() {
        return soulValue;
    }

    public void setSoulValue(int soulValue) {
        this.soulValue = soulValue;
    }

    @Basic
    @Column(name = "gem3")
    public byte getGem3() {
        return gem3;
    }

    public void setGem3(byte gem3) {
        this.gem3 = gem3;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        CqItemtype that = (CqItemtype) o;
        return id == that.id &&
                reqProfession == that.reqProfession &&
                level == that.level &&
                reqLevel == that.reqLevel &&
                reqSex == that.reqSex &&
                reqForce == that.reqForce &&
                reqDex == that.reqDex &&
                reqHealth == that.reqHealth &&
                reqSoul == that.reqSoul &&
                monopoly == that.monopoly &&
                weight == that.weight &&
                price == that.price &&
                idAction == that.idAction &&
                attackMax == that.attackMax &&
                attackMin == that.attackMin &&
                defense == that.defense &&
                magicAtkMin == that.magicAtkMin &&
                dodge == that.dodge &&
                life == that.life &&
                mana == that.mana &&
                amount == that.amount &&
                amountLimit == that.amountLimit &&
                ident == that.ident &&
                gem1 == that.gem1 &&
                gem2 == that.gem2 &&
                magic1 == that.magic1 &&
                magic2 == that.magic2 &&
                magic3 == that.magic3 &&
                magicAtkMax == that.magicAtkMax &&
                magicDef == that.magicDef &&
                atkRange == that.atkRange &&
                atkSpeed == that.atkSpeed &&
                hitrate == that.hitrate &&
                monsterType == that.monsterType &&
                target == that.target &&
                ableMask == that.ableMask &&
                expType == that.expType &&
                emoney == that.emoney &&
                official11 == that.official11 &&
                official12 == that.official12 &&
                official13 == that.official13 &&
                soulValue == that.soulValue &&
                gem3 == that.gem3 &&
                Objects.equals(name, that.name) &&
                Objects.equals(official1, that.official1) &&
                Objects.equals(official2, that.official2) &&
                Objects.equals(official3, that.official3) &&
                Objects.equals(official4, that.official4) &&
                Objects.equals(official5, that.official5) &&
                Objects.equals(official6, that.official6) &&
                Objects.equals(official7, that.official7) &&
                Objects.equals(official8, that.official8) &&
                Objects.equals(official9, that.official9) &&
                Objects.equals(official10, that.official10);
    }

    @Override
    public int hashCode() {

        return Objects.hash(id, name, reqProfession, level, reqLevel, reqSex, reqForce, reqDex, reqHealth, reqSoul, monopoly, weight, price, idAction, attackMax, attackMin, defense, magicAtkMin, dodge, life, mana, amount, amountLimit, ident, gem1, gem2, magic1, magic2, magic3, magicAtkMax, magicDef, atkRange, atkSpeed, hitrate, monsterType, target, ableMask, expType, emoney, official1, official2, official3, official4, official5, official6, official7, official8, official9, official10, official11, official12, official13, soulValue, gem3);
    }
}
