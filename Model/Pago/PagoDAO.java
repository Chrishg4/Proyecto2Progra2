/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model.Pago;

import Model.DAO.DaoCRD;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Date;
import java.util.List;

/**
 *
 * @author pamel
 */
public class PagoDAO extends DaoCRD<PagoDTO>{
    
     public PagoDAO(Connection connection) {
        super(connection);
    }

    @Override
    public boolean create(PagoDTO dto) throws SQLException {
          stmt = connection.prepareStatement("call PayCreate(?,?,?,?,?)");
        stmt.setInt(1, dto.getIdPago());
        stmt.setString(2, dto.getCustomer().getCedula()); 
        stmt.setDate(3, new Date(dto.getFecha().getTime()));
        stmt.setDouble(4, dto.getSubtotal());
        stmt.setDouble(5, dto.getImpuesto());
        return stmt.executeUpdate() > 0;
    }

    @Override
    public PagoDTO read(Object id) throws SQLException {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public List<PagoDTO> readAll() throws SQLException {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public boolean delete(Object id) throws SQLException {
        return read(id) == null;   
    } 
}
