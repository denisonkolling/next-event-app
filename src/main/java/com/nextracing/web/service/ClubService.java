package com.nextracing.web.service;

import com.nextracing.web.dto.ClubDto;
import com.nextracing.web.models.Club;

import java.util.List;

public interface ClubService {

    List<ClubDto> findAllClubs();

    Club saveClub(ClubDto clubDto);

    ClubDto findClubById(Long clubId);

    void updateClub(ClubDto club);

    void deleteClub(Long clubId);

    List<ClubDto> searchClubs(String query);
}
