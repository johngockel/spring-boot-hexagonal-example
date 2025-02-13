package de.johngockel.hexagonal.example.persistence;

import de.johngockel.hexagonal.example.b.BarRepository;
import de.johngockel.hexagonal.example.b.model.Bar;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BarJpaRepository extends JpaRepository<Bar, Long>, BarRepository {
}
