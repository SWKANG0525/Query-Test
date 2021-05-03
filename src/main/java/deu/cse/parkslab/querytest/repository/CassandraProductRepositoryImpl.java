package deu.cse.parkslab.querytest.repository;

import deu.cse.parkslab.querytest.model.Product;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;
import java.util.UUID;



public class CassandraProductRepositoryImpl implements CassandraProductRepository<Product, UUID>{


    @Autowired
    private CassandraProductAdapter cassandraProductAdapter;



    @Override
    public Product save(Product product) {
       return cassandraProductAdapter.save(product);
    }

    @Override
    public List<Product> findAll() {
        return cassandraProductAdapter.findAll();
    }



}

