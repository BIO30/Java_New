package poly.estore.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import poly.estore.dao.OrderDetailDAO;
import poly.estore.entity.Report;

@Service
public class ReportService {
	@Autowired
	OrderDetailDAO dao;
	
	public List<Report> getRevenueByCategory(){
		return dao.getRevenueByCategory();
	}
}