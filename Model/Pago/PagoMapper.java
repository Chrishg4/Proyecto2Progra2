/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model.Pago;

import Model.Mapper.Mapper;

/**
 *
 * @author pamel
 */
public class PagoMapper implements Mapper<Pago, PagoDTO> {

    @Override
    public PagoDTO toDto(Pago ent) {
        return new PagoDTO(
        ent.getIdpago(),
        ent.getCustomer(),
        ent.getFecha(),
        ent.getSubtotal(),
        ent.getImpuesto(),
         ent.getTotal()
        );
    }

    @Override
    public Pago toEntity(PagoDTO dto) {
         if(dto == null) return null;
         return new Pago(
         dto.getPago(),
         dto.getCustomer(),
         dto.getFecha(),
         dto.getSubtotal(),
         dto.getImpuesto(),
                 dto.getTotal()
         );
    }
    
}
