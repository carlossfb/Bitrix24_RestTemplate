package com.bitrix24.carlossfb.consume_api.model;

import java.util.Date;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Data;

@Data
@JsonIgnoreProperties(ignoreUnknown = true)
public class Task {

    @JsonProperty("ID")
    String Id;

    @JsonProperty("TASK_ID")
    String taskId;

    @JsonProperty("USER_ID")
    String userId;

    @JsonProperty("COMMENT_TEXT")
    String commentText;
    
    @JsonProperty("SECONDS")
    Number seconds;
        
    @JsonProperty("MINUTES")
    Number minutes;
        
    @JsonProperty("SOURCE")
    Number source;
        
    @JsonProperty("CREATED_DATE")
    Date createdDate;
        
    @JsonProperty("DATE_START")
    Date dateStart;
        
    @JsonProperty("DATE_STOP") 
    Date dateStop;  
}
