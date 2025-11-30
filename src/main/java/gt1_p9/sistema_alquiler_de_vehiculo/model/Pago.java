package gt1_p9.sistema_alquiler_de_vehiculo.model;

import java.time.LocalDateTime;

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
@Table(name = "pagos")
public class Pago {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id_pago;

    @ManyToOne
    @JoinColumn(name = "id_reserva", nullable = false)
    private Reserva id_reserva;

    @Column(nullable = false)
    private double monto;

    @Column(name = "fecha_pago", nullable = false)
    private LocalDateTime fecha_pago;

    @Column(name = "metodo_pago", nullable = false, length = 30)
    private String metodo_pago;

    @Column(name = "estado_pago", nullable = false, length = 30)
    private String estado_pago;
}
