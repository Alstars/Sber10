import java.util.*;

public class Bank {

    public static void main(String[] Arg) {
        Random rn = new Random();
        HashMap<Integer, User> hshMap = new HashMap<Integer, User>();
        hshMap.put(1, new User(1, 1232, rn.nextInt()));
        hshMap.put(1, new User(2, 1232, rn.nextInt()));
        hshMap.put(1, new User(3, 1232, rn.nextInt()));
        hshMap.put(1, new User(4, 1232, rn.nextInt()));
        hshMap.put(1, new User(5, 1232, rn.nextInt()));
        hshMap.put(1, new User(6, 1232, rn.nextInt()));
        System.out.println(Collections.singletonList(hshMap));
    }

    public static void printMap(HashMap mp) {
        Iterator it = mp.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry pair = (Map.Entry) it.next();
            System.out.println(pair.getKey() + " = " + pair.getValue());
            it.remove(); // avoids a ConcurrentModificationException
        }

    }
}


