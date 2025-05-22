
package Modelo;


public class ConsultaM {
    private String DataConsulta;
    private String HoraConsulta;
    private String Status;

    public ConsultaM(String DataConsulta, String HoraConsulta, String Status) {
        this.DataConsulta = DataConsulta;
        this.HoraConsulta = HoraConsulta;
        this.Status = Status;
    }

    public String getDataConsulta() {
        return DataConsulta;
    }

    public void setDataConsulta(String DataConsulta) {
        this.DataConsulta = DataConsulta;
    }

    public String getHoraConsulta() {
        return HoraConsulta;
    }

    public void setHoraConsulta(String HoraConsulta) {
        this.HoraConsulta = HoraConsulta;
    }

    public String getStatus() {
        return Status;
    }

    public void setStatus(String Status) {
        this.Status = Status;
    }
    
    
}
