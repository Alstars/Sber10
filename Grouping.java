import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Grouping {

            public static void main(String[] args)
            {
                List<Car> carsList = new ArrayList<Car>();
                carsList.add(new Car("Toyota","Hatchback"));
                carsList.add(new Car("Toyota","Crossover"));
                carsList.add(new Car("Toyota","Cabriolet"));
                carsList.add(new Car("Toyota","Universal"));
                carsList.add(new Car("Honda","Sedan"));
                carsList.add(new Car("Honda","Hatchback"));
                carsList.add(new Car("Skoda","Liftback"));
                carsList.add(new Car("Skoda","Sedan"));
                carsList.add(new Car("Lada","Hatchback"));
                carsList.add(new Car("Datsun","Hatchback"));
                carsList.add(new Car("Lada","Sedan"));
                carsList.add(new Car("Renault","Hatchback"));
                carsList.add(new Car("Toyota","Hatchback"));
                carsList.add(new Car("Toyota","Hatchback"));

                Map<String, Set<String>> map1 = carsList.stream().collect(Collectors.groupingBy(Car::getName, Collectors.mapping((Car::getType), Collectors.toSet())));
                //List<String> list = new ArrayList<String>(map1.keySet());
                //System.out.println(Arrays.toString(map1.keySet().toArray()));
                printMap(map1);
            }
    public static void printMap(Map mp) {
        Iterator it = mp.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry pair = (Map.Entry)it.next();
            System.out.println(pair.getKey() + " = " + pair.getValue());
            it.remove(); // avoids a ConcurrentModificationException
        }
    }

}
class Car
{
    private String car_name;
    private String car_type;

    public Car(String sName, String sType)
    {
        this.car_name = sName;
        this.car_type = sType;
    }

    public String getName ()
    {
        return  car_name;
    }
    public String getType ()
    {
        return  car_type;
    }
}

