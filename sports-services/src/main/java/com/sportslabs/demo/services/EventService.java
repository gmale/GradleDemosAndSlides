package com.sportslabs.demo.services;

import com.sportslabs.demo.models.Event;

import java.util.HashSet;
import java.util.Set;

public class EventService {
    private Set<Event> events;

    public void addEvent(Event e) {
        if(events == null) events = new HashSet<Event>();
        events.add(e);
    }

    public Event getEventByTitle(String title) {
        if(events == null || title == null) return null;

        for(Event event : events) {
            if(event != null && title.equalsIgnoreCase(event.getTitle()))
                return event;
        }

        return null;
    }
}
