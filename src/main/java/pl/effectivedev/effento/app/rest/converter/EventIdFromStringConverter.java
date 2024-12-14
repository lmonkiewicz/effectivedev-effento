package pl.effectivedev.effento.app.rest.converter;

import org.springframework.core.convert.converter.Converter;
import pl.effectivedev.effento.events.model.EventId;

public class EventIdFromStringConverter implements Converter<String, EventId> {
    @Override
    public EventId convert(String value) {
        return EventId.of(value);
    }
}
