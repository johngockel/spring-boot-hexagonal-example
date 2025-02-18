package de.johngockel.hexagonal.example.a.services;

import de.johngockel.hexagonal.example.a.exceptions.FooNotFoundException;
import de.johngockel.hexagonal.example.a.models.Foo;
import de.johngockel.hexagonal.example.a.storageports.FooStoragePort;
import de.johngockel.hexagonal.example.a.usecases.CreateFooUseCase;
import de.johngockel.hexagonal.example.a.usecases.FindAllFoosUseCase;
import de.johngockel.hexagonal.example.a.usecases.FindFooByIdUseCase;
import de.johngockel.hexagonal.example.a.usecases.FindFooByNameUseCase;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
class FooService implements FindAllFoosUseCase, FindFooByIdUseCase, FindFooByNameUseCase, CreateFooUseCase {

    private final FooStoragePort fooStoragePort;

    @Override
    public List<Foo> findAll() {
        return fooStoragePort.findAll();
    }

    @Override
    public Foo findById(@NonNull Long id) throws FooNotFoundException {
        return fooStoragePort.findById(id).orElseThrow(() -> new FooNotFoundException("No foo found with id \"" + id + "\""));
    }

    @Override
    public Foo findByName(@NonNull String name) throws FooNotFoundException {
        return fooStoragePort.findByName(name).orElseThrow(() -> new FooNotFoundException("No foo found with name \"" + name + "\""));
    }

    @Override
    public Foo create(@NonNull Foo foo) {
        return fooStoragePort.save(foo);
    }
}
