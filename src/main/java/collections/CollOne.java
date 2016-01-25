package collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

/**
 *В кругу стоят N человек, пронумерованных от 1 до N. При ведении
 счета по кругу вычеркивается каждый второй человек, пока не останет-
 ся один. Составить две программы, моделирующие процесс.
 Одна изпрограмм должна использовать класс ArrayList, а вторая –
 LinkedList. Какая из двух программ работает быстрее? Почему?
 */

/**
 * non working yet
 * */
public class CollOne {
    List<Persone> linkedPeople = new LinkedList<Persone>();
    List<Persone> arrayPeople = new ArrayList<Persone>();
    private int N;

    public CollOne(int N) {
        this.N = N;
        for (int i = 0; i < N; i++) {
            linkedPeople.add(new Persone());
            //   arrayPeople.add(new Persone());
        }
    }

    public static int personAmount = 1;

    class Persone {
        public int num = personAmount++;

        public Persone() {

            System.out.println("Jotheph N: " + num + "\n");
        }
    }

    public String getJotheph() {


        boolean firstCome = true;
        int leftPeople = linkedPeople.size();
        while (leftPeople > 1) {
            int i = 0;


            if (leftPeople % 2 == 0 || firstCome) {

                while (linkedPeople.size() > i + 1) {
                    System.out.println(linkedPeople.remove(++i).num + " removed \n");
                    leftPeople--;
                }




            } else {
                i=-1;
                while (linkedPeople.size() > i + 1) {
                    System.out.println(linkedPeople.remove(++i).num + " removed \n");
                    leftPeople--;
                }
            }
            firstCome = false; //первый проход всегда со второго элемента.
       }
        Iterator<Persone> it = linkedPeople.iterator();
        while (it.hasNext()) {
            int index = linkedPeople.indexOf(it.next());
            System.out.println(index + " - " + linkedPeople.get(index).num);

        }
        return linkedPeople.toString();

    }
}
