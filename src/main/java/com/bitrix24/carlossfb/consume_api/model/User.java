package com.bitrix24.carlossfb.consume_api.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Data;


@Data
@JsonIgnoreProperties(ignoreUnknown = true)
public class User {
    
    @JsonProperty("ID")
    String id;
    
    @JsonProperty("NAME")
    String name;

    @JsonProperty("LAST_NAME")
    String lastName;

    @JsonProperty("EMAIL")
    String email;

    Task[] task;

}
