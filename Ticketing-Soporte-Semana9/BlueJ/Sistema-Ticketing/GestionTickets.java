
/**
 * Write a description of class GestionTickets here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
import java.util.ArrayList;
import java.util.List;

public class GestionTickets {
    private List<Ticket> listaTickets;

    public GestionTickets() {
        this.listaTickets = new ArrayList<>();
    }

    // RN-01: Validación de ID único con Exception
    public void agregarTicket(Ticket ticket) throws IllegalArgumentException {
        for (Ticket t : listaTickets) {
            if (t.getId() == ticket.getId()) {
                throw new IllegalArgumentException("Error: El ID " + ticket.getId() + " ya está registrado.");
            }
        }
        listaTickets.add(ticket);
        System.out.println("Ticket registrado exitosamente.");
    }

    // RN-03: Escalación
    public void escalarTicket(int id) {
        Ticket t = buscarPorId(id);
        if (t != null) {
            t.escalar();
            System.out.println("Ticket #" + id + " escalado al Nivel " + t.getNivelSoporte());
        } else {
            System.out.println("Ticket no encontrado.");
        }
    }

    // RN-04: Cierre por Customer Service
    public void cerrarTicket(int id, double horas, int satisfaccion) {
        Ticket t = buscarPorId(id);
        if (t != null) {
            t.cerrar(horas, satisfaccion);
            System.out.println("Ticket #" + id + " cerrado. Horas registradas: " + horas);
        } else {
            System.out.println("Ticket no encontrado.");
        }
    }

    // RN-05: Generación de Métricas desde List<Ticket>
    public void generarMetricas() {
        int total = listaTickets.size();
        int cerrados = 0;
        double totalHoras = 0;

        for (Ticket t : listaTickets) {
            if (t.getEstado().equalsIgnoreCase("Cerrado")) {
                cerrados++;
                totalHoras += t.getHorasInvertidas();
            }
        }

        System.out.println("\n===== METRICAS Y KPIS DEL SISTEMA =====");
        System.out.println("Total de tickets creados: " + total);
        System.out.println("Total de tickets cerrados: " + cerrados);
        System.out.println("Horas totales invertidas: " + totalHoras + " hrs");
        if (cerrados > 0) {
            System.out.println("Tiempo promedio por ticket: " + (totalHoras / cerrados) + " hrs");
        }
        System.out.println("========================================\n");
    }

    public Ticket buscarPorId(int id) {
        for (Ticket t : listaTickets) {
            if (t.getId() == id) return t;
        }
        return null;
    }

    public void listarTickets() {
        System.out.println("\n--- LISTADO DE TICKETS ---");
        for (Ticket t : listaTickets) {
            System.out.println(t);
        }
    }
}