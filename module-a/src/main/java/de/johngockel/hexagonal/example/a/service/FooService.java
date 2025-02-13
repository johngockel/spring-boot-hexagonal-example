package de.johngockel.hexagonal.example.a.service;

import de.johngockel.hexagonal.example.a.FooModuleBApi;
import de.johngockel.hexagonal.example.a.FooPublicApi;
import de.johngockel.hexagonal.example.a.FooRepository;
import de.johngockel.hexagonal.example.a.model.Foo;
import java.util.List;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
class FooService implements FooPublicApi, FooModuleBApi {

  private final FooRepository repository;

  @Override
  public Foo findByName(@NonNull String name) {
    return null;
  }

  @Override
  public Foo findById(@NonNull Long id) {
    return null;
  }

  @Override
  public List<Foo> findAll() {
    return List.of();
  }
}
