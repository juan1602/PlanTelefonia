package ejecutable;

import controlador.Controlador;
import modelo.Plan;
import vista.VentanaPrincipal;

public class test 
{
    public static void main (String[] args)
    {
       VentanaPrincipal miVentana= new VentanaPrincipal();
       Plan miModelo = new Plan(0, 0, 0, "");  
       Controlador miControlador = new Controlador(miVentana,miModelo);

    }   
}
