package com.vytrack.step_definitions;

import com.vytrack.utilities.Driver;
import io.cucumber.java.After;
import io.cucumber.java.Before;

public class Hooks {
    @Before//they come from cucumber(before and after)
    public void setUp(){


    }

    @After
    public void tearDown(){
       Driver.closeDriver();

    }

    @Before("@db")
    public void setUpdb(){




    }

    @After("@db")
    public void closeDb(){


    }




}
