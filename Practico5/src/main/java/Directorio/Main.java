/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Directorio;

/**
 *
 * @author fabri
 */
public class Main {
    public static void main(String[] args) {
        Contacto contacto1 = new Contacto(33222111,"leo","messi","san luis","av martin san");
    Contacto contacto2 = new Contacto(33222111,"julian","alvarez","cordoba","av martin san");
    Contacto contacto3 = new Contacto(33222111,"lautaro","martinez","buenos aires","av martin san");
    Contacto contacto4 = new Contacto(33222111,"leo","scaloni","santa fe","av martin san");
    
    DirectorioTelefonico dirTelefonico = new DirectorioTelefonico();
    
    dirTelefonico.agregarContacto(2664768798l, contacto1);
    dirTelefonico.agregarContacto(2664345422l, contacto2);
    dirTelefonico.agregarContacto(2664763542l, contacto3);
    dirTelefonico.agregarContacto(2664723591l, contacto4);
    
    
    
    
        System.out.println("buscar contacto:");
        System.out.println(dirTelefonico.buscarContacto(2664345422l));
        System.out.println("buscando telefono en base apellido: ");
        System.out.println(dirTelefonico.buscarTelefono("scaloni"));
        System.out.println("buscar contactos en base ciudad: ");
        System.out.println(dirTelefonico.buscarContactos("Cordoba"));
       dirTelefonico.borrarContactos(26644763542l);
    
    
    
    }
    
    
    
    
}
