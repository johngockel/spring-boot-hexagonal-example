package de.johngockel.hexagonal.example.a.usecases;

import de.johngockel.hexagonal.example.a.exceptions.FooNotFoundException;
import de.johngockel.hexagonal.example.a.models.Foo;
import lombok.NonNull;

public interface FindFooByIdUseCase {

    Foo findById(@NonNull Long id) throws FooNotFoundException;

}
