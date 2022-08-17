package com.ramith.hraas.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
public class JobDescriptionRestController {

    @GetMapping("job-descriptions")
    public List<String> jobDescriptions(){
        return Arrays.asList(new String[]{"engineering manager", "architect", "software engineer"});
    }
}
