package gt1_p9.sistema_alquiler_de_vehiculo.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import jakarta.validation.constraints.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class SucursalDTO {

    private Long id_sucursal;

    @NotBlank(message = "El nombre de la sucursal no puede estar vacío")
    @Size(max = 50, message = "El nombre de la sucursal no debe exceder los 50 caracteres")
    private String nombre_sucursal;

    @NotBlank(message = "La dirección no puede estar vacía")
    @Size(max = 150, message = "La dirección no debe exceder los 150 caracteres")
    private String direccion;

    @PositiveOrZero(message = "El número de teléfono no puede ser negativo")
    private int telefono;
}
