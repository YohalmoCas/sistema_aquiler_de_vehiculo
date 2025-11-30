package gt1_p9.sistema_alquiler_de_vehiculo.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import jakarta.validation.constraints.*;
import java.time.LocalDate;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class ReservaDTO {

    private Long id_reserva;

    @NotNull(message = "El ID del cliente es obligatorio")
    private Long id_cliente;

    @NotNull(message = "El ID del vehículo es obligatorio")
    private Long id_vehiculo;

    @NotNull(message = "El ID del estado de la reserva es obligatorio")
    private Long id_estado;

    @NotNull(message = "La fecha de inicio es obligatoria")
    private LocalDate fecha_inicio;

    @NotNull(message = "La hora de inicio es obligatoria")
    private LocalDate hora_inicio;

    @NotNull(message = "La fecha final es obligatoria")
    private LocalDate fecha_final;

    @NotNull(message = "La hora final es obligatoria")
    private LocalDate hora_final;

    @NotBlank(message = "El lugar de entrega no puede estar vacío")
    @Size(max = 150, message = "El lugar de entrega no debe exceder los 150 caracteres")
    private String lugar_entrega;

    @Positive(message = "El precio total debe ser un valor positivo")
    private double precio_total;
}
