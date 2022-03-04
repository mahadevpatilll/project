package employeescreen.servicelayer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import employeescreen.daolayer.DaoLayer;
import employeescreen.modellayer.Employee;

@Service
public class Myservicelayer {
	
	@Autowired
	DaoLayer dao;

	public Employee inserting(Employee employee) {

		
		return dao.save(employee);
	}

	
	
	
}
