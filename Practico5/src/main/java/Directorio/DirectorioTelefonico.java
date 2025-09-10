/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package Directorio;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Map;
import java.util.TreeMap;
import java.util.TreeSet;

/**
 *
 * @author fabri
 */
public class DirectorioTelefonico {

    TreeMap<Long,Contacto> registro = new TreeMap<>();
    
    public void agregarContacto(Long numero,Contacto contacto){
        
        registro.put(numero, contacto);
    
    }
    
    public Contacto buscarContacto(Long numero){
        return registro.get(numero);
    }
    
    public TreeSet buscarTelefono(String apellido){
        TreeSet<Long> numeros = new TreeSet<>();
        for (Map.Entry<Long, Contacto> entry : registro.entrySet()) {
            Long key = entry.getKey();
            Contacto value = entry.getValue();
            if (value.getApellido().equalsIgnoreCase(apellido)) {
                numeros.add(key);
            }
        }
        return numeros;
    }
    
    public ArrayList buscarContactos(String ciudad){
        ArrayList<Contacto> contactos = new ArrayList<>();
        
        for (Map.Entry<Long, Contacto> entry : registro.entrySet()) {
            Long key = entry.getKey();
            Contacto value = entry.getValue();
            if (value.getCiudad().equalsIgnoreCase(ciudad)) {
                contactos.add(value);
            }
        }
        return contactos;
    }
    
    public void borrarContactos(Long numero){
        registro.remove(numero);
        System.out.println("se borro");
    }
}
