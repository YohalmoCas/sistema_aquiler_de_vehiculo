package gt1_p9.sistema_alquiler_de_vehiculo.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import jakarta.validation.constraints.*;
import java.time.LocalDateTime;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class PagoDTO {

    private Long id_pago;

    @NotNull(message = "El ID de la reserva es obligatorio")
    private Long id_reserva;

    @Positive(message = "El monto debe ser un valor positivo")
    private double monto;

    @NotNull(message = "La fecha de pago es obligatoria")
    private LocalDateTime fecha_pago;

    @NotBlank(message = "El método de pago no puede estar vacío")
    @Size(max = 30, message = "El método de pago no debe exceder los 30 caracteres")
    private String metodo_pago;

    @NotBlank(message = "El estado del pago no puede estar vacío")
    @Size(max = 30, message = "El estado del pago no debe exceder los 30 caracteres")
    private String estado_pago;
}
