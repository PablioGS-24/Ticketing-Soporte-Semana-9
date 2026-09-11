
/**
 * Write a description of class TicketIncidente here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class TicketIncidente extends Ticket {
    private String severidad; // "Crítica", "Mayor", "Menor"

    public TicketIncidente(int id, String descripcion, String prioridad, String severidad) {
        super(id, descripcion, prioridad);
        this.severidad = severidad;
        calcularSLA(); // RN-02
    }

    @Override
    public void calcularSLA() {
        // RN-02: Lógica de SLA Inmediato para Incidentes
        if (severidad.equalsIgnoreCase("Crítica")) {
            setSlaHoras(2);
        } else if (getPrioridad().equalsIgnoreCase("Alta")) {
            setSlaHoras(4);
        } else {
            setSlaHoras(8);
        }
    }

    public String getSeveridad() { return severidad; }
}