package checkmarx.microserviceresourcebackend.controllers;

import checkmarx.microserviceresourcebackend.models.Microservice;
import checkmarx.microserviceresourcebackend.services.IMicroservicesService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.io.IOException;
import java.util.List;

@RestController
@RequestMapping("/api")
public class MicroserviceController {

    private final IMicroservicesService microserviceService;
    public MicroserviceController(IMicroservicesService microserviceService) {
        this.microserviceService = microserviceService;
    }
    @GetMapping("/microservices")
    public List<Microservice> getMicroservices() throws IOException {
        return microserviceService.getMicroservices();
    }
}
