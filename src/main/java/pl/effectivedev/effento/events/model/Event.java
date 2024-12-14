package pl.effectivedev.effento.events.model;

import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder;
import lombok.Builder;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.ToString;

import java.time.ZonedDateTime;

@Builder(builderClassName = "Builder", toBuilder = true)
@JsonDeserialize(builder = Event.Builder.class)
public record Event(
     UserId owner,
     String name,
     String description,
     ZonedDateTime date,
     String url,
     String imgUrl) {

    @JsonPOJOBuilder(withPrefix = "")
    public static class Builder {

    }
}
