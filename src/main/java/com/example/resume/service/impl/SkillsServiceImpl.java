package com.example.resume.service.impl;

import com.example.resume.entities.Skills;
import com.example.resume.repositories.SkillsRepository;
import com.example.resume.service.SkillsService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.List;

@Slf4j
@Service
@RequiredArgsConstructor
public class SkillsServiceImpl implements SkillsService {

    private final SkillsRepository skillsRepository;

    @Override
    public List<Skills> getAllSkills() {
        return this.skillsRepository.findAll();
    }
}
