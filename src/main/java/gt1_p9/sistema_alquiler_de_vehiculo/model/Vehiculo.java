package gt1_p9.sistema_alquiler_de_vehiculo.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "vehiculos")
public class Vehiculo {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id_vehiculo;

    @ManyToOne
    @JoinColumn(name = "id_estado_vehiculo", nullable = false)
    private EstadoVehiculo id_estado;

    @ManyToOne
    @JoinColumn(name = "id_sucursal", nullable = false)
    private Sucursal id_sucursal;

    @Column(nullable = false, unique = true, length = 15)
    private String matricula;

    @Column(nullable = false, length = 50)
    private String marca;

    @Column(nullable = false, length = 50)
    private String modelo;

    @Column(name = "anio_fabricacion", nullable = false)
    private String anio_fabricacion;

    @Column(length = 30)
    private String color;

    @Column(length = 8)
    private int kilometraje;

    @Column(length = 30)
    private String tipo;

    @Column(name = "tipo_combustible", length = 30)
    private String tipo_combustible;
}
