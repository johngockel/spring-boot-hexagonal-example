package de.johngockel.hexagonal.example.b.models;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Table(name = "bars")
@Entity
@Getter
@Setter
@ToString
@RequiredArgsConstructor
public class Bar {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @Column(nullable = false)
    private Long id;

    private String name;
    private Long fooId;

}
