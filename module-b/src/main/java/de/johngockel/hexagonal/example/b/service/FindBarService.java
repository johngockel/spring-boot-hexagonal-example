package de.johngockel.hexagonal.example.b.service;

import de.johngockel.hexagonal.example.b.exceptions.BarNotFoundException;
import de.johngockel.hexagonal.example.b.models.Bar;
import de.johngockel.hexagonal.example.b.storageports.BarStoragePort;
import de.johngockel.hexagonal.example.b.usecases.FindAllBarsUseCase;
import de.johngockel.hexagonal.example.b.usecases.FindBarByIdUseCase;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
class FindBarService implements FindBarByIdUseCase, FindAllBarsUseCase {

  private final BarStoragePort barStoragePort;

  @Override
  public Bar findById(@NonNull Long id) throws BarNotFoundException {
    return barStoragePort.findById(id)
        .orElseThrow(() -> new BarNotFoundException("No bar found with id \"" + id + "\""));
  }

  @Override
  public List<Bar> findAll() {
    return barStoragePort.findAll();
  }

}
