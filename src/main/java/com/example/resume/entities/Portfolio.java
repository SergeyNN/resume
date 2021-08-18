package com.example.resume.entities;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Table;

@Data
@Entity
@Table(name = "portfolio")
public class Portfolio extends Details{
}
