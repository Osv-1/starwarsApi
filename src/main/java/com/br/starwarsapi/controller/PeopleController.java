package com.br.starwarsapi.controller;

import com.br.starwarsapi.client.ClientFeign;
import com.br.starwarsapi.dto.PeopleDTO;
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

    private final ClientFeign clientFeign;

    @GetMapping(value = "people/{id}")
    public PeopleDTO getPeopleById(@PathVariable("id") Long id) {
        return clientFeign.getPeopleById(id);
    }

    @GetMapping(value = "people")
    public List<PeopleDTO> getAllPeople() {
        return clientFeign.getAllPeople();
    }


}
