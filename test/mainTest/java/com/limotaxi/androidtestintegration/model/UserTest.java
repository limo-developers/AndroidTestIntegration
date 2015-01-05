package com.limotaxi.androidtestintegration.model;

import org.junit.Assert;

import org.junit.Test;

public class UserTest {
    @Test
    public void testShouldHave10Length() {
        User user = new User();
        Assert.assertEquals(10, user.getLength());
    }
}
