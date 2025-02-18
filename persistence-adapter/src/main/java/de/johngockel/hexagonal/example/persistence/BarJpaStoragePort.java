package de.johngockel.hexagonal.example.persistence;

import de.johngockel.hexagonal.example.b.storageports.BarStoragePort;
import de.johngockel.hexagonal.example.b.models.Bar;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BarJpaStoragePort extends JpaRepository<Bar, Long>, BarStoragePort {
}
