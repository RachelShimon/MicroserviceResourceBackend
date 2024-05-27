package checkmarx.microserviceresourcebackend.services;

import checkmarx.microserviceresourcebackend.models.Resource;

import java.io.IOException;
import java.util.List;

public interface IResourceService {
    public List<Resource> getResources() throws IOException;
}
