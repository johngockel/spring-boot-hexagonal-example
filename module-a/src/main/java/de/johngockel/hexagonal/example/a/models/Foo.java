package de.johngockel.hexagonal.example.a.models;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Table(name = "foos")
@Entity
@Getter
@Setter
@ToString
@RequiredArgsConstructor
public class Foo {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @Column(nullable = false)
    private Long id;

    private String name;

}
