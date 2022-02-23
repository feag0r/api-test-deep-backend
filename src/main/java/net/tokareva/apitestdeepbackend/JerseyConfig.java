package net.tokareva.apitestdeepbackend;

import net.tokareva.apitestdeepbackend.api.resource.TestTableResource;
import org.glassfish.jersey.server.ResourceConfig;
import org.springframework.stereotype.Component;

@Component
public class JerseyConfig extends ResourceConfig {

    public JerseyConfig()
    {
        register(TestTableResource.class);
    }
}
