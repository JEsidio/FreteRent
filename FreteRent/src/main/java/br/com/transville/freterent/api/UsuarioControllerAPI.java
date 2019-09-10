package br.com.transville.freterent.api;

import java.util.List;
import java.util.Optional;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
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
		return new ResponseEntity(usuario,HttpStatus.OK);
		//return ResponseEntity.ok().build();
	}
	
	@PutMapping(path="/{id}")
	public ResponseEntity<?> update (@PathVariable("id") long id, @Valid @RequestBody Usuario usuario){
		Optional<Usuario> talvezUsuario = usuarioService.findById(id);
			if (!talvezUsuario.isPresent())
				return ResponseEntity.notFound().build();
	
			Usuario usuarioAntigo = talvezUsuario.get();
			usuarioAntigo.setNome(usuario.getNome());
			usuarioAntigo.setEmail(usuario.getEmail());
			usuarioAntigo.setDataNascimento(usuario.getDataNascimento());
			
			usuarioService.save(usuarioAntigo);
				
			return new ResponseEntity(usuarioAntigo,HttpStatus.OK);
	}
	
	
	@DeleteMapping(path="/{id}")
	public ResponseEntity<?> delete (@PathVariable("id") long id){
		Optional<Usuario> talvezUsuario = usuarioService.findById(id);
			if (!talvezUsuario.isPresent())
				return ResponseEntity.notFound().build();
			
			usuarioService.delete(talvezUsuario.get());
			return ResponseEntity.ok().build();
	}
	
}
