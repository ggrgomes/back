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

import gus.ifpe.edu.ppo.Entity.Horario;
import gus.ifpe.edu.ppo.Service.HorarioService;

@RestController
public class HorarioController {
	
	@Autowired
	private HorarioService service;
	
	@GetMapping("/horario/listar")
	public List<Horario> listarHorarios(){
		return this.service.listarHorarios();
	}
	
	@PostMapping("/horario/cadastrar")
	public Horario cadastrarHorario(@RequestBody Horario h) {
		return this.service.cadastrarHorario(h);
	}
	
	@PutMapping("/horario/atualizar")
	public Horario atualizarLogin(@RequestBody Horario h) {
		return this.service.atualizarHorario(h);
	}
	
	@DeleteMapping("/horario/deletar/{id}")
	public void deletarHorario(@PathVariable Long id) {
		this.service.removerHorario(id);
	}
	
	@GetMapping("/horario/buscar/{id}")
	public Optional<Horario> buscarHorario(@PathVariable Long id) {
		return this.service.buscarHorario(id);
	}

}
