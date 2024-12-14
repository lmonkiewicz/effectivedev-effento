package pl.effectivedev.effento.app.rest.converter;

import org.springframework.core.convert.converter.Converter;
import pl.effectivedev.effento.events.model.EventId;

public class EventIdToStringConverter implements Converter<EventId, String> {
    @Override
    public String convert(EventId eventId) {
        return eventId.asString();
    }
}
