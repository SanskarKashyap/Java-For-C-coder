package AppnaCollage;
import java.util.ArrayList;

public class arraylist {
    public static void main(String arg[])
    {
        ArrayList<Integer> list = new ArrayList<>();
        
        list.add(4);
        list.add(14);
        list.add(42);

        System.out.println(list);

        list.add(1,3);
        System.out.println(list);

        for(int i =0 ; i<list.size();i++)
        {
            System.out.println(list.get(i)+5);

        }

        list.sort(null);
        System.out.println(list);
    }
}
