package com.jannchie.biliob.object;

import java.util.Date;

public class UserGuessingResult {
    private String name;
    private Date averageDate;
    private Double credit;
    private Long score;
    private Date reachDate;
    private Date averageCreateTime;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getAverageDate() {
        return averageDate;
    }

    public void setAverageDate(Date averageDate) {
        this.averageDate = averageDate;
    }

    public Double getCredit() {
        return credit;
    }

    public void setCredit(Double credit) {
        this.credit = credit;
    }

    public Long getScore() {
        return score;
    }

    public void setScore(Long score) {
        this.score = score;
    }

    public Date getReachDate() {
        return reachDate;
    }

    public void setReachDate(Date reachDate) {
        this.reachDate = reachDate;
    }

    public Date getAverageCreateTime() {
        return averageCreateTime;
    }

    public void setAverageCreateTime(Date averageCreateTime) {
        
        this.averageCreateTime = averageCreateTime;
    }
}
