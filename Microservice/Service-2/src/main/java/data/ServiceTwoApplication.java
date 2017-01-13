package data;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * Created by switch on 17/1/13.
 */
@EnableDiscoveryClient
@SpringBootApplication
public class ServiceTwoApplication {
    public static void main(String[] args) {
        new SpringApplicationBuilder(ServiceTwoApplication.class).web(true).run(args);
    }
}
