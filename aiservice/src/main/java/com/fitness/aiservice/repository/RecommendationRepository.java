package com.fitness.aiservice.repository;

import com.fitness.aiservice.model.Recommendations;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;
import java.util.Optional;

public interface RecommendationRepository extends MongoRepository<Recommendations, String> {
    List<Recommendations> findByUserId(String userId);

    Optional<Recommendations> findByActivityId(String activityId);
}
