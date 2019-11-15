package br.com.transville.freterent;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

import br.com.transville.freterent.model.Usuario;
import br.com.transville.freterent.repository.UsuarioRepository;

@Component
	public class StartupEventListenerBean {
		
	@Autowired
    private UsuarioRepository usuarioRepository;
 
    @EventListener
    public void onApplicationEvent(ContextRefreshedEvent event) {
        if(usuarioRepository.findByLogin("user") == null) {
            Usuario user = new Usuario();
            user.setNome("user12");
            user.setLogin("user1");
            user.setSenha("use1r1");
            user.setRole("ROLE_USER");
            usuarioRepository.save(user);
        }
 
    }
}
