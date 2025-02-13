package de.johngockel.hexagonal.example.rest.controller;

import de.johngockel.hexagonal.example.b.BarPublicApi;
import de.johngockel.hexagonal.example.b.model.Bar;
import java.util.List;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/bars")
@RequiredArgsConstructor
public class BarController {

  private final BarPublicApi barApi;

  @GetMapping
  public List<Bar> findAll() {
    return barApi.findAll();
  }

  @GetMapping("/{id}")
  public Bar findById(@PathVariable("id") Long id) {
    return barApi.findById(id);
  }

}
