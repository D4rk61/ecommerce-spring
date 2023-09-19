package ecommerce.domain.service;

import ecommerce.persistance.entity.Producto;
import ecommerce.persistance.repository.crud.IProductoRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

@Service    @Transactional
@RequiredArgsConstructor
public class ProductoServiceImpl implements IProductoService {
    private final IProductoRepository productoRepository;

    @Override
    public List<Producto> findAll() {
        return this.productoRepository.findAll();
    }

    @Override
    public Optional<Producto> findById(Integer id) {
        if(this.existsById(id)) {
            return this.productoRepository.findById(id);
        } else {
            throw new RuntimeException("Producto no encontrado");
        }
    }

    @Override
    public Producto save(Producto producto) {
        try {
            return this.productoRepository.save(producto);
        }
        catch (Exception e) {
            throw new RuntimeException("Error al guardar el producto");
        }
    }

    @Override
    public void update(Integer id, Producto producto) {
        if(this.existsById(id)) {
            this.productoRepository.save(producto);
        } else {
            throw new RuntimeException("Producto no encontrado");
        }
    }

    @Override
    public void delete(Integer id) {
        if(this.existsById(id)) {
            this.productoRepository.deleteById(id);
        }
        else {
            throw new RuntimeException("Producto no encontrado");
        }
    }

    public boolean existsById(Integer id) {
        return this.productoRepository.existsById(id);
    }
}
