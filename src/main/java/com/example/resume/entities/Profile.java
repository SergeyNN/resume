package com.example.resume.entities;

import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;
import java.time.LocalDate;

@Data
@Entity
@Table(name = "profile")
public class Profile {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "first_name")
    private String firstName;

    @Column(name = "last_name")
    private String lastName;

    @Column(name = "birth_day")
    private String birthDay;

    //@Column(nullable = false)
    private String phone;

    //@Column(nullable = false)
    private String email;

    //@Column(nullable = false)
    private String country;

    //@Column(nullable = false)
    private String city;

    @Column(columnDefinition="text")
    private String objective;

    @Column(columnDefinition="text")
    private String summary;
}
