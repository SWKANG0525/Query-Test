package deu.cse.parkslab.querytest.repository;


import deu.cse.parkslab.querytest.model.Product;

import java.util.List;

public interface ProductRepository<T, ID> {


    T save(T t);
    List<T> findAll();





}
