package com.choucair.certification.automationpractice.userinterface;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class FormLoginUI {
    public static final Target INPUT_EMAIL = Target.the("Caja de texto email")
            .located(By.id("email_create"));
    public static final Target BUTTON_CREAR_CUENTA = Target.the("Boton crear cuenta de usuario")
            .located(By.id("SubmitCreate"));

    public static final Target INPUT_EMAIL_LOGIN = Target.the("")
            .located(By.id("email"));

    public static final Target INPUT_PASSWORD_LOGIN = Target.the("")
            .located(By.id("passwd"));

    public static final Target BUTTON_LOGIN = Target.the("")
            .located(By.id("SubmitLogin"));




}
