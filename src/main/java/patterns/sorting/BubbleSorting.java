package patterns.sorting;

import java.util.Random;

/**
 *
 */
public class BubbleSorting {
    private int[] data;

    public BubbleSorting(){
        data = new int[10];

        for (int i = 0; i <data.length-1 ; i++) {
          data[i]=new Random().nextInt(10);
        }

    }

    public int[] sort(){
        for (int i = data.length-1; i > 0; i--) {

            for (int j = 0; j < i; j++) {

                if(data[j]>data[j+1]){
                    int temp = data[j];
                    data[j]=data[j+1];
                    data[j+1]=temp;
                }

            }

        }
        for (int i = 0; i < data.length-1; i++) {
            System.out.println(data[i]);
        }

    return data;
    }


}
