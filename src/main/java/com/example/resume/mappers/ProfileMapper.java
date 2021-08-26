package com.example.resume.mappers;

import com.example.resume.entities.Profile;
import com.example.resume.model.ProfileDto;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class ProfileMapper implements Mapper<Profile, ProfileDto> {
    @Override
    public ProfileDto dtoFromEntity(Profile profile) {
        ProfileDto profileDto = new ProfileDto();
        profileDto.setId(profile.getId());
        profileDto.setCity(profile.getCity());
        profileDto.setBirthDay(profile.getBirthDay());
        profileDto.setCountry(profile.getCountry());
        profileDto.setEmail(profile.getEmail());
        profileDto.setFirstName(profile.getFirstName());
        profileDto.setLastName(profile.getLastName());
        profileDto.setPhone(profile.getPhone());
        profileDto.setObjective(profile.getObjective());
        profileDto.setSummary(profile.getSummary());
        return profileDto;
    }

    @Override
    public Profile entityFromDto(ProfileDto profileDto) {
        Profile profile = new Profile();
        profile.setId(profileDto.getId());
        profile.setCity(profileDto.getCity());
        profile.setBirthDay(profileDto.getBirthDay());
        profile.setCountry(profileDto.getCountry());
        profile.setEmail(profileDto.getEmail());
        profile.setFirstName(profileDto.getFirstName());
        profile.setLastName(profileDto.getLastName());
        profile.setPhone(profileDto.getPhone());
        profile.setObjective(profileDto.getObjective());
        profile.setSummary(profileDto.getSummary());
        return profile;
    }
}
