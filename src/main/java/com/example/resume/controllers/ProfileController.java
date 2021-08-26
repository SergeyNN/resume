package com.example.resume.controllers;

import com.example.resume.entities.Profile;
import com.example.resume.mappers.ProfileMapper;
import com.example.resume.model.ProfileDto;
import com.example.resume.service.ProfileService;
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
@RequestMapping("/api/profile")
@Api(tags = {"profile"})
public class ProfileController {

    private final ProfileService profileService;
    private final ProfileMapper profileMapper;

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

    @PostMapping("/")
    @SneakyThrows
    @ApiOperation("Создание нового пользователя")
    @ApiResponses({
            @ApiResponse(code = 200, message = "Пользователь создано"),
            @ApiResponse(code = 400, message = "Ошибка валидации входных данных"),
            @ApiResponse(code = 401, message = "Пользователь не авторизован"),
            @ApiResponse(code = 500, message = "Возникли ошибки во время создания пользователь")
    })
    public ResponseEntity<ProfileDto> createProfile(@RequestBody ProfileDto profileDto) {
        this.profileService.saveProfile(this.profileMapper.entityFromDto(profileDto));
        return ResponseEntity.status(HttpStatus.OK).body(profileDto);
    }

    @PutMapping("/{id}")
    @ApiOperation("Редактирование пользователя")
    @ApiResponses({
            @ApiResponse(code = 200, message = "Пользователь сохранен"),
            @ApiResponse(code = 400, message = "Возникли ошики во время валидации входных параметров"),
            @ApiResponse(code = 401, message = "Пользователь не авторизован"),
            @ApiResponse(code = 500, message = "Возникли ошибки во время сохранения пользователя")
    })
    public ResponseEntity<ProfileDto> edit(@PathVariable
                                                  long id,
                                          @RequestBody
                                                  ProfileDto profileDto) {
        profileDto.setId(id);
        this.profileService.saveProfile(this.profileMapper.entityFromDto(profileDto));
        return ResponseEntity.status(HttpStatus.OK).body(profileDto);
    }
//    public Profile createProfile(@RequestBody Profile profile) {
//        this.profileService.saveProfile(profile);
//        return profile;
//    }
}
