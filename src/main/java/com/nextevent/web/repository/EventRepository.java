package com.nextevent.web.repository;

import com.nextevent.web.models.Event;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EventRepository extends JpaRepository<Event, Long> {
}
