package de.johngockel.hexagonal.example.b.service;

import de.johngockel.hexagonal.example.a.FooModuleBApi;
import de.johngockel.hexagonal.example.b.BarPublicApi;
import de.johngockel.hexagonal.example.b.BarRepository;
import de.johngockel.hexagonal.example.b.model.Bar;
import java.util.List;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
class BarService implements BarPublicApi {

  private final BarRepository repository;
  private final FooModuleBApi fooApi;

  @Override
  public Bar findById(@NonNull Long id) {
    return repository.findById(id)
        .orElse(null);
  }

  @Override
  public List<Bar> findAll() {
    return repository.findAll();
  }
}
