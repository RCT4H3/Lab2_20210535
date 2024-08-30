package org.example.lab2_20210535.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class controllerGame {

    @RequestMapping(value = "/", method = RequestMethod.GET)
    public String paginaConfig(){
        return "formularioConfiguracion";
    }
}
