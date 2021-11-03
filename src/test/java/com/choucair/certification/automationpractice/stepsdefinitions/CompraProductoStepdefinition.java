package com.choucair.certification.automationpractice.stepsdefinitions;

import com.choucair.certification.automationpractice.questions.VerificarProducto;
import com.choucair.certification.automationpractice.tasks.Login;
import com.choucair.certification.automationpractice.tasks.OpenThePage;
import com.choucair.certification.automationpractice.tasks.SeleccionarProducto;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;

import java.util.List;

import static net.serenitybdd.screenplay.actors.OnStage.theActorCalled;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;


public class CompraProductoStepdefinition {
    @Before
    public void setup(){
        OnStage.setTheStage(new OnlineCast());
    }

    @Given("^(.*) inicia sesion con sus credenciales$")
    public void carlosIniciaSesionConSusCredenciales(String nameActor, List<String> listCredenciales) {
        theActorCalled(nameActor).wasAbleTo(OpenThePage.Automationpractice());
        theActorInTheSpotlight().attemptsTo(Login.with(listCredenciales));    }

    @When("^selecciona un producto y lo agrega al carrito de compra$")
    public void seleccionaUnProductoYLoAgregaAlCarritoDeCompra(List<String> lisDatos) throws Exception {
        theActorInTheSpotlight().attemptsTo(SeleccionarProducto.enElCatalogo(lisDatos));
    }

    @Then("^verifico que el producto se encuentren en carrito de compra$")
    public void verificoQueElProductoSeEncuentrenEnCarritoDeCompra(List<String> lisDataP) throws Exception {
        theActorInTheSpotlight().should(GivenWhenThen.seeThat(VerificarProducto.enCarritoCompra(lisDataP.get(0))));
    }
}
