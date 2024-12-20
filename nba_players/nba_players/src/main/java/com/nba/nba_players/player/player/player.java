package com.nba.nba_players.player.player;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="player_stats")
public class player {
    @Id
    @Column(name = "player_name")
    private String name;
    private String team;
    private Double age;
    private String position;
    private Integer gp;
    private Double mpg;
    private Double ftpercentage;
    private Double threept;
    private Double eFg;
    private Double TrueShoot;
    private Double ppg;
    private Double rpg;
    private Double apg;
    private Double spg;
    private Double bpg;
    private Double tpg;
    private Double ortg;
    private Double drtg;

    public player() {

    }

    public player(String name) {
        this.name = name;
    }

    public player(Double spg, Double bpg, Double tpg, Double ortg, Double drtg, Double apg, Double rpg, Double trueShoot, Double threept, Double ppg, Double eFg, Double ftpercentage, Double mpg, Integer gp, String position, Double age, String team, String name) {
        this.spg = spg;
        this.bpg = bpg;
        this.tpg = tpg;
        this.ortg = ortg;
        this.drtg = drtg;
        this.apg = apg;
        this.rpg = rpg;
        TrueShoot = trueShoot;
        this.threept = threept;
        this.ppg = ppg;
        this.eFg = eFg;
        this.ftpercentage = ftpercentage;
        this.mpg = mpg;
        this.gp = gp;
        this.position = position;
        this.age = age;
        this.team = team;
        this.name = name;
    }

    public Integer getGp() {
        return gp;
    }

    public void setGp(Integer gp) {
        this.gp = gp;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTeam() {
        return team;
    }

    public void setTeam(String team) {
        this.team = team;
    }

    public Double getAge() {
        return Math.floor(age);
    }

    public void setAge(Double age) {
        this.age = age;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public Double getMpg() {
        return mpg;
    }

    public void setMpg(Double mpg) {
        this.mpg = mpg;
    }

    public Double getFtpercentage() {
        return ftpercentage;
    }

    public void setFtpercentage(Double ftpercentage) {
        this.ftpercentage = ftpercentage;
    }

    public Double getThreept() {
        return threept;
    }

    public void setThreept(Double threept) {
        this.threept = threept;
    }

    public Double geteFg() {
        return eFg;
    }

    public void seteFg(Double eFg) {
        this.eFg = eFg;
    }

    public Double getTrueShoot() {
        return TrueShoot;
    }

    public void setTrueShoot(Double trueShoot) {
        TrueShoot = trueShoot;
    }

    public Double getPpg() {
        return ppg;
    }

    public void setPpg(Double ppg) {
        this.ppg = ppg;
    }

    public Double getRpg() {
        return rpg;
    }

    public void setRpg(Double rpg) {
        this.rpg = rpg;
    }

    public Double getApg() {
        return apg;
    }

    public void setApg(Double apg) {
        this.apg = apg;
    }

    public Double getSpg() {
        return spg;
    }

    public void setSpg(Double spg) {
        this.spg = spg;
    }

    public Double getBpg() {
        return bpg;
    }

    public void setBpg(Double bpg) {
        this.bpg = bpg;
    }

    public Double getTpg() {
        return tpg;
    }

    public void setTpg(Double tpg) {
        this.tpg = tpg;
    }

    public Double getOrtg() {
        return ortg;
    }

    public void setOrtg(Double ortg) {
        this.ortg = ortg;
    }

    public Double getDrtg() {
        return drtg;
    }

    public void setDrtg(Double drtg) {
        this.drtg = drtg;
    }
}
