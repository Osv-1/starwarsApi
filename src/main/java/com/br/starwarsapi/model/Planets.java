package com.br.starwarsapi.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.*;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Getter
@Setter
@Builder(toBuilder = true)
public class Planets {

    private String name;
    private String diameter;
    private String gravity;
    private String population;
    private String climate;
    private String terrain;

    @JsonProperty("rotation_period")
    private String rotationPeriod;

    @JsonProperty("orbital_period")
    private String orbitalPeriod;

    @JsonProperty("surface_water")
    private String surfaceWater;


}
