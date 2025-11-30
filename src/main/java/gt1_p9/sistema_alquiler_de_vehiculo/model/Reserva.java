package gt1_p9.sistema_alquiler_de_vehiculo.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name = "reservas")
public class Reserva {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id_reserva;

    @ManyToOne
    @JoinColumn(name = "id_cliente", nullable = false)
    private Cliente id_cliente;

    @ManyToOne
    @JoinColumn(name = "id_vehiculo", nullable = false)
    private Vehiculo id_vehiculo;

    @ManyToOne
    @JoinColumn(name = "id_estado_reserva", nullable = false)
    private EstadoReserva id_estado;

    @Column(name = "fecha_inicio", nullable = false)
    private String fecha_inicio;

    @Column(name = "fecha_final", nullable = false)
    private String fecha_final;

    @Column(name = "lugar_entrega", length = 150, nullable = false)
    private String lugar_entrega;

    @Column(name = "precio_total", nullable = false)
    private double precio_total;
}
