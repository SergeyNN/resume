package com.example.resume.entities;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Data
@Entity
@Table(name = "experience")
public class Experience extends Details{

    @Column(nullable = false)
    private String title;

    @Column(name = "employment_type", nullable = false)
    private String employmentType;

    @Column(name = "company_name", nullable = false)
    private String companyName;

    private String location;

    @Column(name = "current_work")
    private Boolean currentWork;

    @Column(name = "start_month", nullable = false)
    private String startMonth;

    @Column(name = "start_year", nullable = false)
    private String startYear;

    @Column(name = "end_month", nullable = false)
    private String endMonth;

    @Column(name = "end_year", nullable = false)
    private String endYear;

    private String headline;

    @Column(columnDefinition="text")
    private String description;
}
