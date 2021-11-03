package com.choucair.certification.automationpractice.stepsdefinitions;


import com.choucair.certification.automationpractice.model.UserData;
import com.choucair.certification.automationpractice.questions.VerificarResultado;
import com.choucair.certification.automationpractice.tasks.CrearCuenta;
import com.choucair.certification.automationpractice.tasks.IgresarEmail;

import com.choucair.certification.automationpractice.tasks.OpenThePage;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.actors.OnlineCast;
import net.serenitybdd.screenplay.actors.OnStage;


import java.util.List;

import static net.serenitybdd.screenplay.actors.OnStage.theActorCalled;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

public class CreacionCuentaStepdefinition {

    @Before
    public void setup(){
        OnStage.setTheStage(new OnlineCast());
    }

    @Given("^(.*) ingresa un email valido$")
    public void IngresaUnEmailValido(String nameActor, List<String> strEmail) {
        theActorCalled(nameActor).wasAbleTo(OpenThePage.Automationpractice());
        theActorInTheSpotlight().attemptsTo(IgresarEmail.enElCampo(strEmail.get(0)));
    }
    @When("^diligencio formulario de creacion de usuario con los datos$")
    public void diligencioFormularioDeCreacionDeUsuarioConLosDatos(List<UserData> dataUser) {
        theActorInTheSpotlight().attemptsTo(CrearCuenta.enElFormularioUser(dataUser));

    }
    @Then("^verifico que el en el perfil de usuario se visualice el nombre$")
    public void verificoQueElEnElPerfilDeUsuarioSeVisualiceElNombre(List<String> lisDataPerfil) {
        theActorInTheSpotlight().should(GivenWhenThen.seeThat(VerificarResultado.enElPefilCon(lisDataPerfil.get(0),lisDataPerfil.get(1))));
    }

}
