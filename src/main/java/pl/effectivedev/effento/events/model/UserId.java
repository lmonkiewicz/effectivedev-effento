package pl.effectivedev.effento.events.model;

import lombok.AccessLevel;
import lombok.EqualsAndHashCode;
import lombok.RequiredArgsConstructor;
import lombok.ToString;

public record UserId(String value) {

    public static UserId of(String value) {
        return new UserId(value);
    }

    public String asString() {
        return value;
    }
}
