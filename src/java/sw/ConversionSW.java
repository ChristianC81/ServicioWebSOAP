/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/WebServices/WebService.java to edit this template
 */
package sw;

import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;

/**
 *
 * @author chris
 */
@WebService(serviceName = "ConversionSW")
public class ConversionSW {

    /**
     * This is a sample web service operation
     */
    @WebMethod(operationName = "hello")
    public String hello(@WebParam(name = "name") String txt) {
        return "Hello " + txt + " !";
    }

    /**
     * Web service operation
     */
    @WebMethod(operationName = "euroAdolar")
    public Double euroAdolar(@WebParam(name = "euros") double euros) {
        //TODO write your implementation code here:
        return euros * 1.15;
    }

    /**
     * Web service operation
     */
    @WebMethod(operationName = "login")
    public boolean login(@WebParam(name = "usuario") String usuario, @WebParam(name = "clave") String clave) {
        //Credenciales de Acceso
        String us = "christianc1";
        String password = "12345";
        if (us.equals(usuario) && password.equals(clave)) {
            return true;
        }
        return false;
    }

    /**
     * Web service operation
     */
    @WebMethod(operationName = "operacionesBasicas")
    public float operacionesBasicas(@WebParam(name = "num1") float num1, @WebParam(name = "num2") float num2, @WebParam(name = "operacion") int operacion) {
        //TODO write your implementation code here:
      float resultado = 0;
        if (operacion==1) {
            resultado = num1 + num2;
        } else {
            if (operacion==2) {
                resultado = num1 - num2;
            } else {
                if (operacion==3) {
                    resultado = num1 * num2;
                } else {
                    if (operacion==4) {
                        resultado = num1 / num2;
                    }
                }
            }
        }
        return resultado;
    }
    /**
     * Web service operation
     *
     * @param distancia
     * @param tiempo
     * @return
     */
    @WebMethod(operationName = "formulaVelocidad")
    public float formulaVelocidad(@WebParam(name = "distancia") float distancia, @WebParam(name = "tiempo") float tiempo) {
        //TODO write your implementation code here:
        float velocidad = (distancia / tiempo);
        /*
        velocidad promedio = distancia / tiempo
        velocidad promedio = 200 km / 4 h = 50 km/h
         */
        return velocidad;
    }

    /**
     * Web service operation
     *
     * @param radio
     * @return
     */
    @WebMethod(operationName = "formulaArea")
    public float formulaArea(@WebParam(name = "radio") float radio) {
        //TODO write your implementation code here:
        float area = (float) (Math.PI * Math.pow(radio, 2));
        /*
        área = π * radio^2
        área = π * (5 cm)^2 ≈ 78.54 cm²
         */

        return area;
    }

    /**
     * Web service operation
     *
     * @param masa
     * @param velocidad
     * @return
     */
    @WebMethod(operationName = "formulaEnergiaCinetica")
    public float formulaEnergiaCinetica(@WebParam(name = "masa") float masa, @WebParam(name = "velocidad") float velocidad) {
        //TODO write your implementation code here:
        float energiaCinetica = (float) (0.5 * masa * Math.pow(velocidad, 2));
        //energía cinética = 0.5 * 2 kg * (10 m/s)^2 = 100 J        
        return energiaCinetica;
    }
}
