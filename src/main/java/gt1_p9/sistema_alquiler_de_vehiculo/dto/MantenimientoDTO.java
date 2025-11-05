package gt1_p9.sistema_alquiler_de_vehiculo.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import jakarta.validation.constraints.*;
import java.time.LocalDate;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class MantenimientoDTO {

    private Long id_mantenimiento;

    @NotNull(message = "El ID del vehículo es obligatorio")
    private Long id_vehiculo;

    @PastOrPresent(message = "La fecha no puede ser futura")
    private LocalDate fecha;

    @NotBlank(message = "El tipo no puede estar vacío")
    @Size(max = 50, message = "El tipo no debe exceder los 50 caracteres")
    private String tipo;

    @Positive(message = "El costo debe ser un valor positivo")
    private double costro;

    @NotBlank(message = "La descripción no puede estar vacía")
    @Size(max = 50, message = "La descripción no debe exceder los 50 caracteres")
    private String descripcion;
}
