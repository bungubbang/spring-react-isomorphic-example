package com.ksug.isomorphic.react;

import com.ksug.isomorphic.react.domain.Site;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.Arrays;

/**
 * Created by 1000742
 * Email: sungyong.jung@sk.com
 * Date: 2015. 10. 16.
 */
@Controller
public class ReactViewController {

    @RequestMapping(value = "/", method = RequestMethod.GET)
    public String index(Model model) {
        model.addAttribute("title", "KSUG 2015 Web Seminar");
        model.addAttribute("subject", "Spring Isomorphic example");
        model.addAttribute("sites",
                Arrays.asList(
                        new Site("Mustache", "https://github.com/bungubbang/spring-mustache-isomorphic-example"),
                        new Site("Handlebars", "https://github.com/bungubbang/spring-handlebars-isomorphic-example"),
                        new Site("React", "https://github.com/bungubbang/spring-react-isomorphic-example")
                ));
        return "index";
    }

}
