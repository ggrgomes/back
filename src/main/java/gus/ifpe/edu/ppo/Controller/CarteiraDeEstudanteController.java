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

import gus.ifpe.edu.ppo.Entity.CarteiraDeEstudante;
import gus.ifpe.edu.ppo.Service.CarteiraDeEstudanteService;

@RestController
public class CarteiraDeEstudanteController {
	
	@Autowired
	private CarteiraDeEstudanteService service;
	
	@GetMapping("/carteira/listar")
	public List<CarteiraDeEstudante> listarCarteiras(){
		return this.service.listarCarteiras();
	}
	
	@PostMapping("/carteira/cadastrar")
	public CarteiraDeEstudante cadastrarCarteira(@RequestBody CarteiraDeEstudante c) {
		return this.service.cadastrarCarteira(c);
	}
	
	@PutMapping("/carteira/atualizar")
	public CarteiraDeEstudante atualizarCarteira(@RequestBody CarteiraDeEstudante c) {
		return this.service.atualizarCarteira(c);
	}
	
	@DeleteMapping("/carteira/deletar/{id}")
	public void deletarCarteira(@PathVariable Long id) {
		this.service.removerCarteira(id);
	}
	
	@GetMapping("/carteira/buscar/{id}")
	public Optional<CarteiraDeEstudante> buscarLogin(@PathVariable Long id) {
		return this.service.buscarCarteira(id);
	}
	

}
