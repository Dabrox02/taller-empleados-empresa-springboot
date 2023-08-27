package com.empresaempleados.empleados.models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Empleado {
    
    public static final int HORAS = 100000;
    public static final int TIME_FULL = 2300000;
    public static final int TIME_FULL_BONO = 2000000;

    private String nombre;
    private String apellido;
    private String email;
    private String tipoContrato;
    private int horaTrabajo;

    public int ValoTotal(){
        if("Horas".equals(this.tipoContrato)){
            return this.horaTrabajo * Empleado.HORAS;
        }
        if("Tiempo Completo".equals(this.tipoContrato)){
            return Empleado.TIME_FULL;
        }
        
        if("Tiempo Completo mas Bonificaciones".equals(this.tipoContrato)){
            return Empleado.TIME_FULL + Empleado.TIME_FULL_BONO;
        }
        return 0;
    }

    public int getFullTime(){
        return Empleado.TIME_FULL;
    }

    public int getFullTimeBono(){
        return Empleado.TIME_FULL_BONO;
    }
}
