package pl.effectivedev.effento.events.model;

import lombok.AccessLevel;
import lombok.EqualsAndHashCode;
import lombok.RequiredArgsConstructor;
import lombok.ToString;

public record EventId(String value) {

    public static EventId of(String value) {
        return new EventId(value);
    }

    public String asString() {
        return value;
    }
}
