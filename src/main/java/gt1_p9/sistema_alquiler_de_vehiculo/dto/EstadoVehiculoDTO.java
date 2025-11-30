package gt1_p9.sistema_alquiler_de_vehiculo.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import jakarta.validation.constraints.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class EstadoVehiculoDTO {

    private int id_estado_vehiculo;

    @NotBlank(message = "La descripción no puede estar vacía")
    @Size(max = 50, message = "La descripción no debe exceder los 50 caracteres")
    private String descripcion;
}

