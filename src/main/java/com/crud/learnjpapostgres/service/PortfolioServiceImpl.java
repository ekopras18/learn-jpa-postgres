package com.crud.learnjpapostgres.service;

import com.crud.learnjpapostgres.domain.dao.Portfolio;
import com.crud.learnjpapostgres.domain.dto.PortfolioDto;
import com.crud.learnjpapostgres.repository.PortfolioRepository;
import com.fasterxml.jackson.databind.ObjectMapper;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Transactional
public class PortfolioServiceImpl implements PortfolioService{
    private final PortfolioRepository portfolioRepository;
    private final ObjectMapper mapper;

    @Autowired
    public PortfolioServiceImpl(PortfolioRepository portfolioRepository, ObjectMapper mapper) {
        this.portfolioRepository = portfolioRepository;
        this.mapper = mapper;
    }

    @Override
    public Portfolio create(Portfolio portfolio) {
        portfolioRepository.save(portfolio);
        return null;
    }

    @Override
    public Portfolio update(Long id, Portfolio portfolio) {
        final Portfolio result = findById(id);
        if(result != null){
            result.setName(portfolio.getName());
            result.setDescription(portfolio.getDescription());
            result.setCategory(portfolio.getCategory());
            result.setImage(portfolio.getImage());
            result.setDate(portfolio.getDate());
            result.setUrl(portfolio.getUrl());

            portfolioRepository.save(result);
        }
        return null;
    }

    @Override
    public Boolean delete(Long id) {
        final Portfolio result = findById(id);
        if (result != null){
            portfolioRepository.deleteById(id);
            return true;
        }
        return null;
    }


    @Override
    public List<Portfolio> findAll() {
        return portfolioRepository.findAll();
    }

    @Override
    public Portfolio findById(Long id) {
        return portfolioRepository.findById(id).orElse(null);
    }

//    ObjectMapper mapper = new ObjectMapper();

    @Override
    public PortfolioDto mapToDto(Portfolio portfolio) {
        return mapper.convertValue(portfolio, PortfolioDto.class);
    }

    @Override
    public Portfolio mapToEntity(PortfolioDto portfolioDto) {
        return mapper.convertValue(portfolioDto, Portfolio.class);
    }
}
