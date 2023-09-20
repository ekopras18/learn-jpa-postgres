package com.crud.learnjpapostgres.service;

import com.crud.learnjpapostgres.domain.dao.Portfolio;
import com.crud.learnjpapostgres.repository.PortfolioRepository;
import jakarta.persistence.EntityNotFoundException;
import jakarta.transaction.Transactional;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Transactional
public class PortfolioServiceImpl implements PortfolioService {
    private final PortfolioRepository portfolioRepository;

    //    private final ModelMapper modelMapper;
    public PortfolioServiceImpl(PortfolioRepository portfolioRepository) {
        this.portfolioRepository = portfolioRepository;
//        this.modelMapper = modelMapper;
    }

    @Override
    public void create(Portfolio portfolio) {
        portfolioRepository.save(portfolio);
    }

    @Override
    public void update(Long id, Portfolio portfolio) {

        Portfolio result = portfolioRepository.findById(id)
                .orElseThrow(() -> new EntityNotFoundException("Portfolio not found with id: " + id));

        result.setName(portfolio.getName());
        result.setDescription(portfolio.getDescription());
        result.setCategory(portfolio.getCategory());
        result.setImage(portfolio.getImage());
        result.setDate(portfolio.getDate());
        result.setUrl(portfolio.getUrl());

        portfolioRepository.save(result);

    }

    @Override
    public Boolean delete(Long id) {
        final Portfolio result = findById(id);
        if (result != null) {
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

}
