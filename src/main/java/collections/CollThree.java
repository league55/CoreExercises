package collections;

import java.util.*;

/**
 На базе коллекций реализовать структуру хранения чисел с поддержкой следующих операций:
 добавление/удаление числа;
 поиск числа, наиболее близкого к заданному (т.е. модуль разницы минимален).
 */
public class CollThree {
   public CollThree(){
        setResource(new ArrayList<Integer>());
        int i = 0;
        Random rand = new Random();
        while (i<4){
            resource.add(rand.nextInt((9 - (7)) + 1) + (7));
            System.out.println(resource.get(i));
            i++;
        }
    }




    private List<Integer> resource;

    public List<Integer> addNumber(int num){
        resource.add(num);
        return resource;
    }
    public List<Integer> removeNumber(int num){
        Iterator<Integer> it = resource.iterator();
        while (it.hasNext()){
            if(it.next().equals(Integer.valueOf(num))) it.remove();

        }

        return resource;
    }

    public int[] findNext(int num){

        return parse(resource, num);

    }


    public int[] parse(List<Integer> resource, int num){
        int[] returnedArray = new int[2];
        int dif = Math.abs(num - resource.get(0));
        int newDif;
        int i = 0;
        returnedArray[0]=resource.get(i);
        returnedArray[1]=dif;

            for(;i<resource.size()-1;++i){
                newDif= Math.abs(num-resource.get(i));
                if(newDif == 0) {
                    dif = newDif;
                    returnedArray= new int[]{resource.get(i), dif};
                    break;
                }

                if(dif>newDif){
                    dif=newDif;
                    returnedArray[0]=resource.get(i);
                    returnedArray[1]=dif;
                }

            }



        System.out.println(returnedArray[0]+" : "+returnedArray[1]);
          return returnedArray;
    }


    public List<Integer> getResource() {
        return resource;
    }

    public void setResource(List<Integer> resource) {
        this.resource=resource;

    }
}
