package com.primerxiao.my.gametarget.entity;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "cq_monstertype", schema = "newdb2")
public class CqMonstertype {
    private int id;
    private String name;
    private int type;
    private int lookface;
    private byte length;
    private byte fat;
    private int life;
    private short mana;
    private int attackMax;
    private int attackMin;
    private int defence;
    private int dexterity;
    private int dodge;
    private int helmetType;
    private int armorType;
    private int weaponrType;
    private int weaponlType;
    private int attackRange;
    private int viewRange;
    private int escapeLife;
    private int attackSpeed;
    private int moveSpeed;
    private int level;
    private int attackUser;
    private int dropMoneyMin;
    private int dropMoneyMax;
    private int sizeAdd;
    private int action;
    private int runSpeed;
    private byte dropArmet;
    private byte dropNecklace;
    private byte dropArmor;
    private byte dropRing;
    private byte dropWeapon;
    private byte dropShield;
    private byte dropShoes;
    private int dropMoneyChance;
    private int dropItemChance;
    private int magicType;
    private int magicDef;
    private int magicHitrate;
    private int atkHitrate;
    private int aiType;
    private int defence2;
    private int explodeItemChance1;
    private int explodeItemChance2;
    private int explodeItemChance3;
    private int dropItemRule;
    private short profession;
    private Integer magic1;
    private Integer magic2;
    private Integer magic3;
    private int frequency;
    private byte extraBattlelev;
    private short extraExp;
    private short extraDamage;
    private byte earthDef;
    private byte waterDef;
    private byte fireDef;
    private byte windDef;
    private int dropEggCoe;
    private int dropWeaponCoe;
    private int dropArmetCoe;
    private int dropArmorCoe;
    private int dropNecklaceCoe;
    private int dropBraceletCoe;
    private int dropShoesCoe;
    private int dropStoneCoe;
    private int dropGemCoe;
    private int dropExplodeCoe;
    private int dropSpecialCoe;
    private int specialType;
    private int dropDeltalevCoe;
    private byte skillLev;
    private int viewtominimap;
    private int vipview;
    private int petInheritatk;
    private int petInherithp;
    private byte expType;

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
    @Column(name = "type")
    public int getType() {
        return type;
    }

