package gt1_p9.sistema_alquiler_de_vehiculo.dto;

public class ReservaDTO {
    private int idReserva;
    private int idCliente;
    private int idVehiculo;
    private int idEstadoReserva;
    private String fechaInicio;
    private String horaInicio;
    private String fechaFin;
    private String horaFin;
    private String lugarEntrega;
    private double precioTotal;

    public ReservaDTO() {}

    public ReservaDTO(int idReserva, int idCliente, int idVehiculo, int idEstadoReserva, String fechaInicio, String horaInicio, String fechaFin, String horaFin, String lugarEntrega, double precioTotal) {
        this.idReserva = idReserva;
        this.idCliente = idCliente;
        this.idVehiculo = idVehiculo;
        this.idEstadoReserva = idEstadoReserva;
        this.fechaInicio = fechaInicio;
        this.horaInicio = horaInicio;
        this.fechaFin = fechaFin;
        this.horaFin = horaFin;
        this.lugarEntrega = lugarEntrega;
        this.precioTotal = precioTotal;
    }

    // Getters y Setters
    public int getIdReserva() { return idReserva; }
    public void setIdReserva(int idReserva) { this.idReserva = idReserva; }

    public int getIdCliente() { return idCliente; }
    public void setIdCliente(int idCliente) { this.idCliente = idCliente; }

    public int getIdVehiculo() { return idVehiculo; }
    public void setIdVehiculo(int idVehiculo) { this.idVehiculo = idVehiculo; }

    public int getIdEstadoReserva() { return idEstadoReserva; }
    public void setIdEstadoReserva(int idEstadoReserva) { this.idEstadoReserva = idEstadoReserva; }

    public String getFechaInicio() { return fechaInicio; }
    public void setFechaInicio(String fechaInicio) { this.fechaInicio = fechaInicio; }

    public String getHoraInicio() { return horaInicio; }
    public void setHoraInicio(String horaInicio) { this.horaInicio = horaInicio; }

    public String getFechaFin() { return fechaFin; }
    public void setFechaFin(String fechaFin) { this.fechaFin = fechaFin; }

    public String getHoraFin() { return horaFin; }
    public void setHoraFin(String horaFin) { this.horaFin = horaFin; }

    public String getLugarEntrega() { return lugarEntrega; }
    public void setLugarEntrega(String lugarEntrega) { this.lugarEntrega = lugarEntrega; }

    public double getPrecioTotal() { return precioTotal; }
    public void setPrecioTotal(double precioTotal) { this.precioTotal = precioTotal; }
}
