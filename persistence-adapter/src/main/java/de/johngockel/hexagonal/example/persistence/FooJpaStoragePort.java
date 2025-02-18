package de.johngockel.hexagonal.example.persistence;

import de.johngockel.hexagonal.example.a.storageports.FooStoragePort;
import de.johngockel.hexagonal.example.a.models.Foo;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FooJpaStoragePort extends JpaRepository<Foo, Long>, FooStoragePort {
}
