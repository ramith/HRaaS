package com.ramith.hraas.controllers;

import com.ramith.hraas.domain.Person;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@RestController
public class PersonResetControler {

    @GetMapping(value = "/people")
    public List<Person> people() {
        return Arrays.asList(new Person[]{
                new Person("ramith", "jayasinghe", "Sri Lanka"),
                new Person("Jim", "Kane", "Austria")}
        );
    }
}
