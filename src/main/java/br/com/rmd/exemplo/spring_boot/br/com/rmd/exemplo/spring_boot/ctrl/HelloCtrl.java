package br.com.rmd.exemplo.spring_boot.br.com.rmd.exemplo.spring_boot.ctrl;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HelloCtrl {

    @RequestMapping("/")
    @ResponseBody
    String home() {
        return "Hello MF!";
    }
}
