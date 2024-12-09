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

import gus.ifpe.edu.ppo.Entity.Login;
import gus.ifpe.edu.ppo.Service.LoginService;

@RestController
public class LoginController {
	
	@Autowired
	private LoginService service;
	
	@GetMapping("/login/listar")
	public List<Login> listarLogins(){
		return this.service.listarLogins();
	}
	
	@PostMapping("/login/cadastrar")
	public Login cadastrarLogin(@RequestBody Login l) {
		return this.service.cadastrarLogin(l);
	}
	
	@PutMapping("/login/atualizar")
	public Login atualizarLogin(@RequestBody Login l) {
		return this.service.atualizarLogin(l);
	}
	
	@DeleteMapping("/login/deletar/{id}")
	public void deletarAutor(@PathVariable Long id) {
		this.service.removerLogin(id);
	}
	
	@GetMapping("/login/buscar/{id}")
	public Optional<Login> buscarLogin(@PathVariable Long id) {
		return this.service.buscarLogin(id);
	}

}
