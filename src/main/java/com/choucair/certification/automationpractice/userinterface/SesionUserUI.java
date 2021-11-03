package com.choucair.certification.automationpractice.userinterface;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class SesionUserUI {
    public static final Target LABEL_PERFIL = Target.the("")
            .located(By.xpath("//a[@title='View my customer account']"));
}
