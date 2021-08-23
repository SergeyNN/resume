package com.example.resume.controllers;

import com.example.resume.entities.Portfolio;
import com.example.resume.service.PortfolioService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/portfolio")
@Api(tags = {"portfolio"})
public class PortfolioController {

    private final PortfolioService portfolioService;

    @GetMapping("/")
    @ApiOperation("Постраничное получение списка портфолио")
    @ApiResponses({
            @ApiResponse(code = 200, message = "Список портфолио получен"),
            @ApiResponse(code = 401, message = "Пользователь не авторизован"),
            @ApiResponse(code = 500, message = "Возникли ошибки во время получения списка")
    })
    public List<Portfolio> getAllPortfolio() {
        return portfolioService.getAllPortfolio();
    }
}
