package com.example.controldeasistencia;

public class sesionclass {
    private String name_Sesiom;
    private String estado_sesion;
    private String fecha_sesion;
    private String horainit_sesion;
    private String horafin_sesion;

    public sesionclass(String name_Sesiom, String estado_sesion, String fecha_sesion, String horainit_sesion, String horafin_sesion) {
        this.name_Sesiom = name_Sesiom;
        this.estado_sesion = estado_sesion;
        this.fecha_sesion = fecha_sesion;
        this.horainit_sesion = horainit_sesion;
        this.horafin_sesion = horafin_sesion;
    }

    public String getName_Sesiom() {
        return name_Sesiom;
    }

    public void setName_Sesiom(String name_Sesiom) {
        this.name_Sesiom = name_Sesiom;
    }

    public String getEstado_sesion() {
        return estado_sesion;
    }

    public void setEstado_sesion(String estado_sesion) {
        this.estado_sesion = estado_sesion;
    }

    public String getFecha_sesion() {
        return fecha_sesion;
    }

    public void setFecha_sesion(String fecha_sesion) {
        this.fecha_sesion = fecha_sesion;
    }

    public String getHorainit_sesion() {
        return horainit_sesion;
    }

    public void setHorainit_sesion(String horainit_sesion) {
        this.horainit_sesion = horainit_sesion;
    }

    public String getHorafin_sesion() {
        return horafin_sesion;
    }

    public void setHorafin_sesion(String horafin_sesion) {
        this.horafin_sesion = horafin_sesion;
    }
}
