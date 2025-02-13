package de.johngockel.hexagonal.example.b;

import de.johngockel.hexagonal.example.b.model.Bar;
import java.util.List;
import java.util.Optional;

public interface BarRepository {

  Optional<Bar> findById(Long id);
  List<Bar> findAll();

}
