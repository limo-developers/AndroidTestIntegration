package com.limotaxi.androidtestintegration.model;

import org.junit.Assert;

import org.junit.Test;

public class AdminTest {
    @Test
    public void testShouldAdminNameIsAdmin() {
        Admin admin = new Admin();
        // I want to fail a this test.
        Assert.assertEquals("passenger", admin.getName());
    }
}
