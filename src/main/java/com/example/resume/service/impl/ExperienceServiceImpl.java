package com.example.resume.service.impl;

import com.example.resume.entities.Experience;
import com.example.resume.repositories.ExperienceRepository;
import com.example.resume.service.ExperienceService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.List;

@Slf4j
@Service
@RequiredArgsConstructor
public class ExperienceServiceImpl implements ExperienceService {

    private final ExperienceRepository experienceRepository;

    @Override
    public List<Experience> getAllExperience() {
        return this.experienceRepository.findAll();
    }
}
