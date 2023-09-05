package poly.estore.api;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import poly.estore.entity.Authority;
import poly.estore.service.AuthorityService;

@CrossOrigin("*")
@RestController
public class AuthorityAPI {
	@Autowired
	AuthorityService authorityService;
	
	@GetMapping("/api/authorities")
	public List<Authority> getAll(){
		return authorityService.findAll();
	}
	@PostMapping("/api/authorities")
	public Authority create(@RequestBody Authority authority){
		return authorityService.create(authority);
	}
	@DeleteMapping("/api/authorities/{id}")
	public void delete(@PathVariable("id") Integer id){
		authorityService.deleteById(id);
	}
}