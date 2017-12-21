
import java.util.Date;
import java.util.List;



/*
Ejercicio 2 - Implementar un método a partir de un enunciado
A Juan, el presidente del Club 111Mil, le gustó la primera implementación del programa que
le resuelve sus problemas y se le ocurrió agregar otra funcionalidad al mismo:
* En la clase Equipo, al momento de agregar un jugador a un equipo (método
addJugador)

Ejercicio 3 - Extender la funcionalidad de un método a partir
del enunciado.
El siguiente método realizarReserva reserva una cancha para dos equipos. Ahora habría que
agregarle funcionalidad para que en el momento de realizar una reserva se veri
válidos:
* Equipo A: Juan, Pedro, Carlos, Federico y Javier.
* Equipo B: Martín, Pablo, Sebastián, Gonzalo y Lucas.
Sin embargo, estos equipos no son válidos para una reserva:
* Equipo A: Juan, Pedro, Carlos, Federico y Javier.
* Equipo B: Martín, Juan, Sebastián, Carlos y Lucas.
 */

/**
 *
 * @author jose.zapatagom
 */
public class Reserva {
    
   private Date fechareserva;
   private Equipo equipo1,equipo2;
   private List<Cancha> cancha;
    
    public Reserva(Date dReserva, Equipo dEquipo1, Equipo dEquipo2){
    
    this.fechareserva=dReserva;
    this.equipo1=dEquipo1;
    this.equipo2=dEquipo2;
    
    }
    
    
    public boolean realilzarReserva(Date fecha, Cancha cancha,Equipo e1,Equipo e2){
    
    if(!hayjugadoresRepetidos(e1,e2)){
    
        Reserva nueva = new Reserva(fecha,e1,e2);
        nueva.setFechaeserva(fecha);
        nueva.setEquipo1(e1);
        nueva.setEquipo1(e2);
        cancha.addReserva(nueva);
        this.addCancha(cancha);
        
        return true;
    }
    else{
    
    return false;
    }
   
    
    }

    public Date getFechareserva() {
        return fechareserva;
    }

    private void setFechaeserva(Date fecha) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    public Equipo getEquipo1() {
        return equipo1;
    }

    public void setEquipo1(Equipo equipo1) {
        this.equipo1 = equipo1;
    }

    public Equipo getEquipo2() {
        return equipo2;
    }

    public void setEquipo2(Equipo equipo2) {
        this.equipo2 = equipo2;
    }
    
    public void addCancha(Cancha cancha){
    
    this.cancha.add(cancha);
    }
    
    
    public boolean hayjugadoresRepetidos(Equipo e1, Equipo e2){
    
    
    List<String> jugadores1=e1.getJugadores();  // lista de jugadores del equipo1
    List<String> jugadores2=e2.getJugadores();  // lista de jugadores del equipo2
    int l=jugadores1.size();   //  cantidad de jugadores del equipo1
    boolean existe=false;
    
    for(int i=0; i<l;i++){    // itero sobre los jugadores del equipo1
        if (jugadores2.contains(jugadores1.get(i))){   // si el equipo2 contiene al iésimo jugador del equipo1
            existe=true;
        }
    }
    return existe;
        
    }

   
    
    
}
