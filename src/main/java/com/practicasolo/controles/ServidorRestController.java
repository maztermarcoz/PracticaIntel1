package com.practicasolo.controles;

import com.practicasolo.modelos.Servidor;
import com.practicasolo.servicios.ServidorServicios;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/")
public class ServidorRestController {

    @Autowired
    ServidorServicios service;

    @GetMapping("List")
    public List<Servidor>List(){
        return service.list();
    }
    @PostMapping("/add")
    public void add(@RequestBody Servidor servidor, @PathVariable int id){

        service.update(servidor,id);
    }



}
