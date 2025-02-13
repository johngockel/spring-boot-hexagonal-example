package de.johngockel.hexagonal.example.a;

import de.johngockel.hexagonal.example.a.model.Foo;
import java.util.List;
import java.util.Optional;

public interface FooRepository {

  Optional<Foo> findById(Long id);
  List<Foo> findAll();
  Optional<Foo> findByName(String name);

}
