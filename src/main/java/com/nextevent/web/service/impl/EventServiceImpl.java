package com.nextevent.web.service.impl;

import com.nextevent.web.dto.EventDto;
import com.nextevent.web.models.Club;
import com.nextevent.web.models.Event;
import com.nextevent.web.repository.ClubRepository;
import com.nextevent.web.repository.EventRepository;
import com.nextevent.web.service.EventService;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

import static com.nextevent.web.mapper.EventMapper.mapToEvent;
import static com.nextevent.web.mapper.EventMapper.mapToEventDto;

@Service
public class EventServiceImpl implements EventService {

    private EventRepository eventRepository;

    private ClubRepository clubRepository;

    public EventServiceImpl(EventRepository eventRepository, ClubRepository clubRepository) {
        this.eventRepository = eventRepository;
        this.clubRepository = clubRepository;
    }


    @Override
    public void createEvent(Long clubId, EventDto eventDto) {
        Club club = clubRepository.findById(clubId).get();
        Event event = mapToEvent(eventDto);
        event.setClub(club);
        eventRepository.save(event);
    }

    @Override
    public List<EventDto> findAllEvents() {
        List<Event> events = eventRepository.findAll();
        return events.stream().map((event) -> mapToEventDto(event)).collect(Collectors.toList());
    }

}
