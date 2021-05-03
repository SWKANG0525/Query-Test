package deu.cse.parkslab.querytest.repository;

import deu.cse.parkslab.querytest.model.Product;
import org.springframework.data.cassandra.repository.CassandraRepository;

import java.util.UUID;

public interface CassandraProductAdapter extends CassandraRepository<Product, UUID> {
}
