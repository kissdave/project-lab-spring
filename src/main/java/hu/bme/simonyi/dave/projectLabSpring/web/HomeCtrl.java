package hu.bme.simonyi.dave.projectLabSpring.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by dkiss on 2016. 05. 04..
 */
@Controller
public class HomeCtrl {
    @RequestMapping("*")
    public String home() {
        return "index";
    }
}
