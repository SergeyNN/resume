package com.example.resume.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@Data
@NoArgsConstructor
@AllArgsConstructor
@JsonInclude(JsonInclude.Include.NON_NULL)
public class EducationDto implements Serializable {
    private static final long serialVersionUID = -1687737380336239371L;

    private Long id;
    private Long profileId;
    private String description;
    private String school;
    private String degree;
    private String fieldOfStudy;
    private String startMonth;
    private String startYear;
    private String endMonth;
    private String endYear;
}
