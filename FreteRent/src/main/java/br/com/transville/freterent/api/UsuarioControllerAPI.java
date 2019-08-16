package br.com.transville.freterent.api;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.transville.freterent.model.Usuario;
import br.com.transville.freterent.service.UsuarioService;

@RestController
@RequestMapping("/api/usuario")
public class UsuarioControllerAPI {

	@Autowired
	private UsuarioService usuarioService;
	
	@GetMapping()
	public ResponseEntity<List<Usuario>> getAll(){
		return new ResponseEntity(usuarioService.getAll(),HttpStatus.OK);
	}
	
	@PostMapping()
	public ResponseEntity<?> save(@RequestBody @Valid Usuario usuario){
		usuarioService.save(usuario);
		return ResponseEntity.ok().build();
	}
}
