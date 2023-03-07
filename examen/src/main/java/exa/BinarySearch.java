/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exa;

/**
 *
 * @author barah
 */
class BinarySearch {
       

    // Devuelve el índice de x si está presente en arr[l..
    // r], de lo contrario devuelve -1
    int binarySearch(int arr[], int l, int r, int x)
    {
        if (r >= l) {
            int mid = l + (r - l) / 2;
 
            // Si el elemento está presente en el
            // medio mismo
            if (arr[mid] == x)
                return mid;
 
            // Si el elemento es más pequeño que mid, entonces
            // solo puede estar presente en el subarreglo izquierdo
            if (arr[mid] > x)
                return binarySearch(arr, l, mid - 1, x);
 
            // De lo contrario, el elemento solo puede estar presente
            // en el subarreglo derecho
            return binarySearch(arr, mid + 1, r, x);
        }
 // Llegamos aquí cuando el elemento no está presente
        // en matriz
        return -1;
    }
}
