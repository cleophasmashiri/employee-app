package com.zamayi.demo.model;

import org.springframework.data.mongodb.repository.MongoRepository;

public interface RewardRepository extends MongoRepository<Reward, String> {
}
