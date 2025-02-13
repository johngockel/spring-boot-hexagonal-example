package de.johngockel.hexagonal.example.a;

import de.johngockel.hexagonal.example.a.model.Foo;
import lombok.NonNull;

public interface FooModuleBApi {

  Foo findByName(@NonNull String name);

}
