package com.crud.learnjpapostgres.controller;

import com.crud.learnjpapostgres.domain.dao.Portfolio;
import com.crud.learnjpapostgres.domain.dto.PortfolioDto;
import com.crud.learnjpapostgres.service.PortfolioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/portfolio")
public class PortfolioController {
    private final PortfolioService portfolioService;

    @Autowired
    public PortfolioController(PortfolioService portfolioService) {
        this.portfolioService = portfolioService;
    }

    @PostMapping("/create")
    public PortfolioDto create(@RequestBody PortfolioDto request){
//        final Portfolio portfolio = portfolioService.mapToEntity(request);
        final Portfolio result = portfolioService.create(portfolioService.mapToEntity(request));

        return portfolioService.mapToDto(result);
    }

    @PutMapping("/update/{id}")
    public PortfolioDto update(@PathVariable Long id, @RequestBody PortfolioDto request){
        final Portfolio result = portfolioService.update(id,portfolioService.mapToEntity(request));

        return portfolioService.mapToDto(result);
    }

    @GetMapping("/get-all")
    public List<PortfolioDto> findAll(){
        return portfolioService.findAll().stream().map(portfolioService::mapToDto).collect(Collectors.toList());
    }

    @DeleteMapping("/delete/{id}")
    public Boolean delete(@PathVariable Long id){
        return portfolioService.delete(id);
    }
}
