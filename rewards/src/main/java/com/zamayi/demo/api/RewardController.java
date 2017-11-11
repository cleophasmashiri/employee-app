package com.zamayi.demo.api;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import com.zamayi.demo.model.Reward;
import com.zamayi.demo.model.RewardRepository;

@RestController
@RequestMapping("/reward")
public class RewardController {

	@Autowired
	private RewardRepository repository;

	@RequestMapping(method = RequestMethod.POST)
	public ResponseEntity<Reward> create(@RequestBody Reward emp) {
		Reward result = this.repository.save(emp);
		return new ResponseEntity<Reward>(result, HttpStatus.OK);
	}

	@RequestMapping(method = RequestMethod.GET, value="/{rewardId}")
	public ResponseEntity<Reward> get(@PathVariable String rewardId) {
		return new ResponseEntity<Reward>(this.repository.findOne(rewardId), HttpStatus.OK);
	}

}
