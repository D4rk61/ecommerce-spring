package ecommerce.persistance.entity;

import lombok.*;

import javax.persistence.*;

@Getter
@Setter
@Entity
@NoArgsConstructor  @AllArgsConstructor @ToString
@Table(name = "ec_detalle_ordenes")
public class DetalleOrden {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @Column(name = "id", nullable = false)
    private Integer id;

    private String nombre;

    private Double cantidad;

    private Double precio;

    private Double total;

    @OneToOne(targetEntity = Orden.class)
    private Orden orden;

    @ManyToOne(targetEntity = Producto.class)
    private Producto producto;
}