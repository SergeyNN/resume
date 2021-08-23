package com.example.resume.controllers;

import com.example.resume.entities.Profile;
import com.example.resume.service.ProfileService;
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
@RequestMapping("/api/profile")
@Api(tags = {"profile"})
public class ProfileController {

    private final ProfileService profileService;

    @GetMapping("/")
    @ApiOperation("Постраничное получение списка профилей")
    @ApiResponses({
            @ApiResponse(code = 200, message = "Список профилей получен"),
            @ApiResponse(code = 401, message = "Пользователь не авторизован"),
            @ApiResponse(code = 500, message = "Возникли ошибки во время получения списка")
    })
    public List<Profile> getAllProfiles() {
        return profileService.getAllProfiles();
    }
}
