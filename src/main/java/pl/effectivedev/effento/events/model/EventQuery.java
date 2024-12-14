package pl.effectivedev.effento.events.model;

import lombok.Builder;
import lombok.Getter;
import lombok.ToString;

import java.time.ZonedDateTime;

@Builder
public record EventQuery(UserId subscriberUserId, ZonedDateTime dateFrom, ZonedDateTime dateTo) {}
