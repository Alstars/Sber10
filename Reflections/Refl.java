import  java.lang.reflect.*;
public class Refl {
    public static void main(String[] args) {
        Class reflectClass = Calculate.class;
        String className = reflectClass.getName();
        Class[] interfaces = reflectClass.getInterfaces();
        Class classSuper = reflectClass.getSuperclass();

        int classModifier = reflectClass.getModifiers();
        Method [] classMethods = reflectClass.getMethods();
        for(Method method: classMethods)
        {
            System.out.print((method.getName() + "\n"));
            if (method.getName().startsWith("get"))
            {
                System.out.print((method.getName()+ "\n"));
            }
        }
        }

        //for (interfaces):
        //     ) {
            
       // }
        //System.out.print(interfaces + "\n");

}