package com.example.resume.controllers;

import com.example.resume.entities.Experience;
import com.example.resume.service.ExperienceService;
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
@RequestMapping("/api/experience")
@Api(tags = {"experience"})
public class ExperienceController {

    private final ExperienceService experienceService;

    @GetMapping("/")
    @ApiOperation("Постраничное получение списка опыта")
    @ApiResponses({
            @ApiResponse(code = 200, message = "Список опыта получен"),
            @ApiResponse(code = 401, message = "Пользователь не авторизован"),
            @ApiResponse(code = 500, message = "Возникли ошибки во время получения списка")
    })
    public List<Experience> getAllExperience() {
        return experienceService.getAllExperience();
    }
}
