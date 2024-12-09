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

import gus.ifpe.edu.ppo.Entity.Linha;
import gus.ifpe.edu.ppo.Service.LinhaService;

@RestController
public class LinhaController {
	
	@Autowired
	private LinhaService service;
	
	@GetMapping("/linha/listar")
	public List<Linha> listarLinhas(){
		return this.service.listarLinhas();
	}
	
	@PostMapping("/linha/cadastrar")
	public Linha cadastrarLinha(@RequestBody Linha l) {
		return this.service.cadastrarLinha(l);
	}
	
	@PutMapping("/linha/atualizar")
	public Linha atualizarLinha(@RequestBody Linha l) {
		return this.service.atualizarLinha(l);
	}
	
	@DeleteMapping("/linha/deletar/{id}")
	public void deletarAutor(@PathVariable Long id) {
		this.service.removerLInha(id);
	}
	
	@GetMapping("/linha/buscar/{id}")
	public Optional<Linha> buscarLinah(@PathVariable Long id) {
		return this.service.buscarLinha(id);
	}

}
