package com.zamayi.demo.model;

import org.springframework.data.mongodb.repository.MongoRepository;

public interface MissionRepository extends MongoRepository<Mission, String> {
}
