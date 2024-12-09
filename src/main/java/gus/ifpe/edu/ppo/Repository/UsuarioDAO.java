package gus.ifpe.edu.ppo.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import gus.ifpe.edu.ppo.Entity.Usuario;

public interface UsuarioDAO extends JpaRepository <Usuario, Long> {

}
