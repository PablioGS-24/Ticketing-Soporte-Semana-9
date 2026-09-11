
/**
 * Write a description of class Ticket here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public abstract class Ticket {
    private int id;
    private String descripcion;
    private String prioridad;     // "Alta", "Media", "Baja"
    private String estado;        // "Abierto", "Asignado", "Resuelto", "Cerrado"
    private int nivelSoporte;     // 1: Nivel 1, 2: Nivel 2, 3: Especialista
    private double horasInvertidas;
    private int slaHoras;

    public Ticket(int id, String descripcion, String prioridad) {
        this.id = id;
        this.descripcion = descripcion;
        this.prioridad = prioridad;
        this.estado = "Abierto";
        this.nivelSoporte = 1;
        this.horasInvertidas = 0.0;
    }

    // RN-02: Método abstracto para polimorfismo según el tipo de ticket
    public abstract void calcularSLA();

    // RN-03: Escalación recursiva de nivel
    public void escalar() {
        this.nivelSoporte++;
        this.estado = "Escalado a Nivel " + this.nivelSoporte;
    }

    // RN-04: Cierre del caso por Customer Service
    public void cerrar(double horas, int satisfaccion) {
        this.horasInvertidas = horas;
        this.estado = "Cerrado";
    }

    // Getters y Setters
    public int getId() { return id; }
    public String getDescripcion() { return descripcion; }
    public String getPrioridad() { return prioridad; }
    public String getEstado() { return estado; }
    public void setEstado(String estado) { this.estado = estado; }
    public int getNivelSoporte() { return nivelSoporte; }
    public double getHorasInvertidas() { return horasInvertidas; }
    public int getSlaHoras() { return slaHoras; }
    public void setSlaHoras(int slaHoras) { this.slaHoras = slaHoras; }

    @Override
    public String toString() {
        return "Ticket #" + id + " [" + estado + "] - Tipo: " + getClass().getSimpleName() +
               " | Prioridad: " + prioridad + " | SLA: " + slaHoras + "h | Soporte: Nivel " + nivelSoporte;
    }
}