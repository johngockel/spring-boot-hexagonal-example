package de.johngockel.hexagonal.example.persistence;

import de.johngockel.hexagonal.example.a.FooRepository;
import de.johngockel.hexagonal.example.a.model.Foo;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FooJpaRepository extends JpaRepository<Foo, Long>, FooRepository {
}
