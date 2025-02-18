package de.johngockel.hexagonal.example.b.usecases;

import de.johngockel.hexagonal.example.b.models.Bar;

import java.util.List;

public interface FindAllBarsUseCase {

    List<Bar> findAll();

}