    public void setType(int type) {
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
    @Column(name = "life")
    public int getLife() {
        return life;
    }

    public void setLife(int life) {
        this.life = life;
    }

    @Basic
    @Column(name = "mana")
    public short getMana() {
        return mana;
    }

    public void setMana(short mana) {
        this.mana = mana;
    }

    @Basic
    @Column(name = "attack_max")
    public int getAttackMax() {
        return attackMax;
    }

    public void setAttackMax(int attackMax) {
        this.attackMax = attackMax;
    }

    @Basic
    @Column(name = "attack_min")
    public int getAttackMin() {
        return attackMin;
    }

    public void setAttackMin(int attackMin) {
        this.attackMin = attackMin;
    }

    @Basic
    @Column(name = "defence")
    public int getDefence() {
        return defence;
    }

    public void setDefence(int defence) {
        this.defence = defence;
    }

    @Basic
    @Column(name = "dexterity")
    public int getDexterity() {
        return dexterity;
    }

    public void setDexterity(int dexterity) {
        this.dexterity = dexterity;
    }

    @Basic
    @Column(name = "dodge")
    public int getDodge() {
        return dodge;
    }

    public void setDodge(int dodge) {
        this.dodge = dodge;
    }

    @Basic
    @Column(name = "helmet_type")
    public int getHelmetType() {
        return helmetType;
    }

    public void setHelmetType(int helmetType) {
        this.helmetType = helmetType;
    }

    @Basic
    @Column(name = "armor_type")
    public int getArmorType() {
        return armorType;
    }

    public void setArmorType(int armorType) {
        this.armorType = armorType;
    }

    @Basic
    @Column(name = "weaponr_type")
    public int getWeaponrType() {
        return weaponrType;
    }

    public void setWeaponrType(int weaponrType) {
        this.weaponrType = weaponrType;
    }

    @Basic
    @Column(name = "weaponl_type")
    public int getWeaponlType() {
        return weaponlType;
    }

    public void setWeaponlType(int weaponlType) {
        this.weaponlType = weaponlType;
    }

    @Basic
    @Column(name = "attack_range")
    public int getAttackRange() {
        return attackRange;
    }

    public void setAttackRange(int attackRange) {
        this.attackRange = attackRange;
    }

    @Basic
    @Column(name = "view_range")
    public int getViewRange() {
        return viewRange;
    }

    public void setViewRange(int viewRange) {
        this.viewRange = viewRange;
    }

    @Basic
    @Column(name = "escape_life")
    public int getEscapeLife() {
        return escapeLife;
    }

    public void setEscapeLife(int escapeLife) {
        this.escapeLife = escapeLife;
    }

    @Basic
    @Column(name = "attack_speed")
    public int getAttackSpeed() {
        return attackSpeed;
    }

    public void setAttackSpeed(int attackSpeed) {
        this.attackSpeed = attackSpeed;
    }

    @Basic
    @Column(name = "move_speed")
    public int getMoveSpeed() {
        return moveSpeed;
    }

    public void setMoveSpeed(int moveSpeed) {
        this.moveSpeed = moveSpeed;
    }

    @Basic
    @Column(name = "level")
    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    @Basic
    @Column(name = "attack_user")
    public int getAttackUser() {
        return attackUser;
    }

    public void setAttackUser(int attackUser) {
        this.attackUser = attackUser;
    }

    @Basic
    @Column(name = "drop_money_min")
    public int getDropMoneyMin() {
        return dropMoneyMin;
    }

    public void setDropMoneyMin(int dropMoneyMin) {
        this.dropMoneyMin = dropMoneyMin;
    }

    @Basic
    @Column(name = "drop_money_max")
    public int getDropMoneyMax() {
        return dropMoneyMax;
    }

    public void setDropMoneyMax(int dropMoneyMax) {
        this.dropMoneyMax = dropMoneyMax;
    }

    @Basic
    @Column(name = "size_add")
    public int getSizeAdd() {
        return sizeAdd;
    }

    public void setSizeAdd(int sizeAdd) {
        this.sizeAdd = sizeAdd;
    }

    @Basic
    @Column(name = "action")
    public int getAction() {
        return action;
    }

    public void setAction(int action) {
        this.action = action;
    }

    @Basic
    @Column(name = "run_speed")
    public int getRunSpeed() {
        return runSpeed;
    }

    public void setRunSpeed(int runSpeed) {
        this.runSpeed = runSpeed;
    }

    @Basic
    @Column(name = "drop_armet")
    public byte getDropArmet() {
        return dropArmet;
    }

    public void setDropArmet(byte dropArmet) {
        this.dropArmet = dropArmet;
    }

    @Basic
    @Column(name = "drop_necklace")
    public byte getDropNecklace() {
        return dropNecklace;
    }

    public void setDropNecklace(byte dropNecklace) {
        this.dropNecklace = dropNecklace;
    }

    @Basic
    @Column(name = "drop_armor")
    public byte getDropArmor() {
        return dropArmor;
    }

    public void setDropArmor(byte dropArmor) {
        this.dropArmor = dropArmor;
    }

    @Basic
    @Column(name = "drop_ring")
    public byte getDropRing() {
        return dropRing;
    }

    public void setDropRing(byte dropRing) {
        this.dropRing = dropRing;
    }

    @Basic
    @Column(name = "drop_weapon")
    public byte getDropWeapon() {
        return dropWeapon;
    }

    public void setDropWeapon(byte dropWeapon) {
        this.dropWeapon = dropWeapon;
    }

    @Basic
    @Column(name = "drop_shield")
    public byte getDropShield() {
        return dropShield;
    }

    public void setDropShield(byte dropShield) {
        this.dropShield = dropShield;
    }

    @Basic
    @Column(name = "drop_shoes")
    public byte getDropShoes() {
        return dropShoes;
    }

    public void setDropShoes(byte dropShoes) {
        this.dropShoes = dropShoes;
    }

    @Basic
    @Column(name = "drop_money_chance")
    public int getDropMoneyChance() {
        return dropMoneyChance;
    }

    public void setDropMoneyChance(int dropMoneyChance) {
        this.dropMoneyChance = dropMoneyChance;
    }

    @Basic
    @Column(name = "drop_item_chance")
    public int getDropItemChance() {
        return dropItemChance;
    }

    public void setDropItemChance(int dropItemChance) {
        this.dropItemChance = dropItemChance;
    }

    @Basic
    @Column(name = "magic_type")
    public int getMagicType() {
        return magicType;
    }

    public void setMagicType(int magicType) {
        this.magicType = magicType;
    }

    @Basic
    @Column(name = "magic_def")
    public int getMagicDef() {
        return magicDef;
    }

    public void setMagicDef(int magicDef) {
        this.magicDef = magicDef;
    }

    @Basic
    @Column(name = "magic_hitrate")
    public int getMagicHitrate() {
        return magicHitrate;
    }

    public void setMagicHitrate(int magicHitrate) {
        this.magicHitrate = magicHitrate;
    }

    @Basic
    @Column(name = "atk_hitrate")
    public int getAtkHitrate() {
        return atkHitrate;
    }

    public void setAtkHitrate(int atkHitrate) {
        this.atkHitrate = atkHitrate;
    }

    @Basic
    @Column(name = "ai_type")
    public int getAiType() {
        return aiType;
    }

    public void setAiType(int aiType) {
        this.aiType = aiType;
    }

    @Basic
    @Column(name = "defence2")
    public int getDefence2() {
        return defence2;
    }

    public void setDefence2(int defence2) {
        this.defence2 = defence2;
    }

    @Basic
    @Column(name = "explode_item_chance1")
    public int getExplodeItemChance1() {
        return explodeItemChance1;
    }

    public void setExplodeItemChance1(int explodeItemChance1) {
        this.explodeItemChance1 = explodeItemChance1;
    }

    @Basic
    @Column(name = "explode_item_chance2")
    public int getExplodeItemChance2() {
        return explodeItemChance2;
    }

    public void setExplodeItemChance2(int explodeItemChance2) {
        this.explodeItemChance2 = explodeItemChance2;
    }

    @Basic
    @Column(name = "explode_item_chance3")
    public int getExplodeItemChance3() {
        return explodeItemChance3;
    }

    public void setExplodeItemChance3(int explodeItemChance3) {
        this.explodeItemChance3 = explodeItemChance3;
    }

    @Basic
    @Column(name = "drop_item_rule")
    public int getDropItemRule() {
        return dropItemRule;
    }

    public void setDropItemRule(int dropItemRule) {
        this.dropItemRule = dropItemRule;
    }

    @Basic
    @Column(name = "profession")
    public short getProfession() {
        return profession;
    }

    public void setProfession(short profession) {
        this.profession = profession;
    }

    @Basic
    @Column(name = "magic1")
    public Integer getMagic1() {
        return magic1;
    }

    public void setMagic1(Integer magic1) {
        this.magic1 = magic1;
    }

    @Basic
    @Column(name = "magic2")
    public Integer getMagic2() {
        return magic2;
    }

    public void setMagic2(Integer magic2) {
        this.magic2 = magic2;
    }

    @Basic
    @Column(name = "magic3")
    public Integer getMagic3() {
        return magic3;
    }

    public void setMagic3(Integer magic3) {
        this.magic3 = magic3;
    }

    @Basic
    @Column(name = "frequency")
    public int getFrequency() {
        return frequency;
    }

    public void setFrequency(int frequency) {
        this.frequency = frequency;
    }

    @Basic
    @Column(name = "extra_battlelev")
    public byte getExtraBattlelev() {
        return extraBattlelev;
    }

    public void setExtraBattlelev(byte extraBattlelev) {
        this.extraBattlelev = extraBattlelev;
    }

    @Basic
    @Column(name = "extra_exp")
    public short getExtraExp() {
        return extraExp;
    }

    public void setExtraExp(short extraExp) {
        this.extraExp = extraExp;
    }

    @Basic
    @Column(name = "extra_damage")
    public short getExtraDamage() {
        return extraDamage;
    }

    public void setExtraDamage(short extraDamage) {
        this.extraDamage = extraDamage;
    }

    @Basic
    @Column(name = "earth_def")
    public byte getEarthDef() {
        return earthDef;
    }

    public void setEarthDef(byte earthDef) {
        this.earthDef = earthDef;
    }

    @Basic
    @Column(name = "water_def")
    public byte getWaterDef() {
        return waterDef;
    }

    public void setWaterDef(byte waterDef) {
        this.waterDef = waterDef;
    }

    @Basic
    @Column(name = "fire_def")
    public byte getFireDef() {
        return fireDef;
    }

    public void setFireDef(byte fireDef) {
        this.fireDef = fireDef;
    }

    @Basic
    @Column(name = "wind_def")
    public byte getWindDef() {
        return windDef;
    }

    public void setWindDef(byte windDef) {
        this.windDef = windDef;
    }

    @Basic
    @Column(name = "drop_egg_coe")
    public int getDropEggCoe() {
        return dropEggCoe;
    }

    public void setDropEggCoe(int dropEggCoe) {
        this.dropEggCoe = dropEggCoe;
    }

    @Basic
    @Column(name = "drop_weapon_coe")
    public int getDropWeaponCoe() {
        return dropWeaponCoe;
    }

    public void setDropWeaponCoe(int dropWeaponCoe) {
        this.dropWeaponCoe = dropWeaponCoe;
    }

    @Basic
    @Column(name = "drop_armet_coe")
    public int getDropArmetCoe() {
        return dropArmetCoe;
    }

    public void setDropArmetCoe(int dropArmetCoe) {
        this.dropArmetCoe = dropArmetCoe;
    }

    @Basic
    @Column(name = "drop_armor_coe")
    public int getDropArmorCoe() {
        return dropArmorCoe;
    }

    public void setDropArmorCoe(int dropArmorCoe) {
        this.dropArmorCoe = dropArmorCoe;
    }

    @Basic
    @Column(name = "drop_necklace_coe")
    public int getDropNecklaceCoe() {
        return dropNecklaceCoe;
    }

    public void setDropNecklaceCoe(int dropNecklaceCoe) {
        this.dropNecklaceCoe = dropNecklaceCoe;
    }

    @Basic
    @Column(name = "drop_bracelet_coe")
    public int getDropBraceletCoe() {
        return dropBraceletCoe;
    }

    public void setDropBraceletCoe(int dropBraceletCoe) {
        this.dropBraceletCoe = dropBraceletCoe;
    }

    @Basic
    @Column(name = "drop_shoes_coe")
    public int getDropShoesCoe() {
        return dropShoesCoe;
    }

    public void setDropShoesCoe(int dropShoesCoe) {
        this.dropShoesCoe = dropShoesCoe;
    }

    @Basic
    @Column(name = "drop_stone_coe")
    public int getDropStoneCoe() {
        return dropStoneCoe;
    }

    public void setDropStoneCoe(int dropStoneCoe) {
        this.dropStoneCoe = dropStoneCoe;
    }

    @Basic
    @Column(name = "drop_gem_coe")
    public int getDropGemCoe() {
        return dropGemCoe;
    }

    public void setDropGemCoe(int dropGemCoe) {
        this.dropGemCoe = dropGemCoe;
    }

    @Basic
    @Column(name = "drop_explode_coe")
    public int getDropExplodeCoe() {
        return dropExplodeCoe;
    }

    public void setDropExplodeCoe(int dropExplodeCoe) {
        this.dropExplodeCoe = dropExplodeCoe;
    }

    @Basic
    @Column(name = "drop_special_coe")
    public int getDropSpecialCoe() {
        return dropSpecialCoe;
    }

    public void setDropSpecialCoe(int dropSpecialCoe) {
        this.dropSpecialCoe = dropSpecialCoe;
    }

    @Basic
    @Column(name = "special_type")
    public int getSpecialType() {
        return specialType;
    }

    public void setSpecialType(int specialType) {
        this.specialType = specialType;
    }

    @Basic
    @Column(name = "drop_deltalev_coe")
    public int getDropDeltalevCoe() {
        return dropDeltalevCoe;
    }

    public void setDropDeltalevCoe(int dropDeltalevCoe) {
        this.dropDeltalevCoe = dropDeltalevCoe;
    }

    @Basic
    @Column(name = "skill_lev")
    public byte getSkillLev() {
        return skillLev;
    }

    public void setSkillLev(byte skillLev) {
        this.skillLev = skillLev;
    }

    @Basic
    @Column(name = "viewtominimap")
    public int getViewtominimap() {
        return viewtominimap;
    }

    public void setViewtominimap(int viewtominimap) {
        this.viewtominimap = viewtominimap;
    }

    @Basic
    @Column(name = "vipview")
    public int getVipview() {
        return vipview;
    }

    public void setVipview(int vipview) {
        this.vipview = vipview;
    }

    @Basic
    @Column(name = "pet_inheritatk")
    public int getPetInheritatk() {
        return petInheritatk;
    }

    public void setPetInheritatk(int petInheritatk) {
        this.petInheritatk = petInheritatk;
    }

    @Basic
    @Column(name = "pet_inherithp")
    public int getPetInherithp() {
        return petInherithp;
    }

    public void setPetInherithp(int petInherithp) {
        this.petInherithp = petInherithp;
    }

    @Basic
    @Column(name = "ExpType")
    public byte getExpType() {
        return expType;
    }

    public void setExpType(byte expType) {
        this.expType = expType;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        CqMonstertype that = (CqMonstertype) o;
        return id == that.id &&
                type == that.type &&
                lookface == that.lookface &&
                length == that.length &&
                fat == that.fat &&
                life == that.life &&
                mana == that.mana &&
                attackMax == that.attackMax &&
                attackMin == that.attackMin &&
                defence == that.defence &&
                dexterity == that.dexterity &&
                dodge == that.dodge &&
                helmetType == that.helmetType &&
                armorType == that.armorType &&
                weaponrType == that.weaponrType &&
                weaponlType == that.weaponlType &&
                attackRange == that.attackRange &&
                viewRange == that.viewRange &&
                escapeLife == that.escapeLife &&
                attackSpeed == that.attackSpeed &&
                moveSpeed == that.moveSpeed &&
                level == that.level &&
                attackUser == that.attackUser &&
                dropMoneyMin == that.dropMoneyMin &&
                dropMoneyMax == that.dropMoneyMax &&
                sizeAdd == that.sizeAdd &&
                action == that.action &&
                runSpeed == that.runSpeed &&
                dropArmet == that.dropArmet &&
                dropNecklace == that.dropNecklace &&
                dropArmor == that.dropArmor &&
                dropRing == that.dropRing &&
                dropWeapon == that.dropWeapon &&
                dropShield == that.dropShield &&
                dropShoes == that.dropShoes &&
                dropMoneyChance == that.dropMoneyChance &&
                dropItemChance == that.dropItemChance &&
                magicType == that.magicType &&
                magicDef == that.magicDef &&
                magicHitrate == that.magicHitrate &&
                atkHitrate == that.atkHitrate &&
                aiType == that.aiType &&
                defence2 == that.defence2 &&
                explodeItemChance1 == that.explodeItemChance1 &&
                explodeItemChance2 == that.explodeItemChance2 &&
                explodeItemChance3 == that.explodeItemChance3 &&
                dropItemRule == that.dropItemRule &&
                profession == that.profession &&
                frequency == that.frequency &&
                extraBattlelev == that.extraBattlelev &&
                extraExp == that.extraExp &&
                extraDamage == that.extraDamage &&
                earthDef == that.earthDef &&
                waterDef == that.waterDef &&
                fireDef == that.fireDef &&
                windDef == that.windDef &&
                dropEggCoe == that.dropEggCoe &&
                dropWeaponCoe == that.dropWeaponCoe &&
                dropArmetCoe == that.dropArmetCoe &&
                dropArmorCoe == that.dropArmorCoe &&
                dropNecklaceCoe == that.dropNecklaceCoe &&
                dropBraceletCoe == that.dropBraceletCoe &&
                dropShoesCoe == that.dropShoesCoe &&
                dropStoneCoe == that.dropStoneCoe &&
                dropGemCoe == that.dropGemCoe &&
                dropExplodeCoe == that.dropExplodeCoe &&
                dropSpecialCoe == that.dropSpecialCoe &&
                specialType == that.specialType &&
                dropDeltalevCoe == that.dropDeltalevCoe &&
                skillLev == that.skillLev &&
                viewtominimap == that.viewtominimap &&
                vipview == that.vipview &&
                petInheritatk == that.petInheritatk &&
                petInherithp == that.petInherithp &&
                expType == that.expType &&
                Objects.equals(name, that.name) &&
                Objects.equals(magic1, that.magic1) &&
                Objects.equals(magic2, that.magic2) &&
                Objects.equals(magic3, that.magic3);
    }

    @Override
    public int hashCode() {

        return Objects.hash(id, name, type, lookface, length, fat, life, mana, attackMax, attackMin, defence, dexterity, dodge, helmetType, armorType, weaponrType, weaponlType, attackRange, viewRange, escapeLife, attackSpeed, moveSpeed, level, attackUser, dropMoneyMin, dropMoneyMax, sizeAdd, action, runSpeed, dropArmet, dropNecklace, dropArmor, dropRing, dropWeapon, dropShield, dropShoes, dropMoneyChance, dropItemChance, magicType, magicDef, magicHitrate, atkHitrate, aiType, defence2, explodeItemChance1, explodeItemChance2, explodeItemChance3, dropItemRule, profession, magic1, magic2, magic3, frequency, extraBattlelev, extraExp, extraDamage, earthDef, waterDef, fireDef, windDef, dropEggCoe, dropWeaponCoe, dropArmetCoe, dropArmorCoe, dropNecklaceCoe, dropBraceletCoe, dropShoesCoe, dropStoneCoe, dropGemCoe, dropExplodeCoe, dropSpecialCoe, specialType, dropDeltalevCoe, skillLev, viewtominimap, vipview, petInheritatk, petInherithp, expType);
    }
}
