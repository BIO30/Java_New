package poly.estore.security;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import poly.estore.entity.Account;
import poly.estore.service.AccountService;

@Service
public class UserDetailsServiceImpl implements UserDetailsService{
	@Autowired
	AccountService accountService;
	
	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		try {
			Account account = accountService.findByUsername(username);
			return new UserDetailsImpl(account);
		} catch (UsernameNotFoundException e) {
			throw new UsernameNotFoundException("User not found");
		}
	}

}
