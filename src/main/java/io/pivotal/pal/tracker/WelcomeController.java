
package io.pivotal.pal.tracker;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

    @RestController
    public class WelcomeController {

        @RequestMapping("/")
        public String sayHello() {
            return "hello";
        }
    }
