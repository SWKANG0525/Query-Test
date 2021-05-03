package deu.cse.parkslab.querytest.repository;



import java.util.List;


public interface CassandraProductRepository<T,ID> extends ProductRepository<T,ID> {

    T save(T t);
    List<T> findAll();
}
