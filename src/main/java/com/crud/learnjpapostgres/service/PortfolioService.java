package com.crud.learnjpapostgres.service;

import com.crud.learnjpapostgres.domain.dao.Portfolio;

import java.util.List;

public interface PortfolioService {
    void create(Portfolio portfolio);

    void update(Long id, Portfolio portfolio);

    Boolean delete(Long id);

    List<Portfolio> findAll();

    Portfolio findById(Long id);
}
