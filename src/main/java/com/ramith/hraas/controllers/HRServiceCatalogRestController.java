package com.ramith.hraas.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
public class HRServiceCatalogRestController {

    @GetMapping("/catalog")
    public List<String> catalog() {
        return Arrays.asList("payroll", "onboarding", "offboarding", "welfare", "performance management", "training");
    }
}
