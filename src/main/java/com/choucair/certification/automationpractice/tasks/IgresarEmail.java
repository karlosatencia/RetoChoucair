package com.choucair.certification.automationpractice.tasks;


import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

import static com.choucair.certification.automationpractice.userinterface.HomeUI.*;
import static com.choucair.certification.automationpractice.userinterface.FormLoginUI.*;

public class IgresarEmail implements Task {

    private String strEmail;

    public IgresarEmail(String strEmail) {
        this.strEmail = strEmail;
    }

    public static IgresarEmail enElCampo(String strEmail) {
        return Tasks.instrumented(IgresarEmail.class,strEmail);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(BUTTON_INICIO_SESION),
                Enter.theValue(strEmail).into(INPUT_EMAIL),
                Click.on(BUTTON_CREAR_CUENTA)
        );

    }
}
