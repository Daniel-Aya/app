package com.mercadolibre.rampup.app.controller;

import com.mercadolibre.rampup.app.dto.ItemDTO;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/first-party-rampup/dynamic-search")
public class ItemController {

    @PostMapping(value = "{id}")
    public Object CrearItem(@PathVariable String id, @RequestBody ItemDTO itemDTO){
        return null;
    }

    @GetMapping(value = "{id}")
    public Object ObtenerItem(@PathVariable String id ){
        return null;
    }
    
}
