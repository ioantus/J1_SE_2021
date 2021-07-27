package main.lesson6;

import lombok.Data;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import lombok.ToString;

import java.io.Serializable;
import java.util.UUID;

@Setter
@ToString(exclude = {"callCount"})
@RequiredArgsConstructor
public class PersonDto implements Serializable {
    private final UUID uuid;
    private final String name;
    private final Integer age;
    private final transient Integer callCount;
    public String surname;
}
