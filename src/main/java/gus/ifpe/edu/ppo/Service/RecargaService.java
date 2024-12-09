package gus.ifpe.edu.ppo.Service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import gus.ifpe.edu.ppo.Entity.Recarga;
import gus.ifpe.edu.ppo.Repository.RecargaDAO;

@Service
public class RecargaService {

	@Autowired
	private RecargaDAO dao;

	public Recarga cadastrarRecarga(Recarga r) {
		return dao.save(r);
	}

	public List<Recarga> listarRecargas() {
		return dao.findAll();
	}

	public Recarga atualizarRecarga(Recarga r) {
		return dao.save(r);
	}

	public void removerRecarga(Long id) {
		dao.deleteById(id);

		;
	}

	public Optional<Recarga> buscarRecarga(Long id) {
		return dao.findById(id);

	}
	
}
