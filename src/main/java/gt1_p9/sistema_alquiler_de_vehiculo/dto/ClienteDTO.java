package gt1_p9.sistema_alquiler_de_vehiculo.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import jakarta.validation.constraints.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class ClienteDTO {

    @NotBlank(message = "El DUI es obligatorio")
    @Size(max = 10, message = "El DUI no debe exceder los 10 caracteres")
    private String dui;

    @NotBlank(message = "El nombre no puede estar vacío")
    @Size(max = 50, message = "El nombre no debe exceder los 50 caracteres")
    private String nombre;

    @NotBlank(message = "El apellido no puede estar vacío")
    @Size(max = 50, message = "El apellido no debe exceder los 50 caracteres")
    private String apellido;

    @Positive(message = "El número de teléfono debe ser positivo")
    private int telefono;

    @Email(message = "Debe proporcionar un correo válido")
    @NotBlank(message = "El correo electrónico no puede estar vacío")
    @Size(max = 100, message = "El correo no debe exceder los 100 caracteres")
    private String email;

    @Size(max = 150, message = "La dirección no debe exceder los 150 caracteres")
    private String direccion;

    private String fecha_nacimiento;

    @Size(max = 50, message = "La nacionalidad no debe exceder los 50 caracteres")
    private String nacionalidad;
}
