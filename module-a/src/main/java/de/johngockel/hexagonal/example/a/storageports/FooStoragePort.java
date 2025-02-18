package de.johngockel.hexagonal.example.a.storageports;

import de.johngockel.hexagonal.example.a.models.Foo;

import java.util.List;
import java.util.Optional;

public interface FooStoragePort {

    Optional<Foo> findById(Long id);

    Optional<Foo> findByName(String name);

    List<Foo> findAll();

    Foo save(Foo foo);

}

