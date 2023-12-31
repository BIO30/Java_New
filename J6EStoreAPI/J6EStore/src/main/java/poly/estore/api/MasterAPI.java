package poly.estore.api;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import poly.estore.entity.Account;
import poly.estore.service.AccountService;

@CrossOrigin("*")
@RestController
public class MasterAPI {
	@Autowired
	AccountService accountService;
	
	@GetMapping("/api/masters")
	public List<Account> getMaster(){
		return accountService.findMasters();
	}
	
	
	
}