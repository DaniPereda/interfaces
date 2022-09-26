package com.coches;

import com.cocheInterface.CocheCRUD;

import java.util.List;

public class CocheCRUDImpl implements CocheCRUD {
    @Override
    public void save(Coche coche) {
        System.out.println("save(Coche coche)");
    }

    @Override
    public List<Coche> findAll() {
        System.out.println("List<Coche> findAll()");
        return null;
    }

    @Override
    public void delete(int idCoche) {
        System.out.println("delete(int idCoche)");

    }
}
