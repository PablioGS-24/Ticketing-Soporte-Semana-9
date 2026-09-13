namespace TicketsSoporte.logica
Public class Usuario 
{
    public string strNombre {get; set;}
    public string strCodigo {get; set;}
    public string strCorreo {get; set;}

    //Constructor
    Public Usuario (string Codigo, string Nombre, string Email) {
        this.strCodigo = Codigo;
        this. srtCorreo = Email;
        this.strNombre = Nombre;
    }

    Public abstract obtenerRol(){}
}

namespace TicketsSoporte.logica
Public class GestorTicket 
{
    public List<ticket> lstTicket {get; set;}
    public List<solicitante> lstSolicitante {get; set;}
    public List<tecnico> lstTecnico {get; set;}
}

Public GestorTicket()
{
    lstTecnicos = new list<Tecnico>;
    lstTickets = new list<ticket>;
    lstSolicitantes = new list<solicitante>;
}

Public Ticket crearTicket(string strNombre, string strDescripcion, int intNumero, string strCategoria, string strPrioridad, Solicitante objSolicitante, Tecnico objTecnico)
{
    //Validaciones
    //If...
    Ticket objTicket = new Ticket(strNombre, strDescripcion, intNumero, strCategoria, strPrioridad, objSolicitante);
    objTicket.asignarTecnico(objTecnico);
    //Logica DisponibilidadTecnico 
}

public ticket buscarTicket(int intNumero)
    {
        Ticket objTicket = LstTickets.Find(t => t.intNumero == intNumero);
        return objTicket;
    }