package com.zamayi.demo.api;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import com.zamayi.demo.model.Mission;
import com.zamayi.demo.model.MissionRepository;

@RestController
@RequestMapping("/mission")
public class MissionController {

	@Autowired
	private MissionRepository repository;

	@RequestMapping(method = RequestMethod.POST)
	public ResponseEntity<Mission> create(@RequestBody Mission emp) {
		Mission result = this.repository.save(emp);
		return new ResponseEntity<Mission>(result, HttpStatus.OK);
	}

	@RequestMapping(method = RequestMethod.GET, value="/{mId}")
	public ResponseEntity<Mission> get(@PathVariable String mId) {
		return new ResponseEntity<Mission>(this.repository.findOne(mId), HttpStatus.OK);
	}

}
