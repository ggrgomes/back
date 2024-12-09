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

import gus.ifpe.edu.ppo.Entity.Recarga;
import gus.ifpe.edu.ppo.Service.RecargaService;

@RestController
public class RecargaController {
	
	@Autowired
	private RecargaService service;
	
	@GetMapping("/recarga/listar")
	public List<Recarga> listarRecargas(){
		return this.service.listarRecargas();
	}
	
	@PostMapping("/recarga/cadastrar")
	public Recarga cadastrarRecarga(@RequestBody Recarga r) {
		return this.service.cadastrarRecarga(r);
	}
	
	@PutMapping("/recarga/atualizar")
	public Recarga atualizarRecarga(@RequestBody Recarga r) {
		return this.service.atualizarRecarga(r);
	}
	
	@DeleteMapping("/recarga/deletar/{id}")
	public void deletarRecarga(@PathVariable Long id) {
		this.service.removerRecarga(id);
	}
	
	@GetMapping("/recarga/buscar/{id}")
	public Optional<Recarga> buscarRecarga(@PathVariable Long id) {
		return this.service.buscarRecarga(id);
	}

}
