package project1.mongo.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;

public interface MemberRepository extends MongoRepository<Member, Integer> {
    List<Member>getMembersBy(Integer id);
}
