package org.example.lab2_20210535.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
public class controllerGame {

    @RequestMapping(value = "/formConfig", method = RequestMethod.GET)
    public String paginaConfig(){
        return "formularioConfiguracion";
    }

    @PostMapping("/form/Config")
    public String formConfig(@RequestParam("tamTarjeta") int tamTarjeta,
                             @RequestParam("numTarjetas") int numTarjetas){
        formarTarjetas(numTarjetas, tamTarjeta);
        return "juegoBingo";
    }

    public void formarTarjetas(int numTarjetas, int tamTarjeta){
        System.out.println("XD"+tamTarjeta);
        System.out.println("AJAJA"+numTarjetas);
    }
}
