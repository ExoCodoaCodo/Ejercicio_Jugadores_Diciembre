
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author jose.zapatagom
 */
public class Principal {
    
    
    
    public static void main(String [] args){
    
    
    Equipo e1 = new Equipo("River",3);
    Equipo e2 = new Equipo("Boca",3);
   
    
    System.out.println(e1.getNombre());
    
    System.out.println(e2.getNombre());
    
    e1.addJugador("alejandro");
    e1.addJugador("ricardo");
    
    
    e2.addJugador("alejandro");
    e2.addJugador("ariel");
    
    System.out.println("El equipo 1 tiene a los jugadores: ");
    
    System.out.println(e1.getJugadores());
        
   
    System.out.println("El equipo 2 tiene a los jugadores: ");
    
    System.out.println(e2.getJugadores());
    
    
     Date fecha=null;
     
     
      System.out.println("**********************************************");
        System.out.println("Compara 1 a 1 si existen jugadores repetidos");
        
        List<String> equipo1 = e1.getJugadores();
        System.out.println("Equipo 1");
        System.out.println(equipo1.get(0));
        System.out.println(equipo1.get(1));
        
        System.out.println("********************");
        
        System.out.println("Equipo2");
        List<String> equipo2 = e2.getJugadores();
        System.out.println(equipo2.get(0));
        System.out.println(equipo2.get(1));
        
        System.out.println("Busca si hay un jugador repetido");
        System.out.println(equipo1.contains(equipo2.get(0)));
        
        System.out.println("**********************************************");
     
    
    Reserva reserva1 = new Reserva( fecha,  e1, e2);
    
        
    System.out.println("Pregunta si hay jugadores Repetidos");
    System.out.println(reserva1.hayjugadoresRepetidos(e1, e2));
        
    
    }
    
    
}
