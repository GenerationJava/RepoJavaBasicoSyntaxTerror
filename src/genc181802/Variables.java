package genc181802;

public class Variables {

    //Variables "son como una cajita que lleva información"
    //En Java tenemos que indicar el tipo de dato que lleva esta cajita

    public static void main(String[] args) {
        /*
         Tipos primitivos
            char
            boolean
            byte
            short
            int
            long
            float
            double
         Tipo objeto
            Cadenas de texto (String)
         */

        //Datos de tipo primitivo
        char caracter = 'A';
        boolean verdadero =  true;
        byte numeroMuyPequeno = 127;
        short numeroPequeno = 32767;
        int numeroEntero = 1;
        long numeroGrande  = 535;
        float decimal = 0.13f; //Casteo consiste en convertir el tipo de dato de manera explícita
        double decimalMasGrande = 0.1212424;

        //Datos de tipo objeto o wrapper - POO
        Integer enteroTipoObjeto = 1;
        Boolean falso = false;
        Double decimalTipoObjeto = 0.56;
        String cadenaDeTexto = "Hola";

        //Para declarar una variable indico el tipo de dato y el nombre de la variable
        int variable;
        //Para inicializar una variable yo le doy un valor
        variable = 5;


    }

}
