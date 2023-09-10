package com.crud.learnjpapostgres.service;

import com.crud.learnjpapostgres.domain.dao.Portfolio;
import com.crud.learnjpapostgres.domain.dto.PortfolioDto;

import java.util.List;

public interface PortfolioService {
    Portfolio create(Portfolio portfolio);
    Portfolio update(Long id, Portfolio portfolio);
    Boolean delete(Long id);
    List<Portfolio> findAll();
    Portfolio findById(Long id);
    PortfolioDto mapToDto(Portfolio portfolio);
    Portfolio mapToEntity(PortfolioDto portfolioDto);
}
