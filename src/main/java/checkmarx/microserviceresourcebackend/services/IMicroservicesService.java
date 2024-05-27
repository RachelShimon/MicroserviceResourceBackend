package checkmarx.microserviceresourcebackend.services;

import checkmarx.microserviceresourcebackend.models.Microservice;

import java.io.IOException;
import java.util.List;

public interface IMicroservicesService {
    List<Microservice> getMicroservices() throws IOException;
}
