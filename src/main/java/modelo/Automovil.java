
package modelo;

/**
 *
 * @author Nizarindany Gonzalez Luna
 */
public class Automovil {
    private String numC,descripcionA;
    private float precio,porcentaje;
    private int plazo;
    
    public Automovil(){
    }
    
    public Automovil(String a,String b,float c,float d, int e){
        numC=a;
        descripcionA=b;
        precio=c;
        porcentaje=d;
        plazo=e;
    }
    
    public Automovil(Automovil Auto){
    }
    
    public void setNumC(String a){
        numC=a;
    }
    
    public String getNumC(){
        return numC;
    }
    
    public void setDescripcionA(String b){
        descripcionA=b;
    }
    
    public String getDescripcionA(){
        return descripcionA;
    }
    
    public void setPrecio(float c){
        precio=c;
    }
    
    public float getPrecio(){
        return precio;
    }
    
    public void setPorcentajeI(float d){
        porcentaje=d;
    }
    
    public float getPorcentajeI(){
        return porcentaje;
    }
    
    public void setPlazo(int e){
        plazo=e;
    }
    
    public int getPlazo(){
        return plazo;
    }
    
    public float CalcularPInicial(){
        return getPrecio()*getPorcentajeI()/100;    //pendiente
    }
    
    public float CalcularTotFinanciar(){
        return getPrecio()-CalcularPInicial();  //pendiente
    }
    
    public float CalcularPMensual(){
        return CalcularTotFinanciar()/getPlazo();   //pendiente
    }
    
}
