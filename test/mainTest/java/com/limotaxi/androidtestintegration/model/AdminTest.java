package com.limotaxi.androidtestintegration.model;

import org.junit.Assert;

import org.junit.Test;

public class AdminTest {
    @Test
    public void testShouldAdminNameIsAdmin() {
        Admin admin = new Admin();
        Assert.assertEquals("a", admin.getName());
    }
}
