package com.example.resume.service;

import com.example.resume.entities.Profile;

import java.util.List;

public interface ProfileService {

    List<Profile> getAllProfiles();

    void saveProfile(Profile profile);
}
