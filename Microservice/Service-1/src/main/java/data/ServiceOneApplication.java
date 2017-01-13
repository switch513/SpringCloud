package data;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * Created by switch on 17/1/13.
 */
@EnableDiscoveryClient
@SpringBootApplication
public class ServiceOneApplication {
    public static void main(String[] args) {
        new SpringApplicationBuilder(ServiceOneApplication.class).web(true).run(args);
    }
}
