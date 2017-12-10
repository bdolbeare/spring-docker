package sbl.co.springdocker;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by brian on 12/9/17.
 */
@RestController
public class Controller {

    @RequestMapping("/")
    public String helloWorld() {
        return "Hello World!";
    }
}
