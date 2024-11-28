/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model.Pago;

import Model.Customer.Customer;
import java.util.Date;

/**
 *
 * @author pamel
 */
public class PagoDTO {
    private int pago;
     private Customer customer;
    private Date fecha;
    private double subtotal;
    private double impuesto;
    private double total;

    public int getPago() {
        return pago;
    }

    public Customer getCustomer() {
        return customer;
    }

    public Date getFecha() {
        return fecha;
    }

    public double getSubtotal() {
        return subtotal;
    }

    public double getImpuesto() {
        return impuesto;
    }

    public double getTotal() {
        return total;
    }

    public PagoDTO(int pago, Customer customer, Date fecha, double subtotal, double impuesto, double total) {
        this.pago = pago;
        this.customer = customer;
        this.fecha = fecha;
        this.subtotal = subtotal;
        this.impuesto = impuesto;
        this.total = total;
    }
}
