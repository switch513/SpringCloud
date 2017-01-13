package data.services.web;

import data.services.ServiceClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by switch on 17/1/13.
 */
@RestController
public class ServiceController {

    @Autowired
    ServiceClient serviceClient;

    @RequestMapping(value = "/add", method = RequestMethod.GET)
    public Integer add() {
        return serviceClient.add(10, 20);
    }

}
