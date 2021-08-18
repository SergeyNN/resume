package com.example.resume.entities;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Data
@Entity
@Table(name = "education")
public class Education extends Details{

    @Column(nullable = false)
    private String school;

    private String degree;

    @Column(name = "field_of_study",nullable = false)
    private String fieldOfStudy;

    @Column(name = "start_month", nullable = false)
    private String startMonth;

    @Column(name = "start_year", nullable = false)
    private String startYear;

    @Column(name = "end_month", nullable = false)
    private String endMonth;

    @Column(name = "end_year", nullable = false)
    private String endYear;
}
