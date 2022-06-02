package com.br.starwarsapi.dto;

import com.br.starwarsapi.model.People;
import lombok.*;

import java.util.Collections;
import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class PeopleDTO {

    private List<People> results;

    public static PeopleDTO createEmptyResult() {
        var response = new PeopleDTO();
        response.setResults(Collections.emptyList());
        return response;

    }

}
