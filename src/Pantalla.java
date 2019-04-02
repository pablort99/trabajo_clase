import java.util.ArrayList;


public class Pantalla {

    ArrayList<Figura> Figuras;



    public Pantalla() {
        this.Figuras = new ArrayList<Figura>();
    }



    public void anade_Figura(Figura figure) {
    	
        this.Figuras.add(figure);
    }

    public void modifica_Figura(char c) {
    	
        for(Figura fig: this.Figuras) {
        	
            fig.setCaracter(c);
        }
    }

    public void lista_Figuras() {
    	
        for(Figura fig: this.Figuras) {
        	
            System.out.println(fig.Nombre());
        }
    }

    public int area_Pantallas() {
    	
    	
        int aux = 0;
        
        for(Figura fig: this.Figuras) {
        	
        	
            aux += fig.Area();
        }
        return aux;
    }

    public void muestra_Pantalla() {
    	
        for(Figura fig: this.Figuras) {
        	
            fig.Dibujar();
        }
    }}