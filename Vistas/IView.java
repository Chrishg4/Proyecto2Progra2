/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package Views;

import java.util.List;

/**
 *
 * @author sofia
 */
public interface IView<Ent> {

    public void show(Ent ent);

    public void showAll(List<Ent> ents);

    public void showMessage(String msg);

    public void showError(String err);

    public boolean validateRequired();
}
