package de.johngockel.hexagonal.example.a.usecases;

import de.johngockel.hexagonal.example.a.models.Foo;
import lombok.NonNull;

public interface CreateFooUseCase {

    Foo create(@NonNull Foo foo);

}
