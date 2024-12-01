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
        this.mapper = new PagoMapper();
        try {
            dao = new PagoDAO(Database.getInstance().getConnection());
        } catch (SQLException ex) {
            this.dao = null; // En caso de fallo, evita excepciones posteriores
            view.showError("Error al conectar con la Base de Datos: " + ex.getMessage());
        }
    }
    
     public void create(Pago pago) {
        if (dao == null) {
            view.showError("El acceso a la base de datos no se ha inicializado correctamente.");
            return;
        }

        if (pago == null || !validateRequired(pago)) {
            view.showError("Faltan datos requeridos");
            return;
        }

        try {
            if (!validatePK(pago.getIdpago())) {
                view.showError("El ID del pago ingresado ya se encuentra registrado");
                return;
            }
            dao.create(mapper.toDto(pago));
            view.showMessage("Pago registrado correctamente");
        } catch (SQLException ex) {
            view.showError("Ocurrió un error al registrar el pago: " + ex.getMessage());
        }
    }

    public void read(int idPago) {
        if (dao == null) {
            view.showError("El acceso a la base de datos no se ha inicializado correctamente.");
            return;
        }

        if (idPago <= 0) {
            view.showError("Debe proporcionar un ID de pago válido");
            return;
        }

        try {
            PagoDTO dto = dao.read(idPago);
            if (dto == null) {
                view.showError("No se encontró un pago con el ID ingresado");
                return;
            }
            Pago pago = mapper.toEntity(dto);
            view.showPago(pago);
        } catch (SQLException ex) {
            view.showError("Ocurrió un error al leer el pago: " + ex.getMessage());
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
            view.showAllPagos(pagoList);
        } catch (SQLException ex) {
            view.showError("Error al cargar los pagos: " + ex.getMessage());
        }
    }
    
     public void delete(int idPago) {
        if (dao == null) {
            view.showError("El acceso a la base de datos no se ha inicializado correctamente.");
            return;
        }

        if (idPago <= 0) {
            view.showError("Debe proporcionar un ID de pago válido");
            return;
        }

        try {
            if (validatePK(idPago)) {
                view.showError("El ID del pago ingresado no se encuentra registrado");
                return;
            }
            dao.delete(idPago);
            view.showMessage("Pago eliminado correctamente");
        } catch (SQLException ex) {
            view.showError("Ocurrió un error al eliminar el pago: " + ex.getMessage());
        }
    }

    public boolean validatePK(int idPago) {
        try {
            return dao.validatePK(idPago);
        } catch (SQLException ex) {
            view.showError("Error al validar el ID del pago: " + ex.getMessage());
            return false;
        }
    }

    private boolean validateRequired(Pago pago) {
        return pago != null
                && pago.getIdpago() > 0
                && pago.getCustomer() != null
                && pago.getCustomer().getCedula() != null && !pago.getCustomer().getCedula().trim().isEmpty()
                && pago.getFecha() != null
                && pago.getSubtotal() >= 0
                && pago.getImpuesto() >= 0;
    }
}
