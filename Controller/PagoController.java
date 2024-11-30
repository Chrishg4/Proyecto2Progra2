/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;

import Database.Database;
import Model.Pago.Pago;
import Model.Pago.PagoDAO;
import Model.Pago.PagoDTO;
import Model.Pago.PagoMapper;
import javax.swing.text.View;
import java.sql.SQLException;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

/**
 *
 * @author pamel
 */
public class PagoController {
    private PagoDAO dao;
    private final View view;
    private final PagoMapper mapper;
    
      public PagoController(View view) {
        this.view = view;
        mapper = new PagoMapper();
        try {
            dao = new PagoDAO(Database.getInstance().getConnection());
        } catch (SQLException ex) {
            this.dao = null;
            view.showError("Error al conectar con la Base de Datos: " + ex.getMessage());
        }
    }
      
      public void create(Pago pago) {
        if (dao == null) {
            view.showError("El acceso a la base de datos no se ha inicializado correctamente.");
            return;
        }

        if (customer == null || !validateRequired(customer)) {
            view.showError("Faltan datos requeridos");
            return;
        }

        try {
            if (!validatePK(customer.getCedula())) {
                view.showError("La cédula ingresada ya se encuentra registrada");
                return;
            }
            dao.create(mapper.toDto(pago));
            view.showMessage("Datos guardados correctamente");
        } catch (SQLException ex) {
            view.showError("Ocurrió un error al guardar los datos: " + ex.getMessage());
        }
    }
      
       public void readAll() {
        if (dao == null) {
            view.showError("El acceso a la base de datos no se ha inicializado correctamente.");
            return;
        }

        try {
            List<PagoDTO> dtoList = dao.readAll();
            List<Pago> pagoList = dtoList.stream()
                    .map(mapper::toEntity)
                    .filter(Objects::nonNull)
                    .collect(Collectors.toList());
            view.showAll(pagoList);
        } catch (SQLException ex) {
            view.showError("Error al cargar los datos: " + ex.getMessage());
        }
    }
}
