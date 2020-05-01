package com.mine.service;

import java.util.List;
import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;

import com.mine.model.QryDtl;

@Service
public class QryDtlDao {
    private JdbcTemplate jdbcTemplate;

    @Autowired
    public void setDataSource(final DataSource dataSource) {
        jdbcTemplate = new JdbcTemplate(dataSource);
    }

    public int getCountOfQry() {
        return jdbcTemplate.queryForObject("SELECT COUNT(*) FROM brch_qry_dtl", Integer.class);
    }

    public List<QryDtl> getAllQryDtls() {
        return jdbcTemplate.query("SELECT acc, rpt_sum, tran_date, amt, dr_cr_flag FROM brch_qry_dtl", new QryDtlRowMapper());
    }
}