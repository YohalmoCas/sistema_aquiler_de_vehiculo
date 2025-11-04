package gt1_p9.sistema_alquiler_de_vehiculo.dto;

public class SucursalDTO {
    private int idSucursal;
    private String nombreSucursal;
    private String direccion;
    private int telefono;

    public SucursalDTO() {}

    public SucursalDTO(int idSucursal, String nombreSucursal, String direccion, int telefono) {
        this.idSucursal = idSucursal;
        this.nombreSucursal = nombreSucursal;
        this.direccion = direccion;
        this.telefono = telefono;
    }

    public int getIdSucursal() { return idSucursal; }
    public void setIdSucursal(int idSucursal) { this.idSucursal = idSucursal; }

    public String getNombreSucursal() { return nombreSucursal; }
    public void setNombreSucursal(String nombreSucursal) { this.nombreSucursal = nombreSucursal; }

    public String getDireccion() { return direccion; }
    public void setDireccion(String direccion) { this.direccion = direccion; }

    public int getTelefono() { return telefono; }
    public void setTelefono(int telefono) { this.telefono = telefono; }
}
