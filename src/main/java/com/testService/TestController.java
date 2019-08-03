package com.testService;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/***
 * Rest Controller.
 */
@RestController
@CrossOrigin
public class TestController {

    /***
     * @return hello word.
     */
    @GetMapping("/home")
    public String homeRequest() {
        return "Hello World!";
    }
}
