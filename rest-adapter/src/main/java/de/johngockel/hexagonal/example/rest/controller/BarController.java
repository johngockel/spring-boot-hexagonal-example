package de.johngockel.hexagonal.example.rest.controller;

import de.johngockel.hexagonal.example.b.exceptions.BarNotFoundException;
import de.johngockel.hexagonal.example.b.models.Bar;
import de.johngockel.hexagonal.example.b.usecases.FindAllBarsUseCase;
import de.johngockel.hexagonal.example.b.usecases.FindBarByIdUseCase;
import de.johngockel.hexagonal.example.rest.dto.ErrorDto;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/bars")
@RequiredArgsConstructor
public class BarController {

    private final FindBarByIdUseCase findBarByIdUseCase;
    private final FindAllBarsUseCase findAllBarsUseCase;

    @GetMapping
    public List<Bar> findAll() {
        return findAllBarsUseCase.findAll();
    }

    @GetMapping("/{id}")
    public Bar findById(@PathVariable("id") Long id) throws BarNotFoundException {
        return findBarByIdUseCase.findById(id);
    }

    @ExceptionHandler({BarNotFoundException.class})
    public ResponseEntity<ErrorDto> handleNotFoundException(Exception e) {
        ErrorDto errorDto = ErrorDto.builder()
                .message(e.getMessage())
                .build();
        return new ResponseEntity<>(errorDto, HttpStatus.NOT_FOUND);
    }

}
