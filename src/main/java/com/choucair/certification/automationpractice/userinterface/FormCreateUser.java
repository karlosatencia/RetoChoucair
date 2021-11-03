package com.choucair.certification.automationpractice.userinterface;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class FormCreateUser {

    public static final Target RADIO_BUTTON_TITULO_MR = Target.the("Titulo mr.")
            .located(By.id("id_gender1"));

    public static final Target RADIO_BUTTON_TITULO_MRS = Target.the("Titulo mrs.")
            .located(By.id("id_gender2"));

    public static final Target INPUT_NOMBRE = Target.the("Input nombre")
            .located(By.id("customer_firstname"));

    public static final Target INPUT_APELLIDO = Target.the("Input apellido")
            .located(By.id("customer_lastname"));

    public static final Target INPUT_PASSWORD = Target.the("Input password")
            .located(By.id("passwd"));

    public static final Target SELECT_DIA = Target.the("")
            .located(By.id("days"));

    public static final Target SELECT_MES = Target.the("")
            .located(By.id("months"));

    public static final Target SELECT_YEAR = Target.the("")
            .located(By.id("years"));

    public static final Target INPUT_DIRECCION = Target.the("")
            .located(By.id("address1"));

    public static final Target INPUT_CIUDAD = Target.the("")
            .located(By.id("city"));

    public static final Target SELECT_ESTADO = Target.the("")
            .located(By.id("id_state"));

    public static final Target INPUT_CODIGO_POSTAL = Target.the("")
            .located(By.id("postcode"));

    public static final Target SELECT_PAIS = Target.the("")
            .located(By.id("id_country"));

    public static final Target INPUT_CELULAR = Target.the("")
            .located(By.id("phone_mobile"));

    public static final Target BUTTON_REGISTRAR = Target.the("")
            .located(By.id("submitAccount"));

}
