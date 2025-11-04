package gt1_p9.sistema_alquiler_de_vehiculo.dto;

public class EstadoVehiculoDTO {
    private int idEstadoVehiculo;
    private String descripcion;

    public EstadoVehiculoDTO() {}

    public EstadoVehiculoDTO(int idEstadoVehiculo, String descripcion) {
        this.idEstadoVehiculo = idEstadoVehiculo;
        this.descripcion = descripcion;
    }

    public int getIdEstadoVehiculo() { return idEstadoVehiculo; }
    public void setIdEstadoVehiculo(int idEstadoVehiculo) { this.idEstadoVehiculo = idEstadoVehiculo; }

    public String getDescripcion() { return descripcion; }
    public void setDescripcion(String descripcion) { this.descripcion = descripcion; }
}
