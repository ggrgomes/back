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

import gus.ifpe.edu.ppo.Entity.Debito;
import gus.ifpe.edu.ppo.Service.DebitoService;

@RestController
public class DebitoController {

	
	@Autowired
	private DebitoService service;
	
	@GetMapping("/debito/listar")
	public List<Debito> listarDebitos(){
		return this.service.listarDebitos();
	}
	
	@PostMapping("/debito/cadastrar")
	public Debito cadastrarDebito(@RequestBody Debito d) {
		return this.service.cadastrarDebito(d);
	}
	
	@PutMapping("/debito/atualizar")
	public Debito atualizarDebito(@RequestBody Debito d) {
		return this.service.atualizarDebito(d);
	}
	
	@DeleteMapping("/debito/deletar/{id}")
	public void deletarHorario(@PathVariable Long id) {
		this.service.removerDebito(id);
	}
	
	@GetMapping("/debito/buscar/{id}")
	public Optional<Debito> buscarHorario(@PathVariable Long id) {
		return this.service.buscarDebito(id);
	}
}
