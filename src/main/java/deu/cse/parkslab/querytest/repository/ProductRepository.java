package deu.cse.parkslab.querytest.repository;



import org.springframework.stereotype.Repository;

import java.util.List;

public interface ProductRepository<T, ID> {


    T save(T t);
    List<T> findAll();





}
