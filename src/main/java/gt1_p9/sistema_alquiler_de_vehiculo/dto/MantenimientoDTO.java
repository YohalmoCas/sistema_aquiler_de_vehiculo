package gt1_p9.sistema_alquiler_de_vehiculo.dto;

public class MantenimientoDTO {
    private int idMantenimiento;
    private int idVehiculo;
    private String fecha;
    private String tipo;
    private double costo;
    private String descripcion;

    public MantenimientoDTO() {}

    public MantenimientoDTO(int idMantenimiento, int idVehiculo, String fecha, String tipo, double costo, String descripcion) {
        this.idMantenimiento = idMantenimiento;
        this.idVehiculo = idVehiculo;
        this.fecha = fecha;
        this.tipo = tipo;
        this.costo = costo;
        this.descripcion = descripcion;
    }

    public int getIdMantenimiento() { return idMantenimiento; }
    public void setIdMantenimiento(int idMantenimiento) { this.idMantenimiento = idMantenimiento; }

    public int getIdVehiculo() { return idVehiculo; }
    public void setIdVehiculo(int idVehiculo) { this.idVehiculo = idVehiculo; }

    public String getFecha() { return fecha; }
    public void setFecha(String fecha) { this.fecha = fecha; }

    public String getTipo() { return tipo; }
    public void setTipo(String tipo) { this.tipo = tipo; }

    public double getCosto() { return costo; }
    public void setCosto(double costo) { this.costo = costo; }

    public String getDescripcion() { return descripcion; }
    public void setDescripcion(String descripcion) { this.descripcion = descripcion; }
}
