package com.example.resume.service.impl;

import com.example.resume.entities.Profile;
import com.example.resume.repositories.ProfileRepository;
import com.example.resume.service.ProfileService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.List;

@Slf4j
@Service
@RequiredArgsConstructor
public class ProfileServiceImpl implements ProfileService {

    private final ProfileRepository profileRepository;

    @Override
    public List<Profile> getAllProfiles() {
        return this.profileRepository.findAll();
    }

    @Override
    public void saveProfile(Profile profile) {
        this.profileRepository.save(profile);
    }
}
