package pl.effectivedev.effento.events;

import pl.effectivedev.effento.events.model.Event;
import pl.effectivedev.effento.events.model.EventId;
import pl.effectivedev.effento.events.model.EventQuery;
import pl.effectivedev.effento.events.model.UserId;

import java.util.List;
import java.util.Optional;

public interface EventStorage {
    EventId create(UserId userId, Event event);

    void update(EventId eventId, Event event);

    void delete(EventId eventId);

    Optional<Event> find(EventId eventId);

    void subscribe(EventId eventId, UserId userId);

    List<Event> findAll(EventQuery query);
}
