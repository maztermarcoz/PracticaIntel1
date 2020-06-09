package com.practicasolo.repositorio;

import java.util.List;

public abstract class CRUD <T, E> {

    //Se requiere clase generica para el repositorio

    protected E repository;

    //T Significa type... que es la plantilla de como se comportan los componentes
    public CRUD(E repository){
        this.repository = repository;
    }

    public abstract List<T> list();

    public abstract T get(int id);

    public abstract void add (T o);

    public abstract void update(T o, int id);

    public abstract void delete (int id);



}
