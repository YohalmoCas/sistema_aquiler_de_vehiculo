package gt1_p9.sistema_alquiler_de_vehiculo.dto;

import java.time.LocalDate;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ReservaCreateDTO {

    @NotNull(message = "El ID del cliente es obligatorio")
    private Long id_cliente;

    @NotNull(message = "El ID del vehículo es obligatorio")
    private Long id_vehiculo;

    @NotNull(message = "La fecha de inicio es obligatoria")
    private LocalDate fecha_inicio;

    @NotNull(message = "La fecha final es obligatoria")
    private LocalDate fecha_final;

    @NotBlank(message = "El lugar de entrega no puede estar vacío")
    @Size(max = 150, message = "El lugar de entrega no debe exceder los 150 caracteres")
    private String lugar_entrega;
}
