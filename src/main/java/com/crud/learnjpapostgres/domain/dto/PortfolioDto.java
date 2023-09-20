package com.crud.learnjpapostgres.domain.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class PortfolioDto {
    private long id;
    private String name;
    private String description;
    private String category;
    private String image;
    private LocalDateTime date;
    private String url;

}
