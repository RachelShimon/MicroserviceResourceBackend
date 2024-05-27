package checkmarx.microserviceresourcebackend.services;

import checkmarx.microserviceresourcebackend.models.Resource;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.stereotype.Service;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

@Service
public class ResourceService implements IResourceService{
    private static final String RESOURCES_FILE = "src/main/resources/resources.json";

    @Override
    public List<Resource> getResources() throws IOException {
        byte[] jsonData = Files.readAllBytes(Paths.get(RESOURCES_FILE));
        ObjectMapper objectMapper = new ObjectMapper();
        return objectMapper.readValue(jsonData, new TypeReference<List<Resource>>() {});
    }
}
