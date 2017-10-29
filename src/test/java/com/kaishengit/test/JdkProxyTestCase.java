package com.kaishengit.test;

import com.kaishengit.invocation.MyInvocation;
import com.kaishengit.service.AdminService;
import com.kaishengit.service.impl.AdminServiceImpl;
import org.junit.Test;

import java.lang.reflect.Proxy;

/**
 * @author zhao
 */
public class JdkProxyTestCase {

    @Test
    public void proxyTest() {
        AdminServiceImpl adminServiceImpl = new AdminServiceImpl();
        MyInvocation myInvocation = new MyInvocation(adminServiceImpl);

        AdminService adminService = (AdminService) Proxy.newProxyInstance(adminServiceImpl.getClass().getClassLoader(),
                adminServiceImpl.getClass().getInterfaces(),myInvocation);

        adminService.adminLogin();
    }

}
