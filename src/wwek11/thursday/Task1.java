package wwek11.thursday;

import java.util.ArrayList;

public class Task1 {

    /*
    Remove Duplicates From Integer Array
     Input = {10,10,10,20,20,30,40,50}
     Output = { 10,20,30,40,50 }

     */

    public static void main(String[] args) {


        ArrayList<Integer> list = new ArrayList<>();
        list.add(10);
        list.add(10);
        list.add(10);
        list.add(20);
        list.add(20);
        list.add(30);
        list.add(40);
        list.add(50);

        // System.out.println(list);
       //  System.out.println(list.size());   // 8

        ArrayList<Integer> result = new ArrayList<>();  // This is for non-duplicated elements (removing dupclicates here)


        for (int i = 0; i < list.size() ; i++) {
            if (result.contains(list.get(i))) {
                continue;  // skip that element
            } else {
                result.add(list.get(i));
            }
        }

        System.out.println("result = " + result);





        
        
        
        







    }
}
