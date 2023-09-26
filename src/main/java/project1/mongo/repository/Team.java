package project1.mongo.repository;

import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.ToString;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.ArrayList;
import java.util.List;

@Document
@Getter
@ToString
@NoArgsConstructor
public class Team {
    @Id
    private int id;

    private String teamName;

    @DBRef
    private List<Member> memberList = new ArrayList<>();

    @Builder
    public Team( Integer id ,String teamName) {

        this.id=id;
        this.teamName = teamName;
    }
}
