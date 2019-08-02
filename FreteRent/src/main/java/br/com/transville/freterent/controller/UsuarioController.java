package br.com.transville.freterent.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
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
	
	@GetMapping("/listar")
	public ModelAndView listar() {
		List<Usuario> listaUsuarios = usuarioService.getAll();
		return new ModelAndView("usuario/listar", "usuarios", listaUsuarios);
	}
	
	@GetMapping("/novo")
	public ModelAndView createForm(@ModelAttribute Usuario usuario) {
		return new ModelAndView("usuario/form");
	}
	
	@PostMapping(params="form")
	public ModelAndView save(@Valid Usuario usuario, BindingResult result) {
		
		if (result.hasErrors()) {
			return new ModelAndView("usuario/form");
		}
		usuarioService.save(usuario);
		return new ModelAndView("redirect:/usuario/listar");
	}
	
	@GetMapping(value="/edit/{id}")
	public ModelAndView eidt(@PathVariable("id") Usuario usuario) {
		return new ModelAndView("usuario/form", "usuario", usuario);
	}
	
	@GetMapping(value="/delete/{id}")
	public ModelAndView delete(@PathVariable("id") Usuario usuario) {
		usuarioService.delete(usuario);
		return new ModelAndView("redirect:/usuario/listar");
	}
	
}
