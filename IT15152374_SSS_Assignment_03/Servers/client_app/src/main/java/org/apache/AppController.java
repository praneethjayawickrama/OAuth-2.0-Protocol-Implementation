package org.apache;

/**
 * Created by praneethjayawickrama on 11/20/17.
 */
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
public class AppController {

    @RequestMapping("/")
    public String index() {
        return "index.html";
    }
}