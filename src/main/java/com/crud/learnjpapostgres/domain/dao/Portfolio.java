package com.crud.learnjpapostgres.domain.dao;

import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDateTime;

@Entity
@Setter
@Getter
@Table(name = "portfolio")
@NoArgsConstructor
@AllArgsConstructor
public class Portfolio {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
//    @Schema(
//            description = "Generated ID",
//            requiredMode = Schema.RequiredMode.REQUIRED,
//            example = "1"
//    )
    private long id;

//    @Column(name = "name", nullable = false)
//    @Schema(
//            description = "Portfolio name",
//            requiredMode = Schema.RequiredMode.REQUIRED,
//            example = "Project A"
//    )
    private String name;

//    @Column(name = "description", nullable = false)
//    @Schema(
//            description = "Portfolio description",
//            requiredMode = Schema.RequiredMode.NOT_REQUIRED,
//            example = "This is my first project"
//    )
    private String description;

//    @Column(name = "category", nullable = false)
//    @Schema(
//            description = "Portfolio category",
//            requiredMode = Schema.RequiredMode.NOT_REQUIRED,
//            example = "Project category"
//    )
    private String category;

//    @Column(name = "image", nullable = false)
//    @Schema(
//            description = "Portfolio image",
//            requiredMode = Schema.RequiredMode.NOT_REQUIRED,
//            example = "https://ekopras.engineer/portfolio/pixelplanet.png"
//    )
    private String image;

//    @Column(name = "date", nullable = false)
//    @Schema(
//            description = "Portfolio date",
//            requiredMode = Schema.RequiredMode.NOT_REQUIRED,
//            example = "2023-09-12T21:59:05.000222"
//    )
    private LocalDateTime date;

//    @Column(name = "url", nullable = false)
//    @Schema(
//            description = "Portfolio url",
//            requiredMode = Schema.RequiredMode.NOT_REQUIRED,
//            example = "https://ekopras.engineer/"
//    )
    private String url;
}
