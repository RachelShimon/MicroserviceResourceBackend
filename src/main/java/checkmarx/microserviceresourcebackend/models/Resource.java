package checkmarx.microserviceresourcebackend.models;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Setter
@Getter
public class Resource {
    @JsonProperty("name")
    private String name;
    @JsonProperty("access")
    private String access;
    @JsonProperty("fileName")
    private String fileName;
    @JsonProperty("type")
    private String type;
    @JsonProperty("category")
    private String category;
    @JsonProperty("actions")
    private List<String> actions;
    @JsonProperty("microservices")
    private List<String> microservices;

}
