package gus.ifpe.edu.ppo.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import gus.ifpe.edu.ppo.Repository.LoginDAO;

@Service
public class AutorizacaoService implements UserDetailsService {

	@Autowired
	private LoginDAO dao ;

	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {

		return dao.findByApelido(username);
	}

}
