package ecommerce.persistance.entity;

import lombok.*;

import javax.persistence.*;
import java.time.LocalDate;
import java.time.LocalDateTime;

@Getter
@Setter
@Entity
@Table(name = "ec_ordenes")
@NoArgsConstructor  @AllArgsConstructor @ToString
public class Orden {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @Column(name = "id", nullable = false)
    private Integer id;
    private String numero;

    @Column(name = "fecha_creacion", nullable = true)
    private LocalDateTime fechaCreacion;

    @Column(name = "fecha_recibido", nullable = true)
    private LocalDateTime fechaRecibido;

    private Double total;

    @ManyToOne(targetEntity = Usuario.class)
    private Usuario usuario;

    @OneToOne(targetEntity = DetalleOrden.class, mappedBy = "orden")
    private DetalleOrden detalle;
}