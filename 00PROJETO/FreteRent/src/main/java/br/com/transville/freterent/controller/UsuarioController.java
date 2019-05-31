package br.com.transville.freterent.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import br.com.transville.freterent.model.Usuario;
import br.com.transville.freterent.service.UsuarioService;

@Controller
@RequestMapping("/usuario")
public class UsuarioController {
	
	@Autowired
	private UsuarioService usuarioService;
	
	@GetMapping()
	public ModelAndView index() {
		List<Usuario> listaUsuarios = usuarioService.getAll();
		return new ModelAndView("usuario/index", "usuarios", listaUsuarios);
	}
	
	@GetMapping("/novo")
	public ModelAndView createForm(@ModelAttribute Usuario usuario) {
		return new ModelAndView("usuario/form");
	}
	
}
