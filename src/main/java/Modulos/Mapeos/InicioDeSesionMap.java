package Modulos.Mapeos;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class InicioDeSesionMap {
    public static Target CAMPO_INGRESAR_USUARIO = Target.the("campo para ingresar el usuario").located(By.id("com.coordinadora.timgoo.qa:id/etxtEmail"));
    public static Target TEXT_1 = Target.the("Ingresar primer numero de la contraseña ").locatedBy("//android.widget.LinearLayout[1]/android.widget.FrameLayout/android.widget.EditText");
    public static Target TEXT_2 = Target.the("Ingresar segundo numero de la contraseña").locatedBy("//android.widget.LinearLayout[2]/android.widget.FrameLayout/android.widget.EditText");
    public static Target TEXT_3 = Target.the("Ingresar tercer numero de la contraseña").locatedBy("//android.widget.LinearLayout[3]/android.widget.FrameLayout/android.widget.EditText");
    public static Target TEXT_4 = Target.the("Ingresar cuarto numero de la contraseña").locatedBy("//android.widget.LinearLayout[4]/android.widget.FrameLayout/android.widget.EditText");
    public static Target BOTON_CONTINUAR_GLOBAL = Target.the("Boton Continuar global en la app").locatedBy("//*[contains(@text,'CONTINUAR')]");
    public static Target BOTON_CONFIRMAR_GLOBAL = Target.the("Boton CONFIRMAR global en la app").locatedBy("//*[contains(@text,'CONFIRMAR')]");
    public static Target CERRAR_SESION = Target.the("boton cerrar sesion global en la app").locatedBy("//*[contains(@text,'Cerrar sesión')]");
    public static Target BOTON_ACEPTAR_GLOBAL = Target.the("boton aceptar global en la app").locatedBy("//*[contains(@text,'ACEPTAR')]");
    public static Target BOTON_CANCELAR_GLOBAL = Target.the("presionar boton cancelar global en la app").locatedBy("//*[contains(@text,'CANCELAR')]");
    public static Target BOTON_RETROCEDER = Target.the("Boton regresar").located(By.id("com.coordinadora.timgoo.qa:id/go_back_button"));
    public static Target MENU_DE_LOS_3_PUNTOS = Target.the("Boton para hacer apertura del menu de los 3 puntos").locatedBy("//android.widget.TextView[@content-desc=\"More\"]");

}
