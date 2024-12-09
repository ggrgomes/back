package gus.ifpe.edu.ppo.Service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import gus.ifpe.edu.ppo.Entity.Usuario;
import gus.ifpe.edu.ppo.Repository.UsuarioDAO;

@Service
public class UsuarioService {

	@Autowired
	private UsuarioDAO dao;
	
	public Usuario cadastrarUsuario(Usuario u) {
		return dao.save(u);
	}
	
	public List<Usuario> listarUsuarios(){
		return dao.findAll();
	}
	
	public Usuario atualizarUsuario(Usuario u) {
		return dao.save(u);
	}
	
	public void removerUsuario(Long id) {
		dao.deleteById(id);;
	}
	
	public  Optional<Usuario> buscarLogin(Long id) {
		return dao.findById(id);
		
	}
}
