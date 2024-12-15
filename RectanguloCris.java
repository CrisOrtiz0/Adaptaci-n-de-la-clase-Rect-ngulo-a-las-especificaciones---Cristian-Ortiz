package Objetos;
import daw.com.*;

public class RectanguloCris {
        
    private double base;
    private double altura;
    private int color;
    private Punto centro;
        
    public RectanguloCris (){
        this.base = 0;
        this.altura = 0;
        this.color = 0;
        this.centro = new Punto ();

    }
        
    public RectanguloCris (double base, double altura, int color, Punto centro) {
        this.base = base;
        this.altura = altura;
        this.color = color;
        this.centro = centro;

    }

    public RectanguloCris (RectanguloCris rectangulo){
        this.base = rectangulo.base;
        this.altura = rectangulo.altura;
        this.color = rectangulo.color;
        this.centro = new Punto(rectangulo.centro);

    }
    
    public double getBase() {
        return base;
    }
    
    public void setBase(double base) {
        this.base = base;
    }
    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }
    public int getColor() {
        return color;
    }

    public void setColor(int color) {
        this.color = color;
    }
    public Punto getCentro() {
        return centro;
    }

    public void setCentro(Punto centro) {
        this.centro = centro;
    }
    public double area ()
    {
        return (double)base*altura;
    }
    
    public void mostrarDatos()
    {
    	Pantalla.escribirSaltoLinea();
        Pantalla.escribirString("Base del rectángulo :" + base);
        Pantalla.escribirSaltoLinea();
        Pantalla.escribirString("Altura del recátngulo :" + altura);
        Pantalla.escribirSaltoLinea();
        Pantalla.escribirString("Color del rectángulo :" + color);
        Pantalla.escribirSaltoLinea();
        centro.mostrarDatos();
        
    }
    
    public void cambiarDatos() {
        
    	Pantalla.escribirString("Introduzca los nuevos datos del Rectángulo:");
        Pantalla.escribirSaltoLinea();
        
        Pantalla.escribirString("Valor de la Base");
        Pantalla.escribirSaltoLinea();
        double newBase = pedirValorDouble("Base", base);
        if (newBase > -1.0) {
        	this.base = newBase;
        }
        
        Pantalla.escribirString("Valor de la altura");
        Pantalla.escribirSaltoLinea();
        double newAltura = pedirValorDouble("Altura", altura);
        if (newAltura > -1.0) {
        	this.altura= newAltura;
        }
		
		Pantalla.escribirString("Valor del color");
        Pantalla.escribirSaltoLinea();
        int newColor = pedirValorInt("Color", color);
		if (newColor  > -1.0) {
			this.color = newColor;
		}
		
		Pantalla.escribirString("Valor del Punto Centro: ");
	    Pantalla.escribirSaltoLinea();
	    int newX = pedirValorInt("Coordenada X", centro.getX());
	    if (newX > -1.0) {
	        centro.setX(newX);
	    }
	    
	    int newY = pedirValorInt("Coordenada Y", centro.getY());
	    if (newY > -1.0) {
	        centro.setY(newY);
	    }
        
        mostrarDatos();
    
    }
    
    private double pedirValorDouble(String nombreParametro, double valorActual) {
        Pantalla.escribirString("El parametro a modificar es: " + nombreParametro + " ( Valor actual: " + valorActual + "): ");
        Pantalla.escribirSaltoLinea();
        
        double valor;
        
        
       do {
    	   String nuevoValor = Teclado.leerString("Ingrese el nuevo valor:");
    	   		if (nuevoValor.isEmpty()) {
    	   			return -1;
    	   		}
    	   		try {
    	   			valor = Double.parseDouble(nuevoValor);

    	   		} catch (NumberFormatException e) {
    	   			valor = -1;
    	   		}
    	   		
       } while (valor < 0.0);
       
       return valor;

    }
    
    private int pedirValorInt (String nombreParametro, int valorActual) {
        Pantalla.escribirString("El parametro a modificar es: " + nombreParametro + " (Valor actual: " + valorActual + "): ");
        Pantalla.escribirSaltoLinea();
        
        int valor;
        
        do {
     	   String nuevoValor = Teclado.leerString("Ingrese el nuevo valor:");
     	   		if (nuevoValor.isEmpty()) {
     	   			return -1;
     	   		}
     	   		try {
     	   			valor = Integer.parseInt(nuevoValor);

     	   		} catch (NumberFormatException e) {
     	   			valor = -1;
     	   		}
     	   		
        } while (valor < 0.0);

       return valor;

    }

}