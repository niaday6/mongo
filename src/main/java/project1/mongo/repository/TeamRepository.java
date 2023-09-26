package project1.mongo.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;

public interface TeamRepository extends MongoRepository<Team,Integer> {
    List<Team> getTeamBy(Integer id);
}
