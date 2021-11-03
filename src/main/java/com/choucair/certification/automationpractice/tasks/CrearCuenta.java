package com.choucair.certification.automationpractice.tasks;

import com.choucair.certification.automationpractice.model.UserData;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.*;
import net.serenitybdd.screenplay.waits.WaitUntil;

import java.util.List;
import static com.choucair.certification.automationpractice.userinterface.FormCreateUser.*;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.*;

public class CrearCuenta implements Task {
    private List<UserData> userData;

    public CrearCuenta(List<UserData> userData) {
        this.userData = userData;
    }

    public static CrearCuenta enElFormularioUser(List<UserData> dataUser) {
        return Tasks.instrumented(CrearCuenta.class,dataUser);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {

       if (userData.get(0).getTitulo().equalsIgnoreCase("Mr.")){
           actor.attemptsTo(
                   Click.on(RADIO_BUTTON_TITULO_MR)
           );
       }else if (userData.get(0).getTitulo().equalsIgnoreCase("Mrs.")){
            actor.attemptsTo(
                    Click.on(RADIO_BUTTON_TITULO_MRS)
            );
        }
       actor.attemptsTo(
               Enter.theValue(userData.get(0).getNombre()).into(INPUT_NOMBRE),
               Enter.theValue(userData.get(0).getApellido()).into(INPUT_APELLIDO),
               Enter.theValue(userData.get(0).getPasword()).into(INPUT_PASSWORD),
               SelectFromOptions.byValue(userData.get(0).getDia()).from(SELECT_DIA),
               SelectFromOptions.byValue(userData.get(0).getMes()).from(SELECT_MES),
               SelectFromOptions.byValue(userData.get(0).getYear()).from(SELECT_YEAR),
               Enter.theValue(userData.get(0).getDireccion()).into(INPUT_DIRECCION),
               Enter.theValue(userData.get(0).getCiudad()).into(INPUT_CIUDAD),
               SelectFromOptions.byVisibleText(userData.get(0).getEstado()).from(SELECT_ESTADO),
               Enter.theValue(userData.get(0).getCodigoPostal()).into(INPUT_CODIGO_POSTAL),
               SelectFromOptions.byVisibleText(userData.get(0).getPais()).from(SELECT_PAIS),
               Enter.theValue(userData.get(0).getCelular()).into(INPUT_CELULAR),
               Click.on(BUTTON_REGISTRAR)
       );

        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }
}
