package com.choucair.certification.automationpractice.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.questions.Text;

import static com.choucair.certification.automationpractice.userinterface.FormCatalogo.*;

public class VerificarProducto implements Question<Boolean> {
    private String resultadoEsperado;

    public VerificarProducto(String resultadoEsperado) {
        this.resultadoEsperado = resultadoEsperado;
    }

    public static VerificarProducto enCarritoCompra(String strResultadoEsperado) {
        return new VerificarProducto(strResultadoEsperado);
    }

    @Override
    public Boolean answeredBy(Actor actor) {
        return Text.of(LABEL_NOMBRE_PRODUCTO).viewedBy(actor).asString().equalsIgnoreCase(resultadoEsperado);
    }
}
