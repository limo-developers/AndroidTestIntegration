package com.limotaxi.androidtestintegration.model;

import junit.framework.Assert;

import org.junit.Test;
import org.junit.Before;
/**
 * Created by moltak on 15. 1. 6..
 */
public class UserTest {
    @Test
    public void testShouldHave10Length() {
        User user = new User();
        Assert.assertEquals(0, user.getLength());
    }
}
