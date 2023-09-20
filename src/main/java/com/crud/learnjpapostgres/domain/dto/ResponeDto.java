package com.crud.learnjpapostgres.domain.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class ResponeDto {
    private String status;
    private String message;
    private Integer code;
}
