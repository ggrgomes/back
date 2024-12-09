package gus.ifpe.edu.ppo.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import gus.ifpe.edu.ppo.Entity.Debito;

public interface DebitoDAO extends JpaRepository<Debito, Long> {

}
