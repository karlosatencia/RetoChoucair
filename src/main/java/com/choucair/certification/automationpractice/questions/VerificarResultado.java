package com.choucair.certification.automationpractice.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;

import static com.choucair.certification.automationpractice.userinterface.SesionUserUI.*;

public class VerificarResultado implements Question<Boolean> {
    private String strNombre;
    private String strApellido;

    public VerificarResultado(String strNombre, String strApellido) {
        this.strNombre = strNombre;
        this.strApellido = strApellido;
    }

    public static VerificarResultado enElPefilCon(String strNombre, String strApellido) {
        return new VerificarResultado(strNombre,strApellido);
    }

    @Override
    public Boolean answeredBy(Actor actor) {
        System.out.println("Peril: "+Text.of(LABEL_PERFIL).viewedBy(actor).asString());


        return Text.of(LABEL_PERFIL).viewedBy(actor).asString().equalsIgnoreCase(strNombre+" "+strApellido);
    }
}
