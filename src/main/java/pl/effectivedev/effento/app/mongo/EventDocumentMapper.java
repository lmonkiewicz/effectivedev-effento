package pl.effectivedev.effento.app.mongo;

import pl.effectivedev.effento.app.mongo.model.EventDocument;
import pl.effectivedev.effento.events.model.Event;
import pl.effectivedev.effento.events.model.UserId;

public class EventDocumentMapper {

    public EventDocument toEventDocument(UserId userId, Event event) {
        final EventDocument eventDocument = new EventDocument();
        eventDocument.setOwnerUserId(userId.asString());
        updateEventDocument(event, eventDocument);
        return eventDocument;
    }

    public Event fromEventDocument(EventDocument eventDocument) {
        return Event.builder()
                .date(eventDocument.getDate())
                .description(eventDocument.getDescription())
                .imgUrl(eventDocument.getImgUrl())
                .name(eventDocument.getName())
                .url(eventDocument.getUrl())
                .owner(UserId.of(eventDocument.getOwnerUserId()))
                .build();
    }

    public void updateEventDocument(Event event, EventDocument eventDocument) {
        eventDocument.setDate(event.date());
        eventDocument.setName(event.name());
        eventDocument.setDescription(event.description());
        eventDocument.setUrl(event.url());
        eventDocument.setImgUrl(event.imgUrl());
    }

}
