
public class BubbleSort {
    public static void BubbleSort{
        for (int i=0; i<array.lengeh-1;i++){
            for (int j=0 ;j<array.length-1-i; j++){
                if(array[j]>array[j+1]){
                    System.out.printin("i value is" + i +" and j value is " + j);
                     int temp = array[j];
                     array[i] = array[j+1];
                     array[j+1] = temp;
                }
            }
        }
        for(int j = 0; j<array.length; j++){
            System.out.printin(array[j] + ",")
        }
    }
    }
