/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exa;

import java.util.Arrays;
import static pregunta3.TechnicalInterviewTest.removeDuplicates;

/**
 *
 * @author barah
 */
public class inicio {
    // el inicio dodne llamamos a la clase de busqueda
    /**
    public static void main(String args[])
    {
        BinarySearch ob = new BinarySearch();
        int arr[] = { 2, 3, 4, 10, 40 };
        int n = arr.length;
        int x = 10;
        int result = ob.binarySearch(arr, 0, n - 1, x);
        if (result == -1)
            System.out.println("Elemennto no encontrado");
        else
            System.out.println("Elemento encontrado en el indice: "
                               + result);
    }
    */
    public static void main(String args[]) {

        int[][] test = new int[][]{
            {1, 1, 2, 2, 8, 4, 5},
            {1, 1, 1, 1, 1, 1, 1},
            {1, 2, 3, 4, 5, 6, 7},
            {1, 2, 1, 2, 1, 1, 1},};

        for (int[] input : test) {
            System.out.println("Matriz con duplicados       : " + Arrays.toString(input));
            System.out.println("Despues de eliminar duplicados   : " + Arrays.toString(removeDuplicates(input)));
        }
    }
    
}
