package com.mine;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.mine.service.QryDtlDao;
import com.mine.model.QryDtl;
import com.mine.config.AppConfig;

public class App {
    public static void main(String[] args) {
        
        ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
        
        QryDtlDao qry = context.getBean(QryDtlDao.class);
        System.out.println(qry.getCountOfQry());

        List<QryDtl> qryDtls = qry.getAllQryDtls();
        for (QryDtl x: qryDtls) {
            System.out.println(x);
        }
    }
}