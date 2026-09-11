
/**
 * Write a description of class Main here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Main {
    public static void main(String[] args) {
        System.out.println("==================================================");
        System.out.println("   SISTEMA DE TICKETING  ");
        System.out.println("==================================================\n");

        GestionTickets gestor = new GestionTickets();

        // -------------------------------------------------------------
        // 1. CU-01: CREAR Y AGREGAR TICKETS (Con prueba de try-catch / RN-01)
        // -------------------------------------------------------------
        System.out.println("--- 1. CREACION DE TICKETS ---");
        try {
            TicketIncidente t1 = new TicketIncidente(101, "Caida de servidor BD", "Alta", "Critica");
            TicketRequerimiento t2 = new TicketRequerimiento(102, "Creacion correo nuevo", "Baja", "Recursos Humanos");
            TicketIncidente t3 = new TicketIncidente(103, "Falla impresora recepcion", "Media", "Menor");

            gestor.agregarTicket(t1);
            gestor.agregarTicket(t2);
            gestor.agregarTicket(t3);

            // Probar validación RN-01 (ID Duplicado)
            System.out.println("\n[Prueba RN-01: Intentando registrar ID duplicado (101)...]");
            TicketIncidente tDuplicado = new TicketIncidente(101, "Error repetido", "Alta", "Menor");
            gestor.agregarTicket(tDuplicado);

        } catch (IllegalArgumentException e) {
            System.out.println(">> EXCEPCION ATRAPADA: " + e.getMessage());
        }

        // Mostrar estado de los tickets registrados
        gestor.listarTickets();

        // -------------------------------------------------------------
        // 2. CU-02 / CU-03: ESCALACION DE TICKET (RN-03)
        // -------------------------------------------------------------
        System.out.println("\n--- 2. ESCALACION RECURSIVA POR SLA O COMPLEJIDAD ---");
        gestor.escalarTicket(101); // Escala a Nivel 2
        gestor.escalarTicket(101); // Escala a Nivel 3 (Especialista)

        // -------------------------------------------------------------
        // 3. CU-04: CIERRE DE TICKETS POR CUSTOMER SERVICE (RN-04)
        // -------------------------------------------------------------
        System.out.println("\n--- 3. RESOLUCION Y CIERRE DE CASOS ---");
        gestor.cerrarTicket(101, 3.5, 5); // ID 101 cerrado con 3.5 horas e indice de satisfacción 5
        gestor.cerrarTicket(102, 1.0, 4); // ID 102 cerrado con 1.0 hora e indice de satisfacción 4

        // -------------------------------------------------------------
        // 4. CU-05: GENERACION DE METRICAS Y KPIS (RN-05)
        // -------------------------------------------------------------
        System.out.println("\n--- 4. ESTADO FINAL DE TICKETS ---");
        gestor.listarTickets();

        gestor.generarMetricas();
    }
}