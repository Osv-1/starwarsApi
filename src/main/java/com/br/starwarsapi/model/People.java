package com.br.starwarsapi.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.*;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Getter
@Setter
@Builder(toBuilder = true)

public class People {

    private String name;
    private String height;
    private String mass;
    private String gender;

    @JsonProperty("hair_color")
    private String hairColor;

    @JsonProperty("skin_color")
    private String skinColor;

    @JsonProperty("eye_color")
    private String eyeColor;

    @JsonProperty("birth_year")
    private String birthYear;

}
