package com.br.starwarsapi.client;

import com.br.starwarsapi.dto.PeopleDTO;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

@FeignClient(name = "get", url = "https://swapi.dev/api")
public interface ClientFeign {

    @GetMapping(value = "/people/{id}")
    PeopleDTO getPeopleById(@PathVariable("id") Long id);
    @GetMapping(value = "/people")
    List<PeopleDTO> getAllPeople();
}
