package com.limotaxi.androidtestintegration;

import android.support.test.espresso.Espresso;
import android.support.test.espresso.action.ViewActions;
import android.support.test.espresso.matcher.ViewMatchers;
import android.test.ActivityInstrumentationTestCase2;

/**
 * Created by LIMOTAXI on 2015. 1. 6..
 */
public class MainActivityTest extends ActivityInstrumentationTestCase2<MainActivity>{

    public MainActivityTest() {
        super(MainActivity.class);
    }

    @Override
    protected void setUp() throws Exception {
        super.setUp();
        getActivity();
    }

    public void testButtonClick(){
       Espresso.onView(ViewMatchers.withId(R.id.btnTest)).perform(ViewActions.click());
    }

}
