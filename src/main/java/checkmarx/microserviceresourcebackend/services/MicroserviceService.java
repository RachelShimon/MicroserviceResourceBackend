package checkmarx.microserviceresourcebackend.services;

import checkmarx.microserviceresourcebackend.models.Microservice;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.stereotype.Service;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

@Service
public class MicroserviceService implements IMicroservicesService{
    private static final String MICROSERVICES_FILE = "src/main/resources/microservices.json";

    @Override
    public List<Microservice> getMicroservices() throws IOException {
        byte[] jsonData = Files.readAllBytes(Paths.get(MICROSERVICES_FILE));
        ObjectMapper objectMapper = new ObjectMapper();
        return objectMapper.readValue(jsonData, new TypeReference<List<Microservice>>() {});
    }
}
