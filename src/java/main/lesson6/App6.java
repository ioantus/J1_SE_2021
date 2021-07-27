package main.lesson6;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.util.UUID;

public class App6 {
    private volatile transient String localClassVar;

    public static void main(String[] args) throws JsonProcessingException {
        final String local = "my_local";
        String myString = Constants.MY_STRING;
        Constants.Test myTers = Constants.MY_TEST;
        final PersonDto personDto = new PersonDto(UUID.randomUUID(),"Me", 37, 15);
        final ObjectMapper objectMapper = new ObjectMapper();
        final String value = objectMapper.writeValueAsString(personDto);
        System.out.println(value);

        personDto.setSurname("Petrov");
    }
}
