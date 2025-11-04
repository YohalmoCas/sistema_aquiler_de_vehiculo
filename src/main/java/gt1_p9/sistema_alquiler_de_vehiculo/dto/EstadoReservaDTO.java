package gt1_p9.sistema_alquiler_de_vehiculo.dto;

public class EstadoReservaDTO {
    private int idEstadoReserva;
    private String descripcion;

    public EstadoReservaDTO() {}

    public EstadoReservaDTO(int idEstadoReserva, String descripcion) {
        this.idEstadoReserva = idEstadoReserva;
        this.descripcion = descripcion;
    }

    public int getIdEstadoReserva() { return idEstadoReserva; }
    public void setIdEstadoReserva(int idEstadoReserva) { this.idEstadoReserva = idEstadoReserva; }

    public String getDescripcion() { return descripcion; }
    public void setDescripcion(String descripcion) { this.descripcion = descripcion; }
}
