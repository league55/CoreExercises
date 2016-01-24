package Collections;

import java.util.List;

/**
 На базе коллекций реализовать структуру хранения чисел с поддержкой следующих операций:
 добавление/удаление числа;
 поиск числа, наиболее близкого к заданному (т.е. модуль разницы минимален).
 */
public class CollThreeModif extends CollThree{

/**
 *  if the List contains both, right and left neighbour numbers, returns them,
 *  Failing that returns closer one and difference
 *  */
    public int[] parse(List<Integer> resource, int num){
        int[] returnedArray = new int[2];
        int posDif = Math.abs(num - resource.get(0));
        int negDif = Math.abs(num - resource.get(0));
        int newDif;
        int i = 0;

        /**May be mistake if there is no right/left neigboure*/
           returnedArray[0]=resource.get(i);
           returnedArray[1]=resource.get(i);




            for(;i<resource.size()-1;++i){

                newDif= Math.abs(num-resource.get(i));
                if(newDif == 0) {
                    posDif = newDif;
                    returnedArray= new int[]{resource.get(i), posDif};
                    System.out.println("num is:"+returnedArray[0]+", the dif is: "+returnedArray[1]);
                    return returnedArray;
                }
                if(num-resource.get(i)>0){
                    if (posDif>newDif){
                        posDif=newDif;
                        returnedArray[0]=resource.get(i);
                    }

                }if(num-resource.get(i)<0) {
                    if (negDif > newDif) {
                        negDif = newDif;
                        returnedArray[1] = resource.get(i);
                    }
                }
 }

        if(returnedArray[1]-returnedArray[0]>2){
            if (Math.abs(num-returnedArray[0])<Math.abs(num-returnedArray[1])){
                returnedArray[1]=num-returnedArray[0];
                System.out.println("num is:"+returnedArray[0]+", the dif is: "+returnedArray[1]);
            }else {
                int temp = returnedArray[0];
                returnedArray[0]=returnedArray[1];
                returnedArray[1]=num-temp;
                System.out.println("num is:"+returnedArray[0]+", the dif is: "+returnedArray[1]);
            }
        }else System.out.println("left is +"+returnedArray[0]+" : right is "+returnedArray[1]);

          return returnedArray;
    }


}
