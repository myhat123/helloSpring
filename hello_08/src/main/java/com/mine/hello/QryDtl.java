package com.mine.hello;

import java.math.BigDecimal;
import java.sql.Date;

public class QryDtl {
    String acc;
    String rptSum;
    Date tranDate;
    BigDecimal amt;
    int drCrFlag;

    public String getAcc() {
        return acc;
    }

    public void setAcc(String acc) {
        this.acc = acc;
    }

    public String getRptSum() {
        return rptSum;
    }

    public void setRptSum(String rptSum) {
        this.rptSum = rptSum;
    }

    public Date getTranDate() {
        return tranDate;
    }

    public void setTranDate(Date tranDate) {
        this.tranDate = tranDate;
    }

    public BigDecimal getAmt() {
        return amt;
    }

    public void setAmt(BigDecimal amt) {
        this.amt = amt;
    }

    public int getDrCrFlag() {
        return drCrFlag;
    }

    public void setDrCrFlag(int drCrFlag) {
        this.drCrFlag = drCrFlag;
    }

    @Override
    public String toString() {
        return acc + " " + rptSum + " " + tranDate + " " + amt + " " + drCrFlag;
    }
}