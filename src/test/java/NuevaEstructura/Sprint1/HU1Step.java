package NuevaEstructura.Sprint1;

import Modulos.Funciones.InicioDeSesionFuncion;
import drivers.AppiumAndroidDriver;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;

import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

public class HU1Step {
    @Before
    public void before() {
        OnStage.setTheStage(new OnlineCast());
    }
    //*******************************************Scenario 1***************************************//
    @Given("que me encuentro haciendo apertura de la aplicacion go")
    public void que_me_encuentro_haciendo_apertura_de_la_aplicacion_go() {
        OnStage.theActorCalled("Apertura de la app go").can(BrowseTheWeb.with(AppiumAndroidDriver.appium().on()));
        theActorInTheSpotlight().attemptsTo(InicioDeSesionFuncion.ingresoUsuario("27351"));
        InicioDeSesionFuncion.seleccionDeUnItemEnCoordenadasEspecificas(440, 690);
        theActorInTheSpotlight().attemptsTo(InicioDeSesionFuncion.ingresoPassword("1", "2", "3", "4"));
    }

    @When("ingrese correctamente el gt")
    public void ingrese_correctamente_el_gt() {

    }

    @Then("se debe poder visualizar un titulo referente al equipo")
    public void se_debe_poder_visualizar_un_titulo_referente_al_equipo() {

    }
}
