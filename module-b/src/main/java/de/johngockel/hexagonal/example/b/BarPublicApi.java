package de.johngockel.hexagonal.example.b;

import de.johngockel.hexagonal.example.b.model.Bar;
import java.util.List;
import lombok.NonNull;

public interface BarPublicApi {

  Bar findById(@NonNull Long id);
  List<Bar> findAll();

}
