package project1.mongo.repository;

import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.ToString;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;


@Document
@Getter
@ToString

@NoArgsConstructor
public class Member {

    @Id
    private int id;
    private String name;

@DBRef
    private Team team; // 포린키를 이렇게  쓴다.
@Builder
    public Member(String name, Team team) {
        this.name = name;
        this.team = team;
    }
}
