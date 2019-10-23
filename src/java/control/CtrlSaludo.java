/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package control; 
import javax.inject.Named;
import javax.enterprise.context.RequestScoped;
import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;

/**
 *
 * @author antonio
 */
@Named(value = "ctrlSaludo")
@RequestScoped
public class CtrlSaludo {
  private String nombre;
  /** Devuelve el valor de nombre.
   * @return el valor de nombre */
  public String getNombre() {
    return nombre;
  }
  /** Asigna el valor de nombre.
   * @param nombre el valor de nombre. */
  public void setNombre(String nombre) {
    this.nombre = nombre;
  }
  public void saluda() {
    final String saludo = "Hola " + getNombre() + ".";
    FacesContext.getCurrentInstance()
        .addMessage(null, new FacesMessage(saludo));
  }
}