package com.ufv.dis;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class EmpleadoBRTest {

    EmpleadoBR empleado = new EmpleadoBR();

    @Test
    void calculaSalarioBruto() throws BRException{
        assertEquals(1360,  empleado.calculaSalarioBruto(TipoEmpleado.VENDEDOR,2000,8));
        assertEquals(1260,  empleado.calculaSalarioBruto(TipoEmpleado.VENDEDOR,1500,3));
        assertEquals(1100,  empleado.calculaSalarioBruto(TipoEmpleado.VENDEDOR,1499.99,0));
        assertEquals(1760,  empleado.calculaSalarioBruto(TipoEmpleado.ENCARGADO,1250,8));
        assertEquals(1600,  empleado.calculaSalarioBruto(TipoEmpleado.ENCARGADO,1000,0));
        assertEquals(1560,  empleado.calculaSalarioBruto(TipoEmpleado.ENCARGADO,999.99,3));
        assertEquals(1500,  empleado.calculaSalarioBruto(TipoEmpleado.ENCARGADO,500,0));
        assertEquals(1660,  empleado.calculaSalarioBruto(TipoEmpleado.ENCARGADO,0,8));
        assertThrows(BRException.class, () -> {empleado.calculaSalarioBruto(TipoEmpleado.VENDEDOR,-1,8); } );
        assertThrows(BRException.class, () -> {empleado.calculaSalarioBruto(TipoEmpleado.VENDEDOR,1500,-1); } );
        assertThrows(BRException.class, () -> {empleado.calculaSalarioBruto(null,1500,8); } );
        assertThrows(BRException.class, () -> {empleado.calculaSalarioBruto("vendedor",1500,3); } );
    }

    @Test
    void calculaSalarioNeto() throws BRException{
        assertEquals(1640,  empleado.calculaSalarioNeto(2000));
        assertEquals(1230,  empleado.calculaSalarioNeto(1500));
        assertEquals(1259.9916,  empleado.calculaSalarioNeto(1499.99));
        assertEquals(1050,  empleado.calculaSalarioNeto(1250));
        assertEquals(840,  empleado.calculaSalarioNeto(1000));
        assertEquals(999.99,  empleado.calculaSalarioNeto(999.99));
        assertEquals(500,  empleado.calculaSalarioNeto(500));
        assertEquals(0,  empleado.calculaSalarioNeto(0));
        assertThrows(BRException.class, () -> {empleado.calculaSalarioNeto(-1); } );
    }
}