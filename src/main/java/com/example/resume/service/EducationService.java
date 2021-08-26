package com.example.resume.service;

import com.example.resume.entities.Education;

import java.util.List;

public interface EducationService {

    List<Education> getAllEducation();

    Education getEducation(Long id);

    void saveEducation(Education education);
}
