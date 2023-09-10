package com.crud.learnjpapostgres.repository;

import com.crud.learnjpapostgres.domain.dao.Portfolio;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PortfolioRepository extends JpaRepository<Portfolio, Long> {

}
