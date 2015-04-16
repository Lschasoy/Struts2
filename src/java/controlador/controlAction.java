package controlador;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;
import org.apache.struts.action.DynaActionForm;

public class controlAction extends org.apache.struts.action.Action {

    public ActionForward execute(ActionMapping mapping,ActionForm form,
	HttpServletRequest httpServletRequest, 
	HttpServletResponse httpServletResponse) throws Exception {
        ActionForward respuesta = null;
        // Obtenemos acceso al formulario
        DynaActionForm formulario = (DynaActionForm) form;
        // aqui recuperamos los datos
        System.out.println("El mejor jugador es: " + formulario.get("mejorjugador"));
        String jugador = formulario.get("mejorjugador").toString();
        if (jugador.equals("CRISTIANO")){
            respuesta = mapping.findForward("correcto");
        }else{        
            respuesta = mapping.getInputForward();
        }
            return respuesta; // redirigimos a la presentacion
    }
}// End de la clase


