package com.crud.learnjpapostgres.domain.dao;

import com.fasterxml.jackson.annotation.JsonFormat;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;

@Entity
@Setter
@Getter
@Table(name = "portfolio")

public class Portfolio {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @JsonFormat(pattern = "dd-MM-yyyy HH:mm:ss", timezone = "Asia/Jakarta")
    private long id;
    private String name;
    private String description;
    private String category;
    private String image;
    private Date date;
    private String url;
}
