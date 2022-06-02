package com.br.starwarsapi.service;

import com.br.starwarsapi.client.ClientFeign;
import com.br.starwarsapi.dto.PeopleDTO;
import com.br.starwarsapi.model.People;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PeopleService {

    @Autowired
    private ClientFeign clientFeign;

    public PeopleDTO findAll(){
        try {
            return clientFeign
                    .findAll()
                    .orElse(PeopleDTO.createEmptyResult());

        } catch (Exception ex) {
            ex.printStackTrace();
            return PeopleDTO.createEmptyResult();
        }

    }
}
