package system.stepDefinitions;

import system.helpers.DriverManager;
import io.cucumber.java.After;
import io.cucumber.java.Before;

public class hooks {
    //ATIVIDADE 33
    
    @Before
    public void beforeScenario(){
        DriverManager.getDriver();
    }

    @After
    public void afterScenario(){
        DriverManager.endSession();
    }
}
