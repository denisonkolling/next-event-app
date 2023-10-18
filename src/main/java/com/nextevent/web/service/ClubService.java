package com.nextevent.web.service;

import com.nextevent.web.dto.ClubDto;
import com.nextevent.web.models.Club;

import java.util.List;

public interface ClubService {

    List<ClubDto> findAllClubs();

    Club saveClub(Club club);

}
