package com.practicasolo.servicios;

import com.practicasolo.modelos.Servidor;
import com.practicasolo.repositorio.CRUD;
import com.practicasolo.repositorio.ServidorRepositorio;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ServidorServicios extends CRUD<Servidor, ServidorRepositorio> {
    public ServidorServicios(ServidorRepositorio repository) {
        super(repository);
    }

    @Override
    public List<Servidor> list() {
        return repository.findAll();
    }

    @Override
    public Servidor get(int id) {
        return repository.findById(id).get();
    }

    @Override
    public void add(Servidor o) {
        repository.save(o);

    }

    @Override
    public void update(Servidor o, int id) {
        o.setId(id);
        repository.save(o);
    }

    @Override
    public void delete(int id) {
        repository.deleteById(id);
    }
}

