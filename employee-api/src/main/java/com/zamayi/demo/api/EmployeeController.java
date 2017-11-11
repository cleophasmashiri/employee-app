package com.zamayi.demo.api;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import com.zamayi.demo.model.Employee;
import com.zamayi.demo.model.EmployeeRepository;

@RestController
@RequestMapping("/employee")
public class EmployeeController {

	@Autowired
	private EmployeeRepository repository;

	@RequestMapping(method = RequestMethod.POST)
	public ResponseEntity<Employee> create(@RequestBody Employee emp) {
		Employee result = this.repository.save(emp);
		return new ResponseEntity<Employee>(result, HttpStatus.OK);
	}

	@RequestMapping(method = RequestMethod.GET, value="/{employeeId}")
	public ResponseEntity<Employee> get(@PathVariable String employeeId) {
		return new ResponseEntity<Employee>(this.repository.findOne(employeeId), HttpStatus.OK);
	}

}
