package de.johngockel.hexagonal.example.b.storageports;

import de.johngockel.hexagonal.example.b.models.Bar;

import java.util.List;
import java.util.Optional;

public interface BarStoragePort {

    Optional<Bar> findById(Long id);

    List<Bar> findAll();

}
