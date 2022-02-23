package net.tokareva.apitestdeepbackend.config;

import net.tokareva.apitestdeepbackend.api.resource.SubjectResource;
import org.glassfish.jersey.server.ResourceConfig;
import org.springframework.stereotype.Component;

@Component
public class JerseyConfig extends ResourceConfig {

    public JerseyConfig()
    {
        register(SubjectResource.class);
    }
}
