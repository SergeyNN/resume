package com.example.resume.controllers;

import com.example.resume.entities.Education;
import com.example.resume.model.EducationDto;
import com.example.resume.service.EducationService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;
import lombok.RequiredArgsConstructor;
import lombok.SneakyThrows;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

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

    @GetMapping("/{id}")
    @ApiOperation("Получение образования по ИД")
    @ApiResponses({
            @ApiResponse(code = 200, message = "Образование получено"),
            @ApiResponse(code = 400, message = "Ошибка валидации входных данных"),
            @ApiResponse(code = 401, message = "Пользователь не авторизован"),
            @ApiResponse(code = 500, message = "Возникли ошибки во время получения образования")
    })
    public Education getEducation(@PathVariable("id") Long id) {
        return this.educationService.getEducation(id);
    }

    @PostMapping("/")
    @SneakyThrows
    @ApiOperation("Создание нового образовния")
    @ApiResponses({
            @ApiResponse(code = 201, message = "Образование создано"),
            @ApiResponse(code = 400, message = "Ошибка валидации входных данных"),
            @ApiResponse(code = 401, message = "Пользователь не авторизован"),
            @ApiResponse(code = 500, message = "Возникли ошибки во время создания образования")
    })
    public Education createEducation(@RequestBody Education education) {
        this.educationService.saveEducation(education);
        return education;
    }
}
