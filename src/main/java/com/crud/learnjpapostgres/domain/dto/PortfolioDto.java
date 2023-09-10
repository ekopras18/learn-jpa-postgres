package com.crud.learnjpapostgres.domain.dto;

import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
@JsonFormat(pattern = "dd-MM-yyyy HH:mm:ss", timezone = "Asia/Jakarta")

public record PortfolioDto(String name, String description, String category, String image, Date date, String url) {}
