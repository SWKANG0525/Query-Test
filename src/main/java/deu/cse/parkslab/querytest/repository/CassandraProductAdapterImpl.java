package deu.cse.parkslab.querytest.repository;

import deu.cse.parkslab.querytest.model.Product;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Slice;
import java.util.List;
import java.util.Optional;
import java.util.UUID;

public class CassandraProductAdapterImpl implements CassandraProductAdapter<Product, UUID> {
    @Override
    public <S extends Product> S save(S entity) {
        return null;
    }

    @Override
    public <S extends Product> List<S> saveAll(Iterable<S> entites) {
        return null;
    }

    @Override
    public Optional<Product> findById(UUID uuid) {
        return Optional.empty();
    }

    @Override
    public boolean existsById(UUID uuid) {
        return false;
    }

    @Override
    public List<Product> findAll() {
        return null;
    }

    @Override
    public List<Product> findAllById(Iterable<UUID> uuids) {
        return null;
    }

    @Override
    public long count() {
        return 0;
    }

    @Override
    public void deleteById(UUID uuid) {

    }

    @Override
    public void delete(Product entity) {

    }

    @Override
    public void deleteAll(Iterable<? extends Product> entities) {

    }

    @Override
    public void deleteAll() {

    }

    @Override
    public Slice<Product> findAll(Pageable pageable) {
        return null;
    }

    @Override
    public <S extends Product> S insert(S entity) {
        return null;
    }

    @Override
    public <S extends Product> List<S> insert(Iterable<S> entities) {
        return null;
    }
}
