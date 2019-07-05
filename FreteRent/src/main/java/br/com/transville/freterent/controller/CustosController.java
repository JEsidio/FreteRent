package br.com.transville.freterent.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import br.com.transville.freterent.model.Custos;
import br.com.transville.freterent.service.CustosService;

@Controller
@RequestMapping("/custos")
public class CustosController {
	@Autowired
	private CustosService custosService;
	
	@GetMapping()
	public ModelAndView index() {
		List<Custos> listaCustos = custosService.getAll();
		return new ModelAndView("custos/index", "custos", listaCustos);
	}
	
	@GetMapping("/listar")
	public ModelAndView listar() {
		List<Custos> listaCustos = custosService.getAll();
		return new ModelAndView("custos/listar", "custos", listaCustos);
	}
	
	@GetMapping("/novo")
	public ModelAndView createForm(@ModelAttribute Custos custos) {
		return new ModelAndView("custos/form");
	}
	
	@PostMapping(params="form")
	public ModelAndView save(@Valid Custos custos) {
		custosService.save(custos);
		return new ModelAndView("redirect:/custos/listar");
	}
	
	@GetMapping(value="/edit/{id}")
	public ModelAndView eidt(@PathVariable("id") Custos custos) {
		return new ModelAndView("custos/form", "custos", custos);
	}
	
	@GetMapping(value="/delete/{id}")
	public ModelAndView delete(@PathVariable("id") Custos custos) {
		custosService.delete(custos);
		return new ModelAndView("redirect:/custos/listar");
	}
}
