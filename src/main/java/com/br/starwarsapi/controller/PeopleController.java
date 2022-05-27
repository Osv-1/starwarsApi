package com.br.starwarsapi.controller;

import com.br.starwarsapi.client.ClientFeign;
import com.br.starwarsapi.model.People;
import com.br.starwarsapi.model.Planets;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@AllArgsConstructor
@RestController
@RequestMapping("/")
public class PeopleController {

    private  ClientFeign clientFeign;

    @GetMapping(value = "people/{id}")
    public People getPeopleById(@PathVariable("id") Long id) {
        return clientFeign.getPeopleById(id);
    }

    @GetMapping(value = "people")
    public List<People> getAllPeople() {
        return clientFeign.getAllPeople();
    }

    @GetMapping(value = "planets/{id}")
    public Planets getPlanetsById(@PathVariable("id") Long id) {
        return clientFeign.getPlanetsById(id);
    }


}
