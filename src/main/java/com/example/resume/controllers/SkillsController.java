package com.example.resume.controllers;

import com.example.resume.entities.Skills;
import com.example.resume.service.SkillsService;
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
@RequestMapping("/api/skills")
@Api(tags = {"skills"})
public class SkillsController {

    private final SkillsService skillsService;

    @GetMapping("/")
    @ApiOperation("Постраничное получение списка навыков")
    @ApiResponses({
            @ApiResponse(code = 200, message = "Список навыков получен"),
            @ApiResponse(code = 401, message = "Пользователь не авторизован"),
            @ApiResponse(code = 500, message = "Возникли ошибки во время получения списка")
    })
    public List<Skills> getAllSkills() {
        return skillsService.getAllSkills();
    }
}
