
import java.util.ArrayList;
import java.util.List;


public class Equipo {
    
    private String nombre;
    private List<String> jugadores= new ArrayList();
    private int max_jugadores;
    
    public Equipo(String name,int jugadores){
    
    this.nombre=name;
    this.max_jugadores=jugadores;
    
    }
    
    
    public void addJugador(String jugador){
    
    
        
    this.jugadores.add(jugador);
    }
    
    public List<String> getJugador(){
    
    return this.jugadores;
    
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public List<String> getJugadores() {
        return jugadores;
    }


    public int getMax_jugadores() {
        return max_jugadores;
    }

    public void setMax_jugadores(int max_jugadores) {
        this.max_jugadores = max_jugadores;
    }
    

    
    
}
