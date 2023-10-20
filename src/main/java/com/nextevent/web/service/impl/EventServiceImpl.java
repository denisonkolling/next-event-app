package com.nextevent.web.service.impl;

import com.nextevent.web.dto.EventDto;
import com.nextevent.web.models.Club;
import com.nextevent.web.models.Event;
import com.nextevent.web.repository.ClubRepository;
import com.nextevent.web.repository.EventRepository;
import com.nextevent.web.service.EventService;
import org.springframework.stereotype.Service;

@Service
public class EventServiceImpl implements EventService {

    private EventRepository eventRepository;

    private ClubRepository clubRepository;

    @Override
    public void createEvent(Long clubId, EventDto eventDto) {
        Club club = clubRepository.findById(clubId).get();
        Event event = mapToEvent(eventDto);
        event.setClub(club);
        eventRepository.save(event);
    }

    private Event mapToEvent(EventDto eventDto) {
        return Event.builder()
                .id(eventDto.getId())
                .name(eventDto.getName())
                .startTime(eventDto.getStartTime())
                .endTime(eventDto.getEndTime())
                .type(eventDto.getType())
                .photoUrl(eventDto.getPhotoUrl())
                .createdOn(eventDto.getCreatedOn())
                .updatedOn(eventDto.getUpdatedOn())
                .build();
    }
}
