package com.br.starwarsapi.client;

import com.br.starwarsapi.dto.PeopleDTO;
import com.br.starwarsapi.model.People;
import com.br.starwarsapi.model.Planets;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;
import java.util.Optional;

@FeignClient(name = "get", url = "https://swapi.dev/api")
public interface ClientFeign {

    @GetMapping(value = "/people/{id}")
    People getPeopleById(@PathVariable("id") Long id);

    @GetMapping(value = "/people?limit=151")
    Optional<PeopleDTO> findAll();

    @GetMapping(value = "/planets/{id}")
    Planets getPlanetsById(@PathVariable  Long id);
    @GetMapping(value = "/planets")
    List<Planets> getAllPlanets();
}
