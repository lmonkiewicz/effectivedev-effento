package pl.effectivedev.effento.events.exception;

import pl.effectivedev.effento.events.model.EventId;
import pl.effectivedev.effento.events.model.UserId;

import static java.lang.String.format;

public class InsufficientPrivilegesForEventOperationException extends RuntimeException {
    public InsufficientPrivilegesForEventOperationException(UserId userId, EventId eventId) {
        super(format("Insufficient privileges for '%s' to perform operation on '%s'", userId, eventId));
    }
}
