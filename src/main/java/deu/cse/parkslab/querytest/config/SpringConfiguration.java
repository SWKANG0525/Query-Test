package deu.cse.parkslab.querytest.config;

import deu.cse.parkslab.querytest.model.Product;
import deu.cse.parkslab.querytest.repository.*;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.cassandra.repository.CassandraRepository;

import java.util.UUID;

@Configuration
public class SpringConfiguration {

    @Bean
    public ProductRepository<Product, UUID> ProductRepository() {
        return new CassandraProductRepositoryImpl();
    }
}
