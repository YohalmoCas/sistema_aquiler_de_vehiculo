package gt1_p9.sistema_alquiler_de_vehiculo.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "clientes")
public class Cliente {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id_cliente;

    @Column(name = "dui", nullable = false, unique = true, length = 10)
    private String dui;

    @Column(nullable = false, length = 50)
    private String nombre;

    @Column(nullable = false, length = 50)
    private String apellido;

    @Column(length = 11)
    private int telefono;

    @Column(nullable = false, unique = true, length = 100)
    private String email;

    @Column(length = 150)
    private String direccion;

    @Column(name = "fecha_nacimiento")
    private String fecha_nacimiento;

    @Column(length = 50)
    private String nacionalidad;   
}
