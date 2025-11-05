package gt1_p9.sistema_alquiler_de_vehiculo.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import jakarta.validation.constraints.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class EmpleadoDTO {

    private Long id_empleado;

    @NotBlank(message = "El nombre no puede estar vacío")
    @Size(max = 50, message = "El nombre no debe exceder los 50 caracteres")
    private String nombre;

    @NotBlank(message = "El apellido no puede estar vacío")
    @Size(max = 50, message = "El apellido no debe exceder los 50 caracteres")
    private String apellido;

    @NotBlank(message = "El cargo no puede estar vacío")
    @Size(max = 50, message = "El cargo no debe exceder los 50 caracteres")
    private String cargo;

    @NotBlank(message = "El usuario no puede estar vacío")
    @Size(max = 50, message = "El usuario no debe exceder los 50 caracteres")
    private String usuario;

    @NotBlank(message = "La clave no puede estar vacía")
    @Size(max = 50, message = "La clave no debe exceder los 50 caracteres")
    private String clave;

    @NotBlank(message = "El rol no puede estar vacío")
    @Size(max = 50, message = "El rol no debe exceder los 50 caracteres")
    private String rol;
}
