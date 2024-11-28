/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model.Clases;

import Database.Database;
import Model.Entrenadores.EntrenadorDAO;
import Model.Entrenadores.EntrenadorMapper;
import Model.Mapper.Mapper;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author sofia
 */
public class ClaseMapper implements Mapper<Clase, ClaseDTO> {

    @Override
    public ClaseDTO toDto(Clase ent) {
        if (ent == null) {
            return null;
        }
        return new ClaseDTO(
                ent.getId(),
                ent.getTipoClase(),
                ent.getHorario(),
                ent.getEntrenadorId().getId(),
                ent.getCapacidadMaxima());
    }

    @Override
    public Clase toEntity(ClaseDTO dto) {
        if (dto == null) {
            return null;
        }
        try {
            return new Clase(
                    dto.getId(),
                    dto.getTipoClase(),
                    dto.getHorario(),
                    new EntrenadorMapper().toEntity(new EntrenadorDAO(Database.getConnection()).read(dto.getEntrenadorId())) ,
                    dto.getCapacidadMaxima()
            );
        } catch (SQLException ex) {
            Logger.getLogger(ClaseMapper.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(ClaseMapper.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }

}
