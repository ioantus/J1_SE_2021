package main.lesson6;

import java.util.UUID;

public class EmployeeDto extends PersonDto {


    public EmployeeDto(UUID uuid, String name, Integer age, Integer callCount) {
        super(uuid, name, age, callCount);
    }
}
