package com.nextevent.web.service;

import com.nextevent.web.dto.EventDto;

public interface EventService {

    void createEvent(Long clubId, EventDto eventDto);

}
