package com.choucair.certification.automationpractice.userinterface;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class HomeUI {
    public static final Target BUTTON_INICIO_SESION = Target.the("Boton iniciar sesion")
            .located(By.xpath("//*[contains(text(),'Sign in')]"));
}
