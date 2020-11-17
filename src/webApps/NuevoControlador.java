package webApps;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class NuevoControlador { 
	
	@RequestMapping("/mostrarFormulario")
	public String mostrarFormulario() { // Proporciona el Formulario (pag)
		return "FormularioBas"; // * Nombre de la pag. (Formulario)
	}
	
	@RequestMapping("/procesarFormulario")
	public String procesarFormulario() { // Muestra la respuesta (pag)
		return "FormularioPro"; // * Nombre de la pag. (Respuesta)
	}
	
	@RequestMapping("/procesarFormularioMejorado")
	public String procesarFormularioActualizado(HttpServletRequest request, Model modelo) {
		
		String nombre = request.getParameter("nombreAlumno");
		
		nombre += " es el mejor estudiante.";
		
		String mensajeFinal = "¿Quién es el mejor alumno? " + nombre; 

		// Agregando info al modelo
		
		modelo.addAttribute("Msj", mensajeFinal);
		
		return "FormularioPro";
	}
	
}


