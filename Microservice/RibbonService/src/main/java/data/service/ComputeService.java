package data.service;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

/**
 * Created by switch on 17/1/13.
 */
@Service
public class ComputeService {
    @Autowired
    RestTemplate restTemplate;

    @HystrixCommand(fallbackMethod = "addServiceFallBack")
    public String addService() {
        return restTemplate.getForEntity("http://service1/add?a=10&b=20", String.class).getBody();
    }

    public String addServiceFallBack() {
        return "error";
    }


}
