package de.johngockel.hexagonal.example.rest.controller;

import de.johngockel.hexagonal.example.a.FooPublicApi;
import de.johngockel.hexagonal.example.a.model.Foo;
import java.util.List;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/foos")
@RequiredArgsConstructor
public class FooController {

  private final FooPublicApi fooApi;

  @GetMapping
  public List<Foo> findAll() {
    return fooApi.findAll();
  }

  @GetMapping("/{id}")
  public Foo findById(@PathVariable("id") Long id) {
    return fooApi.findById(id);
  }

}
