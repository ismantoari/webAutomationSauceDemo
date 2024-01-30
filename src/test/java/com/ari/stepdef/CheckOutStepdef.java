package com.ari.stepdef;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;


public class CheckOutStepdef {

    Helper helper = new Helper();


    @Given(": user already atc")
    public void userAlreadyAtc() {
        System.out.println("atc");
    }


}

