
/**
 * Write a description of class TicketRequerimiento here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class TicketRequerimiento extends Ticket {
    private String areaSolicitante;

    public TicketRequerimiento(int id, String descripcion, String prioridad, String areaSolicitante) {
        super(id, descripcion, prioridad);
        this.areaSolicitante = areaSolicitante;
        calcularSLA(); // RN-02
    }

    @Override
    public void calcularSLA() {
        // RN-02: Lógica de SLA Programado para Requerimientos
        if (getPrioridad().equalsIgnoreCase("Alta")) {
            setSlaHoras(24);
        } else {
            setSlaHoras(48);
        }
    }

    public String getAreaSolicitante() { return areaSolicitante; }
}