package com.br.starwarsapi.controller;

import com.br.starwarsapi.client.ClientFeign;
import com.br.starwarsapi.model.Planets;
import com.br.starwarsapi.service.PeopleService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@AllArgsConstructor
@RestController
@RequestMapping("/")
public class PlanetsController {

    private ClientFeign clientFeign;

    private PeopleService peopleService;

    @GetMapping(value = "planets/{id}")
    public Planets getPlanetsById(@PathVariable("id") Long id) {
        return clientFeign.getPlanetsById(id);
    }

}
