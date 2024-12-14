package pl.effectivedev.effento.app.rest.converter;

import org.springframework.core.convert.converter.Converter;
import pl.effectivedev.effento.events.model.UserId;

public class UserIdFromStringConverter implements Converter<String, UserId> {
    @Override
    public UserId convert(String value) {
        return UserId.of(value);
    }
}
