package poly.estore.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import poly.estore.dao.AuthorityDAO;
import poly.estore.entity.Authority;

@Service
public class AuthorityService {
	@Autowired
	AuthorityDAO dao;

	public List<Authority> findAll() {
		return dao.findAll();
	}

	public Authority create(Authority authority) {
		return dao.save(authority);
	}

	public void deleteById(Integer id) {
		dao.deleteById(id);
	}
}
