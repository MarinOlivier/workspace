package Exo1;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * Created by olivier on 20/10/2015.
 */
public class Main {
    public static void main(String[] args) {

        Scanner keyboard = new Scanner(System.in);

        System.out.println("Choix de l'exercice : ");
        String choice = keyboard.next();

        if (choice.equals("A")){
            System.out.println("Enter class name : ");
            String classname = keyboard.next();

            try {
                Class<?> c = Class.forName(classname);

                System.out.println("-------- Methods --------");
                for (Method m : c.getMethods())
                    System.out.println("m = " + m);

                System.out.println("-------- Attributes --------");
                for (Field f : c.getDeclaredFields())
                    System.out.println("f = " + f);
            }
            catch (ClassNotFoundException  e){
                System.out.println("e = " + e);
            }
        }
        else if (choice.equals("B")){
            int turn = 1;
            Entiers e = new Entiers(10);

            while (turn == 1){
                try {

                    System.out.println("Choose [add / remove] ?");
                    String action = keyboard.next();
                    int elt = keyboard.nextInt();


                    Method m = Entiers.class.getMethod(action, int.class);
                    m.invoke(e, elt);

                    System.out.println("e = " + e);

                    System.out.println("Tap 0 to stop or 1 to continue : ");
                    turn = keyboard.nextInt();

                }
                catch (InputMismatchException e1){
                    System.out.println(e1);
                    turn = 1;
                }
                catch (Exception e1){
                    System.out.println("e1 = " + e1);
                }

            }
        }
        else if (choice.equals("C")){
            Point p = new Point(3, 6);

            System.out.println("p = " + p);

            try {
                System.out.println("[_x / _y] : ");
                String fieldname = keyboard.next();

                Field f = Point.class.getDeclaredField(fieldname);
                f.setAccessible(true);

                f.setInt(p, 0);

                System.out.println("p = " + p);
            }
            catch (Exception e){
                System.out.println("e = " + e);
            }

        }
        else if (choice.equals("D")) {
            Entiers e = new Entiers(10);

            try {
                Constructor<Entiers> co = Entiers.class.getConstructor(int.class);
                Entiers e1 = co.newInstance(e.get_size());


                System.out.println("e1 = " + e1);
            }
            catch (Exception e1) {
                System.out.println("e1 = " + e1);
            }
        }
    }
}
