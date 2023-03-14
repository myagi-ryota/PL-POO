import java.time.LocalDate;

import java.lang.Math;

public class Exercicio2 {
    private int capacity=10;
    private int index=0;
    private LocalDate[] dates = new LocalDate[capacity];

    public void insereData(LocalDate data){
        if (capacity <= index){
            this.capacity *= 2;
            LocalDate[] newArr = new LocalDate[capacity];
            
            for (int i = 0; i < this.dates.length; i++){
                newArr[i] = this.dates[i];
            }

            this.dates = newArr;
        }
        this.dates[index] = data;
        this.index++;   
    }



    public LocalDate dataMaisProxima(LocalDate data){
        if (this.index != 0){
            int mindif = Math.abs(data.compareTo(this.dates[0]));
            LocalDate result = this.dates[0];

            for (int i = 1; i < this.index; i++){
                if ((Math.abs(data.compareTo(this.dates[i]))) < mindif){
                    mindif = data.compareTo(this.dates[i]);
                    result = this.dates[i]; 
                }
            }
            return result;

        }
        return null;
    }

    /*String builder é mais eficiente a nível de memória do que o simples formato string */
    public String toString(){
        String s = "";
        for (int i = 0; i < index; i++){
            if (i + 1 == index){
                s = s + this.dates[i].toString();
            }    
            else{
                s = s + this.dates[i].toString() + " || ";
            }    

        }
        return s;
    }

}    
