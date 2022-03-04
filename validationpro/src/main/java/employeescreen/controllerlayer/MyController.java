package employeescreen.controllerlayer;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import employeescreen.modellayer.Employee;
import employeescreen.servicelayer.Myservicelayer;


@RestController
@RequestMapping("/api/v1")
public class MyController {
	@Autowired
	Myservicelayer sl;
	

	@PostMapping("/addd")
	public ResponseEntity<Employee> meth(@Valid @RequestBody Employee employee){
		Employee emp=sl.inserting(employee);
		return new ResponseEntity<Employee>(emp,HttpStatus.OK);
		
		}
	
	
	
	
	
}
