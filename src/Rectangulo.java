public class Rectangulo implements Figura{

        int Base;
        int Altura;
        char Caracter;
       
        public Rectangulo(int BaseA, int AlturaA, char CharA){

            this.Base = BaseA;
            
            this.Altura = AlturaA;
            
            this.Caracter = CharA;

        }

        public String Nombre(){
            return "Rectangulo de " + Base + " x " + Altura;
        }

        public int Area(){
        	
            return Base * Altura;
        }

        public char getCaracter(){
        	
            return Caracter;
        }

        public void setCaracter(char CaracterA){
        	
            this.Caracter = CaracterA;
        }

        public void Dibujar(){
        	
            String auxBase = "";
            

           
            
            for(int i=0;i<Base;i++){
            	
            	
                auxBase += this.Caracter;
            }
            
            for(int j=0;j<Altura;j++){
            	
                System.out.println(auxBase);
            }


        }
}