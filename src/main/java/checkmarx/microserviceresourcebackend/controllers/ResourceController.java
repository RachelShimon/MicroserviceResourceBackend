package checkmarx.microserviceresourcebackend.controllers;

import checkmarx.microserviceresourcebackend.models.Resource;
import checkmarx.microserviceresourcebackend.services.IMicroservicesService;
import checkmarx.microserviceresourcebackend.services.IResourceService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.io.IOException;
import java.util.List;

@RestController
@RequestMapping("/api")
public class ResourceController {

    private final IResourceService resourceService;

    public ResourceController(IResourceService resourceService) {
        this.resourceService = resourceService;
    }

    @GetMapping("/resources")
    public List<Resource> getResources() throws IOException {
        return resourceService.getResources();
    }
}
