package com.darioselor.examen.persistence.dao.db.impl.jpa.entity;

import com.darioselor.examen.domain._1model.Director;
import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Entity
@Table(name = "games")
@Data
@NoArgsConstructor
public class GameEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "game_code")
    private String gameCode;
    @Column(name = "title")
    private String title;
    @Column(name = "release_year")
    private int releaseYear;
    @Column(name = "description")
    private String description;
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "director_id")
    private DirectorEntity director;
    @ManyToMany(fetch = FetchType.LAZY)
    @JoinTable(
            name = "games_characters",
            joinColumns = @JoinColumn(name = "game_id"),
            inverseJoinColumns = @JoinColumn(name = "character_id")
    )
    private List<CharacterEntity> characters;
}
