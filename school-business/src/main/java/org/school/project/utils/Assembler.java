package org.school.project.utils;

import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

public abstract class Assembler<T, D> {

    public abstract T toDto(D model);

    public abstract D fromDto(T dto);

    public List<T> toDtoList(List<D> models) {
        if(Objects.nonNull(models) || !models.isEmpty()) {
            return models.stream().map(model -> this.toDto(model)).collect(Collectors.toList());
        }
        return null;
    }

    public List<D> fromDtoList(List<T> dtos) {
        if(Objects.nonNull(dtos) || !dtos.isEmpty()) {
            return dtos.stream().map(dto -> this.fromDto(dto)).collect(Collectors.toList());
        }
        return null;
    }
}
