package de.johngockel.hexagonal.example.b.storageports;

import de.johngockel.hexagonal.example.b.models.FooDto;

public interface FooStoragePort {

    FooDto findById(Long id);

}
