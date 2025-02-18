package de.johngockel.hexagonal.example.abadapter;

import de.johngockel.hexagonal.example.a.exceptions.FooNotFoundException;
import de.johngockel.hexagonal.example.a.models.Foo;
import de.johngockel.hexagonal.example.a.usecases.FindFooByIdUseCase;
import de.johngockel.hexagonal.example.b.models.FooDto;
import de.johngockel.hexagonal.example.b.storageports.FooStoragePort;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Slf4j
@Service
@RequiredArgsConstructor
class AdapterFooService implements FooStoragePort {

    private final FindFooByIdUseCase findFooByIdUseCase;

    @Override
    public FooDto findById(Long id) {
        try {
            Foo foo = findFooByIdUseCase.findById(id);
            return FooDto.builder()
                    .id(foo.getId())
                    .name(foo.getName())
                    .build();
        } catch (FooNotFoundException e) {
            log.error(e.getMessage(), e);
        }
        return null;
    }

}
