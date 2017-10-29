package com.kaishengit.test;

import com.kaishengit.cglib.MyMethodInterceptor;
import com.kaishengit.dao.AdminDao;
import net.sf.cglib.proxy.Enhancer;
import org.junit.Test;

/**
 * @author zhao
 */
public class CGlibTest {

    @Test
    public void cglib() {
        MyMethodInterceptor interceptor = new MyMethodInterceptor();

        Enhancer enhancer = new Enhancer();
        enhancer.setSuperclass(AdminDao.class);
        enhancer.setCallback(interceptor);

        AdminDao adminDao = (AdminDao) enhancer.create();
        adminDao.login();

    }

}
