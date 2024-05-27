package checkmarx.microserviceresourcebackend.models;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class Microservice {
    @JsonProperty("microserviceId")
    private String microserviceId;
    @JsonProperty("language")
    private String language;

}
