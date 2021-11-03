package com.choucair.certification.automationpractice.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

import java.util.List;

import static com.choucair.certification.automationpractice.userinterface.HomeUI.*;
import static com.choucair.certification.automationpractice.userinterface.FormLoginUI.*;

public class Login implements Task {
    private String strEmail;
    private String strPass;

    public Login(String strEmail, String strPass) {
        this.strEmail = strEmail;
        this.strPass = strPass;
    }

    public static Login with(List<String> listCredenciales) {
        return Tasks.instrumented(Login.class,listCredenciales.get(0),listCredenciales.get(1));
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(BUTTON_INICIO_SESION),
                Enter.theValue(strEmail).into(INPUT_EMAIL_LOGIN),
                Enter.theValue(strPass).into(INPUT_PASSWORD_LOGIN),
                Click.on(BUTTON_LOGIN)
        );
    }
}
