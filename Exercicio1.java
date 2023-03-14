/*Aula 2*/

import java.util.Arrays;

public class Exercicio1{
    public int minimo(int[] arr){
        int min = arr[0];

        for (int i=1; i < arr.length; i++){
            if (min > arr[i]){
                min = arr[i];
            }
        }
        return min;
    }

    public int[] subArray(int[] arr, int begin, int end){
        return Arrays.copyOfRange(arr, begin, end + 1);
        
    }
    
    private int[] add(int[] arr, int elem){
        int [] newArr = new int[arr.length + 1];

        for (int i = 0; i < arr.length; i++){
            newArr[i] = arr[i];
        }
        newArr[arr.length] = elem;
        return newArr;
    }

    private boolean find(int[] arr, int elem){
        for (int e : arr){
            if (e == elem){
                return true;
            }
        }
        return false;
    }

    public int[] comuns(int[] a, int[] b){
        int[] c = {};
        for (int e : a){
            if (find(b, e) && !find(c, e)){
                c = add(c, e);
            }
        }
        return c;
    }

}