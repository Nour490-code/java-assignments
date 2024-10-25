import java.util.ArrayList;

public class Q2 {
        public static int integerMax(ArrayList<Integer> list){
            int a = 0;

            if(list.isEmpty()) return a;
            for (Integer integer : list) {
                a = list.getFirst();
                if (a < integer) a = integer;
            }
            return a;
        }

        public static void sort(ArrayList<Integer> list){
            for (int i = 0; i < list.size() ; i++) {
                for (int j = i + 1; j < list.size() ; j++) {
                    int temp = 0;
                    if(list.get(i) > list.get(j)){
                        temp = list.get(i);
                        list.set(i, list.get(j));
                        list.set(j, temp);
                    }
                }
            }
        }
    }