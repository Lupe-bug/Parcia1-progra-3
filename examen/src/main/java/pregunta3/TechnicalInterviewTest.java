/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pregunta3;


import java.util.Arrays;

/**
 *
 * @author barah
 */
public class TechnicalInterviewTest {
    
    /**
     * el método es simple, primero ordena la matriz y luego compara adyacente
     * objetos, dejando de lado los duplicados, que ya está en el resultado.
     */

    /**
    public static int[] removeDuplicates(int[] numbersWithDuplicates) { 
        // este metodo toma como entrada la matriz con los 
        //duplicados y la devuelve sin ellos 

             
        Arrays.sort(numbersWithDuplicates);     
      //Utilizando el metodo sort se ordena la matriz que 
      //entra sin los duplicados
      
      
      //iniciamos un nuevo arreglo el cual es resultado 
      //estableciendo el primer elemento del arreglo como
      // el mismo primer elemento de la matriz
        int[] result = new int[numbersWithDuplicates.length];
        int previous = numbersWithDuplicates[0];
        result[0] = previous;
        
        // inciamos nuestro ciclo for que recorre la matriz se va 
        //comparando cada elemento y el ultimo en entrar se posiciona 
        //en ser el siguiente a comparar

        for (int i = 1; i < numbersWithDuplicates.length; i++) {
            int ch = numbersWithDuplicates[i];

            if (previous != ch) {
                result[i] = ch;
            }
            previous = ch;
        }
        return result;

    }
    */
     
    
    
    public static int[] removeDuplicates(int[] numbersWithDuplicates) {
         // este metodo toma como entrada la matriz con los 
        //duplicados y la devuelve sin ellos 
        
    Arrays.sort(numbersWithDuplicates);
    //Utilizando el metodo sort se ordena la matriz
    //entra sin los duplicados 
      
    int[] result = new int[numbersWithDuplicates.length];
    //se crea una nueva matriz del mismo tamaño que la primera
    
    int previous = numbersWithDuplicates[0];
    result[0] = previous;
    int uniqueCount = 1;
    // declaramos previous con la primera entrada y se 
    // queda en resultado y se delara uniquecount en 1 porque 
    //hemos incluido el orimer valor único, en el res
    
    
    
    //se recorre con ciclo for, y en cada ciclo se compara
    //el actual elemento con el anterior, cuando es diferente
    //se estabece que no esta duplicado y se agrega a resultado
    // se incrementa iniqueCount en 1
    
    for (int i = 1; i < numbersWithDuplicates.length; i++) {
        int ch = numbersWithDuplicates[i];
        if (previous != ch) {
            result[uniqueCount] = ch;
            uniqueCount++;
        }
        previous = ch;
    }
    return Arrays.copyOf(result, uniqueCount);
    //se devuelvo el  areglo y se usa el
    //Arrays.copyof para crear el ultimo arreglo con elementos unicos 
}

}



    

