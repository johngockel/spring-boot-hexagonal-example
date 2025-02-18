package de.johngockel.hexagonal.example.rest.controller;

import de.johngockel.hexagonal.example.a.exceptions.FooNotFoundException;
import de.johngockel.hexagonal.example.a.usecases.FindAllFoosUseCase;
import de.johngockel.hexagonal.example.a.models.Foo;
import java.util.List;

import de.johngockel.hexagonal.example.a.usecases.FindFooByIdUseCase;
import de.johngockel.hexagonal.example.rest.dto.ErrorDto;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/foos")
@RequiredArgsConstructor
public class FooController {

  private final FindAllFoosUseCase findAllFoosUseCase;
  private final FindFooByIdUseCase findFooByIdUseCase;

  @GetMapping
  public List<Foo> findAll() {
    return findAllFoosUseCase.findAll();
  }

  @GetMapping("/{id}")
  public Foo findById(@PathVariable("id") Long id) throws FooNotFoundException {
    return findFooByIdUseCase.findById(id);
  }

  @ExceptionHandler({FooNotFoundException.class})
  public ResponseEntity<ErrorDto> handleNotFoundException(Exception e) {
    ErrorDto errorDto = ErrorDto.builder()
            .message(e.getMessage())
            .build();
    return new ResponseEntity<>(errorDto, HttpStatus.NOT_FOUND);
  }

}
