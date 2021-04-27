package deu.cse.parkslab.querytest.repository;

import deu.cse.parkslab.querytest.model.Product;

import java.util.List;
import java.util.UUID;

public class CassandraProductRepositoryImpl implements CassandraProductRepository<Product, UUID>{
   CassandraProductAdapter<Product, UUID> cassandraProductAdapter;

   public CassandraProductRepositoryImpl(CassandraProductAdapter<Product, UUID> cassandraProductAdapter) {
       this.cassandraProductAdapter = cassandraProductAdapter;
   }


    @Override
    public Product save(Product product) {
        return cassandraProductAdapter.save(product);
    }

    @Override
    public List<Product> findAll() {
        return cassandraProductAdapter.findAll();
    }



}

