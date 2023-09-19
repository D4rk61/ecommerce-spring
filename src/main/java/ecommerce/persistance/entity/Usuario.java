package ecommerce.persistance.entity;

import lombok.*;

import javax.persistence.*;
import javax.validation.constraints.Email;

@Getter
@Setter
@Entity
@NoArgsConstructor  @AllArgsConstructor
@ToString
@Table(name = "ec_usuarios")
public class Usuario {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @Column(name = "id", nullable = false)
    private Integer id;

    @Column(name = "nombre", nullable = false, length = 50)
    private String nombre;

    @Column(unique = true)
    private String username;

    @Column(nullable = false)
    private String password;

    @Email
    private String email;

    private String direccion;

    @Column(length = 20)
    private String telefono;

    // rol de usuario { "admin", "user"}
    private String tipo;
}