package com.example.resume.controllers;

import com.example.resume.entities.Education;
import com.example.resume.service.EducationService;
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
@RequestMapping("/api/educations")
@Api(tags = {"education"})
public class EducationController {

    private final EducationService educationService;

    @GetMapping("/")
    @ApiOperation("Постраничное получение списка образования")
    @ApiResponses({
            @ApiResponse(code = 200, message = "Список образований получен"),
            @ApiResponse(code = 401, message = "Пользователь не авторизован"),
            @ApiResponse(code = 500, message = "Возникли ошибки во время получения списка")
    })
    public List<Education> getAllEducation() {
        return educationService.getAllEducation();
    }
}
