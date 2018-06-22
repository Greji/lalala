/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Fracciones;

/**
 *
 * @author start
 */
public class Fraccion {
    protected int num;
    protected int denom;
    protected boolean estado=true;
    
    /*** Valida si el numerador y el denominador son distintos a 0
     * 
     * @param n
     * @param d
     * @return 
     */
    
    
    
     public Fraccion()
        {
        }

    public Fraccion(int num, int denom) {
        this.num = num;
        this.denom = denom;
    }

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public int getDenom() {
        return denom;
    }

    public void setDenom(int denom) {
        this.denom = denom;
    }
    
    

    public boolean validar(int n, int d) {
        if (n==0 || d==0)
        {
            return false;
        }
        denom = d;
        num = n;
        return true;
    }
        
    
        /*** Realiza una suma de fracciones
         * 
         * @param a es una de las fracciones a sumar
         * @param b es otra de las fracciones a sumar
         * @return Se retorna una variable tipo Fraccion como respuesta
         */
        public Fraccion suma(Fraccion a, Fraccion b)
        {
            int divisor;
            Fraccion c = new Fraccion();
            c.denom = a.denom * b.denom;
            c.num = (a.num * b.denom) + (b.num * a.denom);
            divisor = c.mcd(c.num, c.denom);
            c.num /= divisor;
            c.denom /= divisor;
            
            System.out.println(c.num + " "+ c.denom);
            return c;
        }

        /*** Realiza resta de fracciones
         * 
         * @param a es una de las variables tipo fraccion a restar
         * @param b es una de las variables tipo fraccion a restar
         * @return Se retorna una variable tipo Fraccion como respuesta
         */
        public Fraccion resta(Fraccion a, Fraccion b)
        {
            int divisor;
            Fraccion c = new Fraccion();
            c.denom = a.denom * b.denom;
            c.num = (a.num * b.denom) - (b.num * a.denom);
            if(c.num<0){
                c.num*=-1;
                this.estado=false;
            }
            divisor = c.mcd(c.num, c.denom);
            c.num /= divisor;
            c.denom /= divisor;
            
            
            
            

            return c;
        }

        /*** Realiza multiplicación de fracciones
         * 
         * @param a es una de las variables tipo fraccion a multiplicar
         * @param b es una de las variables tipo fraccion a multiplicar
         * @return Se retorna una variable tipo Fraccion como respuesta
         */
        public static Fraccion multiplicacion(Fraccion a, Fraccion b)
        {
            int divisor;
            Fraccion c = new Fraccion();
            c.denom = a.denom * b.denom;
            c.num = a.num *b.num;
            divisor = c.mcd(c.num, c.denom);
            c.num /= divisor;
            c.denom /= divisor;
            


            return c;
        }

        /*** Realiza división de fracciones
         * 
         * @param a es una de las variables tipo fraccion para realizar la operacion
         * @param b es una de las variables tipo fraccion para realizar la operacion
         * @return Se retorna una variable tipo Fraccion como respuesta
         */
        public static Fraccion division(Fraccion a, Fraccion b)
        {
            int divisor;
            Fraccion c = new Fraccion();
            c.num = a.num * b.denom;
            c.denom = a.denom * b.num;
            divisor = c.mcd(c.num, c.denom);
            c.num /= divisor;
            c.denom /= divisor;
            return c;
        }

        
        /*** Saca el minimo comun divisor de dos numeros
         * 
         * @param a Es uno de los numeros de los que se sacará el mcd
         * @param b Es uno de los numeros de los que se sacará el mcd
         * @return Se retorna un int con el minimo comun divisor
         */
         public int mcd(int a, int b)
        {
            int c;
            while (a != b)
            {
                if (a > b)
                    a = a - b;
                else
                    b = b - a;
            }
            c = a;
            return c;
        }
    
}
