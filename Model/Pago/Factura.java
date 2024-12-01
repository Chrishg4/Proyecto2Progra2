/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model.Pago;

import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.pdf.PdfWriter;
import java.io.FileOutputStream;
import java.util.Date;



/**
 *
 * @author pamel
 */
public class Factura {
    public static void generarFacturaPDF(Pago pago, String rutaArchivo) {
        Document documento = new Document();
        try {
            PdfWriter.getInstance(documento, new FileOutputStream(rutaArchivo));
            documento.open();

            // Título
            documento.add(new Paragraph("Factura de Pago"));
            documento.add(new Paragraph("Fecha: " + new Date()));
            documento.add(new Paragraph("======================================"));

            // Detalles del pago
            documento.add(new Paragraph("ID Pago: " + pago.getIdpago()));
            documento.add(new Paragraph("Cliente: " + pago.getCustomer().getCedula()));
            documento.add(new Paragraph("Subtotal: " + pago.getSubtotal()));
            documento.add(new Paragraph("Impuesto: " + pago.getImpuesto()));
            documento.add(new Paragraph("Total: " + pago.getTotal()));

            documento.add(new Paragraph("======================================"));
            documento.add(new Paragraph("Gracias por su pago!"));

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            documento.close();
        }
    }

    public static void generarFacturaXML(Pago pago, String rutaArchivo) {
        try {
            String xmlContent = """
                <factura>
                    <idPago>%d</idPago>
                    <cliente>%s</cliente>
                    <fecha>%s</fecha>
                    <subtotal>%.2f</subtotal>
                    <impuesto>%.2f</impuesto>
                    <total>%.2f</total>
                </factura>
            """.formatted(
                pago.getIdpago(),
                pago.getCustomer().getCedula(),
                pago.getFecha(),
                pago.getSubtotal(),
                pago.getImpuesto(),
                pago.getTotal()
            );
            java.nio.file.Files.write(java.nio.file.Paths.get(rutaArchivo), xmlContent.getBytes());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
