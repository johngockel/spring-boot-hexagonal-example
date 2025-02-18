package de.johngockel.hexagonal.example.b.usecases;

import de.johngockel.hexagonal.example.b.exceptions.BarNotFoundException;
import de.johngockel.hexagonal.example.b.models.Bar;
import lombok.NonNull;

public interface FindBarByIdUseCase {

    Bar findById(@NonNull Long id) throws BarNotFoundException;

}
