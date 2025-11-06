package gt1_p9.sistema_alquiler_de_vehiculo.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import jakarta.validation.constraints.*;
import java.time.LocalDate;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class VehiculoDTO {

    private Long id_vehiculo;

    @NotNull(message = "El ID del estado del vehículo es obligatorio")
    private Long id_estado;

    @NotNull(message = "El ID de la sucursal es obligatorio")
    private Long id_sucursal;

    @NotBlank(message = "La matrícula es obligatoria")
    @Size(max = 15, message = "La matrícula no debe exceder los 15 caracteres")
    private String matricula;

    @NotBlank(message = "La marca no puede estar vacía")
    @Size(max = 50, message = "La marca no debe exceder los 50 caracteres")
    private String marca;

    @NotBlank(message = "El modelo no puede estar vacío")
    @Size(max = 50, message = "El modelo no debe exceder los 50 caracteres")
    private String modelo;

    @NotNull(message = "El año de fabricación es obligatorio")
    private LocalDate anio_fabricacion;

    @Size(max = 30, message = "El color no debe exceder los 30 caracteres")
    private String color;

    @PositiveOrZero(message = "El kilometraje no puede ser negativo")
    private int kilometraje;

    @Size(max = 30, message = "El tipo no debe exceder los 30 caracteres")
    private String tipo;

    @Size(max = 30, message = "El tipo de combustible no debe exceder los 30 caracteres")
    private String tipo_combustible;
}
