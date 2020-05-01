package com.mine;

import java.util.List;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
import org.springframework.beans.factory.annotation.Autowired;

import com.mine.service.QryDtlDao;
import com.mine.model.QryDtl;

@Component
public class App implements CommandLineRunner {

    @Autowired
    private QryDtlDao qry;

    @Override
    public void run(String... args) {
    
        System.out.println(qry.getCountOfQry());

        List<QryDtl> qryDtls = qry.getAllQryDtls();
        for (QryDtl x: qryDtls) {
            System.out.println(x);
        }
    }
}