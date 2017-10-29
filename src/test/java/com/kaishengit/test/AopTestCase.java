package com.kaishengit.test;

import com.kaishengit.service.AdminService;
import com.kaishengit.service.impl.AdminServiceImpl;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author zhao
 */
public class AopTestCase {

    @Test
    public void aop() {
        AdminServiceImpl adminServiceImpl = new AdminServiceImpl();
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
        AdminService adminService = (AdminService) applicationContext.getBean("adminService");

        adminService.adminLogin();
        adminService.count();
    }

}
