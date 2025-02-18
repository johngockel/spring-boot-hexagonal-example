package de.johngockel.hexagonal.example.a.usecases;

import de.johngockel.hexagonal.example.a.models.Foo;

import java.util.List;

public interface FindAllFoosUseCase {

    List<Foo> findAll();

}
