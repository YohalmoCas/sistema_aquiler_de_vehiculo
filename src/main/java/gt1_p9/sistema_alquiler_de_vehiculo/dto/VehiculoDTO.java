package gt1_p9.sistema_alquiler_de_vehiculo.dto;

public class VehiculoDTO {
    private int idVehiculo;
    private int idEstado;
    private int idSucursal;
    private String matricula;
    private String vin;
    private String marca;
    private String modelo;
    private int anio;
    private String color;
    private int kilometraje;
    private String tipo;
    private String tipoCombustible;

    public VehiculoDTO() {}

    public VehiculoDTO(int idVehiculo, int idEstado, int idSucursal, String matricula, String vin, String marca, String modelo, int anio, String color, int kilometraje, String tipo, String tipoCombustible) {
        this.idVehiculo = idVehiculo;
        this.idEstado = idEstado;
        this.idSucursal = idSucursal;
        this.matricula = matricula;
        this.vin = vin;
        this.marca = marca;
        this.modelo = modelo;
        this.anio = anio;
        this.color = color;
        this.kilometraje = kilometraje;
        this.tipo = tipo;
        this.tipoCombustible = tipoCombustible;
    }

    // Getters y Setters
    public int getIdVehiculo() { return idVehiculo; }
    public void setIdVehiculo(int idVehiculo) { this.idVehiculo = idVehiculo; }

    public int getIdEstado() { return idEstado; }
    public void setIdEstado(int idEstado) { this.idEstado = idEstado; }

    public int getIdSucursal() { return idSucursal; }
    public void setIdSucursal(int idSucursal) { this.idSucursal = idSucursal; }

    public String getMatricula() { return matricula; }
    public void setMatricula(String matricula) { this.matricula = matricula; }

    public String getVin() { return vin; }
    public void setVin(String vin) { this.vin = vin; }

    public String getMarca() { return marca; }
    public void setMarca(String marca) { this.marca = marca; }

    public String getModelo() { return modelo; }
    public void setModelo(String modelo) { this.modelo = modelo; }

    public int getAnio() { return anio; }
    public void setAnio(int anio) { this.anio = anio; }

    public String getColor() { return color; }
    public void setColor(String color) { this.color = color; }

    public int getKilometraje() { return kilometraje; }
    public void setKilometraje(int kilometraje) { this.kilometraje = kilometraje; }

    public String getTipo() { return tipo; }
    public void setTipo(String tipo) { this.tipo = tipo; }

    public String getTipoCombustible() { return tipoCombustible; }
    public void setTipoCombustible(String tipoCombustible) { this.tipoCombustible = tipoCombustible; }
}
