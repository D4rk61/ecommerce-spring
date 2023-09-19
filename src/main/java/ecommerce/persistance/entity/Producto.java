package ecommerce.persistance.entity;

import lombok.*;

import javax.persistence.*;
import javax.validation.constraints.Min;
import java.util.List;

@Getter
@Setter
@Entity
@NoArgsConstructor  @AllArgsConstructor
@ToString
@Table(name = "ec_productos")
public class Producto {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @Column(name = "id", nullable = false)
    private Integer id;

    @Column(name = "nombre", nullable = false, length = 50)
    private String nombre;

    @Lob
    private String descripcion;

    private String imagen;
    private Double precio;

    @Min(1)
    private Integer cantidad = 1;

    @ManyToOne(targetEntity = Usuario.class)
    private Usuario usuario;
}