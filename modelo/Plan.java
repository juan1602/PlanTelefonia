package modelo;

public class Plan 
{
    //--------------
    //Atributos
    //--------------
    private long numeroCelular;
    private int cantidadMinutos;
    private int costoMinutos;
    private String operador;
    private double costoPlan;

    //--------------
    //Metodos
    //--------------

    //Constructor por defecto
    public Plan()
    {
        numeroCelular= 1;
        cantidadMinutos= 1;
        costoMinutos=1;
        operador= "";
    }

    //Contructor Común u Ordinario 
    public Plan( long num, int min, int costo, String ope)
    {
        this.numeroCelular = num;
        this.cantidadMinutos = min;
        this.costoMinutos= costo;
        this.operador= ope;
    }

    //Constructor de copia
    public Plan(Plan f)
    {
        numeroCelular = f.numeroCelular;
        cantidadMinutos = f.cantidadMinutos;
        costoMinutos = f.costoMinutos;
        operador = f.operador;
    }

    // Metodos de acceso
    public long getNumeroCelular()
    {
        return numeroCelular;
    }
    public void setNumeroCelular(long numeroCelular)
    {
        this.numeroCelular= numeroCelular;
    }
    public int getCantidadMinutos()
    {
        return cantidadMinutos;
    }
    public void setCantidadMinutos(int cantidadMinutos)
    {
        this.cantidadMinutos= cantidadMinutos;
    }
    public int getCostoMinutos()
    {
        return costoMinutos;
    }
    public void setCostoMinuto(int costoMinutos)
    {
        this.costoMinutos= costoMinutos;
    }
    public String getOperador()
    {
        return operador;
    }
    public void setOperador(String operador)
    {
        this.operador= operador;
    }
    public double getCostoPlan()
    {
        return costoPlan;
    }
    public String toString()
    {
        return "Plan:"+ "\nTu numero de celular es: " + numeroCelular +"\nLa cantidad de minutos es: " + cantidadMinutos + "\nEl costo de minutos es: "+costoMinutos+"\nEl costo de tu plan es: "+ calcularPlan(); 
    }

    //saber el costo del plan
    public double calcularPlan()
    {
        
        costoPlan = costoMinutos*cantidadMinutos;
        if (operador.equals("Movilujo"))
        {
          costoPlan = costoPlan - costoPlan*0.5;
        }
        return costoPlan;

    }

    // metodo ejecutable 

    //public static void main (String[] args)
    //{
        //Plan f1 = new Plan(0, 0, 0, "");
        //System.out.println("Objeto 1: " + f1);
        //Plan f2 = new Plan(3185057337l, 300, 100, "movilujo");
        //System.out.println("Objeto 2: " + f2);
        //Plan f3 = new Plan(f2);
        //System.out.println("Objeto 3: " + f3);
    //}

}
