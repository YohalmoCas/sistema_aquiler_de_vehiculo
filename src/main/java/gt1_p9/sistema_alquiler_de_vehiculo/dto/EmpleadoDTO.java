package gt1_p9.sistema_alquiler_de_vehiculo.dto;

public class EmpleadoDTO {
    private int idEmpleado;
    private String nombre;
    private String apellido;
    private String cargo;
    private String usuario;
    private String clave;
    private String rol;

    public EmpleadoDTO() {}

    public EmpleadoDTO(int idEmpleado, String nombre, String apellido, String cargo, String usuario, String clave, String rol) {
        this.idEmpleado = idEmpleado;
        this.nombre = nombre;
        this.apellido = apellido;
        this.cargo = cargo;
        this.usuario = usuario;
        this.clave = clave;
        this.rol = rol;
    }

    public int getIdEmpleado() { return idEmpleado; }
    public void setIdEmpleado(int idEmpleado) { this.idEmpleado = idEmpleado; }

    public String getNombre() { return nombre; }
    public void setNombre(String nombre) { this.nombre = nombre; }

    public String getApellido() { return apellido; }
    public void setApellido(String apellido) { this.apellido = apellido; }

    public String getCargo() { return cargo; }
    public void setCargo(String cargo) { this.cargo = cargo; }

    public String getUsuario() { return usuario; }
    public void setUsuario(String usuario) { this.usuario = usuario; }

    public String getClave() { return clave; }
    public void setClave(String clave) { this.clave = clave; }

    public String getRol() { return rol; }
    public void setRol(String rol) { this.rol = rol; }
}
