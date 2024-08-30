package org.example.lab2_20210535.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.ui.Model;

@Controller
public class controllerGame {

    @RequestMapping(value = "/", method = RequestMethod.GET)
    public String paginaConfig(){
        return "formularioConfiguracion";
    }

    @PostMapping("/juegoBingo")
    @GetMapping("/juegoBingo")
    public String formConfig(@RequestParam("tamTarjeta") int tamTarjeta,
                             @RequestParam("numTarjetas") int numTarjetas, Model model){
        model.addAttribute("tamTarjeta", tamTarjeta);
        int[] lista= new int[tamTarjeta*tamTarjeta];
        for (int pos = 0; pos < tamTarjeta*tamTarjeta; pos++){
            lista[pos] = (int)(Math.random()*99+1);
        }
        model.addAttribute("lista", lista);
        return "juegoBingo";
    }


}
