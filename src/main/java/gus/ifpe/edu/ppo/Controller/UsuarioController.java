package gus.ifpe.edu.ppo.Controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import gus.ifpe.edu.ppo.Entity.Usuario;
import gus.ifpe.edu.ppo.Service.UsuarioService;

@RestController
public class UsuarioController {

	@Autowired
	private UsuarioService service;
	
	@GetMapping("/usuario/listar")
	public List<Usuario> listarUsuarios(){
		return this.service.listarUsuarios();
	}
	
	@PostMapping("/usuario/cadastrar")
	public Usuario cadastrarUsuario(@RequestBody Usuario u) {
		return this.service.cadastrarUsuario(u);
	}
	
	@PutMapping("/usuario/atualizar")
	public Usuario atualizarUsuario(@RequestBody Usuario u) {
		return this.service.atualizarUsuario(u);
	}
	
	@DeleteMapping("/usuario/deletar/{Id}")
	public void deletarUsuario(@PathVariable Long id) {
		this.service.removerUsuario(id);
	}
	
	@GetMapping("/usuario/buscar/{Id}")
	public Optional<Usuario> buscarLogin(@PathVariable Long Id) {
		return this.service.buscarLogin(Id);
	}
}
