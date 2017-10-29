package com.kaishengit.service.impl;

import com.kaishengit.dao.AdminDao;
import com.kaishengit.service.AdminService;

/**
 * @author zhao
 */
public class AdminServiceImpl implements AdminService {

    private AdminDao adminDao;

    public void setAdminDao(AdminDao adminDao) {
        this.adminDao = adminDao;
    }

    @Override
    public void adminLogin() {
        adminDao.login();
    }

    @Override
    public int count() {
        System.out.println("method count run...");
        return 10;
    }
}
