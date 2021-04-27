package deu.cse.parkslab.querytest.repository;

import org.springframework.data.cassandra.repository.CassandraRepository;


public interface CassandraProductAdapter<T, ID> extends CassandraRepository<T, ID> {
}
