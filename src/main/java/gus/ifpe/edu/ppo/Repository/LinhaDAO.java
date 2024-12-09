package gus.ifpe.edu.ppo.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import gus.ifpe.edu.ppo.Entity.Linha;

public interface LinhaDAO extends JpaRepository<Linha, Long> {

}
