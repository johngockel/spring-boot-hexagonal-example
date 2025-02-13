package de.johngockel.hexagonal.example.a;

import de.johngockel.hexagonal.example.a.model.Foo;
import java.util.List;
import lombok.NonNull;

public interface FooPublicApi {

  Foo findById(@NonNull Long id);
  List<Foo> findAll();

}
