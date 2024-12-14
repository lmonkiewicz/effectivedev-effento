package pl.effectivedev.effento.app.mongo.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.convert.converter.Converter;
import org.springframework.data.mongodb.core.convert.MongoCustomConversions;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;
import pl.effectivedev.effento.app.mongo.converter.ZonedDateTimeFromDateConverter;
import pl.effectivedev.effento.app.mongo.converter.ZonedDateTimeToDateConverter;

import java.util.ArrayList;
import java.util.List;

@Configuration
@EnableMongoRepositories(basePackages = "pl.effectivedev.effento")
public class MongoConfig {

    @Bean
    public MongoCustomConversions customConversions(){
        List<Converter<?,?>> converters = new ArrayList<>();
        converters.add(new ZonedDateTimeFromDateConverter());
        converters.add(new ZonedDateTimeToDateConverter());
        return new MongoCustomConversions(converters);
    }
}
