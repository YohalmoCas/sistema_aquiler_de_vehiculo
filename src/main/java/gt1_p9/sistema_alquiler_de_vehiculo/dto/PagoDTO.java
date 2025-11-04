package gt1_p9.sistema_alquiler_de_vehiculo.dto;

public class PagoDTO {
    private int idPago;
    private int idReserva;
    private double monto;
    private String fechaPago;
    private String metodoPago;
    private String estadoPago;

    public PagoDTO() {}

    public PagoDTO(int idPago, int idReserva, double monto, String fechaPago, String metodoPago, String estadoPago) {
        this.idPago = idPago;
        this.idReserva = idReserva;
        this.monto = monto;
        this.fechaPago = fechaPago;
        this.metodoPago = metodoPago;
        this.estadoPago = estadoPago;
    }

    public int getIdPago() { return idPago; }
    public void setIdPago(int idPago) { this.idPago = idPago; }

    public int getIdReserva() { return idReserva; }
    public void setIdReserva(int idReserva) { this.idReserva = idReserva; }

    public double getMonto() { return monto; }
    public void setMonto(double monto) { this.monto = monto; }

    public String getFechaPago() { return fechaPago; }
    public void setFechaPago(String fechaPago) { this.fechaPago = fechaPago; }

    public String getMetodoPago() { return metodoPago; }
    public void setMetodoPago(String metodoPago) { this.metodoPago = metodoPago; }

    public String getEstadoPago() { return estadoPago; }
    public void setEstadoPago(String estadoPago) { this.estadoPago = estadoPago; }
}
