package com.nextevent.web.service;

import com.nextevent.web.dto.EventDto;

import java.util.List;

public interface EventService {

    void createEvent(Long clubId, EventDto eventDto);

    List<EventDto> findAllEvents();
}
