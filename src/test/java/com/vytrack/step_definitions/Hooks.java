package com.vytrack.step_definitions;

import io.cucumber.java.After;
import io.cucumber.java.Before;

public class Hooks {

    @Before("@db")
    public void setUpDatabase(){
        System.out.println("\tCONNECTION DATABASE");
    }

    @Before
    public void setUp(){
        System.out.println("\tthis is coming from BEFORE");
    }

    @After("@db")
    public void tearDownDatabase(){
        System.out.println("\tCLOSING DATABASE CONNECTION");
    }

    @After
    public void tearDown(){
        System.out.println("\tthis is coming from AFTER\n");
    }




}
