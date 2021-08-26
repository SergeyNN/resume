package com.example.resume.service.impl;

import com.example.resume.entities.Education;
import com.example.resume.repositories.EducationRepository;
import com.example.resume.service.EducationService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Slf4j
@Service
@RequiredArgsConstructor
public class EducationServiceImpl implements EducationService {

    private final EducationRepository educationRepository;

    @Override
    public List<Education> getAllEducation() {
        return this.educationRepository.findAll();
    }

    @Override
    public Education getEducation(Long id) {
        return this.educationRepository.getById(id);
    }

    @Override
    public void saveEducation(Education education) {
        this.educationRepository.save(education);
    }
}
