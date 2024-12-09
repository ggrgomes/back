package gus.ifpe.edu.ppo.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import gus.ifpe.edu.ppo.Entity.Passe;

public interface PasseDAO  extends JpaRepository <Passe, Long>{
  
}
