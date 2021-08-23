package com.example.resume.service.impl;

import com.example.resume.entities.Portfolio;
import com.example.resume.repositories.PortfolioRepository;
import com.example.resume.service.PortfolioService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.List;

@Slf4j
@Service
@RequiredArgsConstructor
public class PortfolioServiceImpl implements PortfolioService {

    private final PortfolioRepository portfolioRepository;

    @Override
    public List<Portfolio> getAllPortfolio() {
        return this.portfolioRepository.findAll();
    }
}
