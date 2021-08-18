package com.example.resume.entities;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Data
@Entity
@Table(name = "skills")
public class Skills extends Details {

    @Column(nullable = false)
    private String name;
}
