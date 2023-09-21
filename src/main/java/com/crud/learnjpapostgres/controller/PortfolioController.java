package com.crud.learnjpapostgres.controller;

import com.crud.learnjpapostgres.domain.dao.Portfolio;
import com.crud.learnjpapostgres.domain.dto.PortfolioDto;
import com.crud.learnjpapostgres.service.PortfolioService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
// import io.swagger.v3.oas.models.OpenAPI;
import lombok.extern.slf4j.Slf4j;
import org.modelmapper.ModelMapper;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.stream.Collectors;

@Slf4j
@RestController
@RequestMapping("/api/portfolio")
public class PortfolioController {
    private final PortfolioService portfolioService;
    private final ModelMapper modelMapper;

    //    @Autowired
    public PortfolioController(PortfolioService portfolioService, ModelMapper modelMapper) {
        this.portfolioService = portfolioService;
        this.modelMapper = modelMapper;
    }

    @PostMapping(value = "", consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
    @Operation(summary = "Create Portfolio")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "200", description = "success")
    })
    public PortfolioDto create(@RequestBody PortfolioDto request) {
        Portfolio portfolio = modelMapper.map(request, Portfolio.class);
        portfolioService.create(portfolio);

        log.info("portfolio : {}", portfolio);
        return modelMapper.map(portfolio, PortfolioDto.class);
    }

    @PutMapping(value = "/{id}", consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
    @Operation(summary = "Update Portfolio")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "200", description = "success")
    })
    public PortfolioDto update(@PathVariable Long id, @RequestBody PortfolioDto request) {
        Portfolio portfolio = modelMapper.map(request, Portfolio.class);
        portfolioService.update(id, portfolio);
        return modelMapper.map(portfolio, PortfolioDto.class);
    }

    @GetMapping(value = "", consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
    @Operation(summary = "Get All Portfolio")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "200", description = "success")
    })
    public List<PortfolioDto> findAll() {
//        return portfolioService.findAll().stream().map(portfolioService::mapToDto).collect(Collectors.toList());
        List<Portfolio> result = portfolioService.findAll();

        return result.stream()
                .map(portfolio -> modelMapper.map(portfolio, PortfolioDto.class))
                .collect(Collectors.toList());
    }

    @GetMapping(value = "/{id}", consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
    @Operation(summary = "Get One Portfolio")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "200", description = "success")
    })
    public PortfolioDto findById(@PathVariable Long id) {
        Portfolio result = portfolioService.findById(id);

        return modelMapper.map(result, PortfolioDto.class);
    }

    @DeleteMapping(value = "/{id}")
    @Operation(summary = "Delete Portfolio")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "200", description = "success")
    })
    public Boolean delete(@PathVariable Long id) {
        return portfolioService.delete(id);
    }
}
