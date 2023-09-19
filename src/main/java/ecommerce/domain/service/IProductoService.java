package ecommerce.domain.service;

import ecommerce.persistance.entity.Producto;

import java.util.List;
import java.util.Optional;

public interface IProductoService {
    public List<Producto> findAll();

    public Optional<Producto> findById(Integer id);

    public Producto save(Producto producto);

    public void update(Integer id, Producto producto);

    public void delete(Integer id);
}
