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

import gus.ifpe.edu.ppo.Entity.Passe;
import gus.ifpe.edu.ppo.Service.PasseService;

@RestController
public class PasseController {
	
	@Autowired
	private PasseService service;
	

@PostMapping("/passe/cadastrar")
public Passe cadastrarPasse(@RequestBody Passe p) {
    return this.service.cadastrarPasse(p);
}

@GetMapping("/passe/listar")
public List<Passe> listarPasses(){
	return this.service.listarPasses();
}
	

@PutMapping("/passe/atualizar")
public Passe atualizarPasse(@RequestBody Passe p) {
	return this.service.atualizarPasse(p);
}

@DeleteMapping("/passe/deletar/{id}")
public void deletarPasse(@PathVariable Long id) {
	this.service.removerPasse(id);
}

@GetMapping("/passe/buscar/{id}")
public Optional<Passe> buscarLogin(@PathVariable Long id) {
	return this.service.buscarPasse(id);
}
}
