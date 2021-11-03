package com.choucair.certification.automationpractice.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;

import java.util.List;

import static com.choucair.certification.automationpractice.userinterface.FormCatalogo.*;


public class SeleccionarProducto implements Task {
    private List<String> lisDatos;

    public SeleccionarProducto(List<String> lisDatos) {
        this.lisDatos = lisDatos;
    }

    public static SeleccionarProducto enElCatalogo(List<String> lisDatos) {
        return Tasks.instrumented(SeleccionarProducto.class,lisDatos);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(MENU_OPTION_CATEGORIA.of(lisDatos.get(0))),
               // Click.on(MENU_OPTION_SUBCATEGORIA.of(lisDatos.get(1))),
                Click.on(OPTION_PRODUCTO.of(lisDatos.get(2))),
                Click.on(BUTTON_ADD_PRODUCT),
                Click.on(BUTTON_PROCEED_TO_CHECKOUT)
        );
    }
}
