package deu.cse.parkslab.querytest.repository;

import org.springframework.data.cassandra.repository.CassandraRepository;
import org.springframework.data.repository.NoRepositoryBean;

@NoRepositoryBean
public interface CassandraProductAdapter<T, ID> extends CassandraRepository<T, ID> {
}
