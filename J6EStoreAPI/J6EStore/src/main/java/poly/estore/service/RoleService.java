package poly.estore.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import poly.estore.dao.RoleDAO;
import poly.estore.entity.Role;

@Service
public class RoleService {
	@Autowired
	RoleDAO dao;

	public List<Role> findAll() {
		return dao.findAll();
	}
}
