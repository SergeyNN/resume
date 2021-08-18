package com.example.resume.entities;

import lombok.Data;

import javax.persistence.*;

@Data
@MappedSuperclass
public class Details {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne(fetch = FetchType.LAZY)
    private Profile profile;

    @Column(columnDefinition="text")
    private String description;
}
