package Modulos.Funciones;

import Modulos.Mapeos.InicioDeSesionMap;
import drivers.AppiumAndroidDriver;
import io.appium.java_client.PerformsTouchActions;
import io.appium.java_client.TouchAction;
import io.appium.java_client.touch.offset.PointOption;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isClickable;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

public class InicioDeSesionFuncion {
    public static Performable ingresoUsuario(String ingresocodigo) {
        return
                Task.where("Ingresar un usuario",
                        WaitUntil.the(InicioDeSesionMap.CAMPO_INGRESAR_USUARIO, isVisible()),
                        WaitUntil.the(InicioDeSesionMap.CAMPO_INGRESAR_USUARIO, isClickable()),
                        Click.on(InicioDeSesionMap.CAMPO_INGRESAR_USUARIO),
                        Enter.keyValues(ingresocodigo).into(InicioDeSesionMap.CAMPO_INGRESAR_USUARIO)
                );
    }

    public static Performable ingresoPassword(String contrasena1, String contrasena2, String contrasena3, String contrasena4) {
        return
                Task.where("Ingresar un Contraseña",
                        WaitUntil.the(InicioDeSesionMap.TEXT_1, isVisible()),
                        WaitUntil.the(InicioDeSesionMap.TEXT_1, isClickable()),
                        Enter.keyValues(contrasena1).into(InicioDeSesionMap.TEXT_1),
                        WaitUntil.the(InicioDeSesionMap.TEXT_2, isVisible()),
                        WaitUntil.the(InicioDeSesionMap.TEXT_2, isClickable()),
                        Enter.keyValues(contrasena2).into(InicioDeSesionMap.TEXT_2),
                        WaitUntil.the(InicioDeSesionMap.TEXT_3, isVisible()),
                        WaitUntil.the(InicioDeSesionMap.TEXT_3, isClickable()),
                        Enter.keyValues(contrasena3).into(InicioDeSesionMap.TEXT_3),
                        WaitUntil.the(InicioDeSesionMap.TEXT_4, isVisible()),
                        WaitUntil.the(InicioDeSesionMap.TEXT_4, isClickable()),
                        Enter.keyValues(contrasena4).into(InicioDeSesionMap.TEXT_4)
                );
    }

    // SIRVE PARA SELECCIONAR LAS OPCIONES DE LOS CAMPOS AUTO COMPLETABLES
    public static void seleccionDeUnItemEnCoordenadasEspecificas(int Data1, int Data2) {
        TouchAction touchAction = new TouchAction((PerformsTouchActions) AppiumAndroidDriver.driver);
        touchAction.tap(PointOption.point(Data1, Data2)).perform();
    }

    public static void waitTime(long time) {
        try {
            Thread.sleep(time);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}

