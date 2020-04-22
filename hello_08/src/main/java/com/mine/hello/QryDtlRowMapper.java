package com.mine.hello;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Date;
import java.math.BigDecimal;

import org.springframework.jdbc.core.RowMapper;

public class QryDtlRowMapper implements RowMapper<QryDtl> {

    @Override
    public QryDtl mapRow(final ResultSet rs, final int rowNum) throws SQLException {
        final QryDtl qry = new QryDtl();

        qry.setAcc(rs.getString("acc"));
        qry.setRptSum(rs.getString("rpt_sum"));
        qry.setTranDate((Date)rs.getObject("tran_date"));
        qry.setAmt((BigDecimal)rs.getObject("amt"));
        qry.setDrCrFlag(rs.getInt("dr_cr_flag"));

        return qry;
    }
}