package com.example.resume.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;


@Data
@NoArgsConstructor
@AllArgsConstructor
public class ProfileDto {

    private Long id;
    private String firstName;
    private String lastName;
    private String birthDay;
    private String phone;
    private String email;
    private String country;
    private String city;
    private String objective;
    private String summary;
}
