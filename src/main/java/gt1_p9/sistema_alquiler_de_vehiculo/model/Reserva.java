package gt1_p9.sistema_alquiler_de_vehiculo.model;

import java.time.LocalDate;

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
    private Long id_vehiculo;

    @ManyToOne
    @JoinColumn(name = "id_estado_reserva", nullable = false)
    private EstadoReserva id_estado;

    @Column(name = "fecha_inicio", nullable = false)
    private LocalDate fecha_inicio;

    @Column(name = "hora_inicio", nullable = false)
    private LocalDate hora_inicio;

    @Column(name = "fecha_final", nullable = false)
    private LocalDate fecha_final;

    @Column(name = "hora_final", nullable = false)
    private LocalDate hora_final;

    @Column(name = "lugar_entrega", length = 150, nullable = false)
    private String lugar_entrega;

    @Column(name = "precio_total", precision = 10, scale = 2, nullable = false)
    private double precio_total;
}
