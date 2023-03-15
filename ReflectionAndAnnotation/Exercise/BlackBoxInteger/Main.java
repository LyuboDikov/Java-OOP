package ReflectionAndAnnotation.Exercise.BlackBoxInteger;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException, NoSuchFieldException {
        Scanner scanner = new Scanner(System.in);

        Class<BlackBoxInt> clazz = BlackBoxInt.class;
        Constructor<BlackBoxInt> constructor = clazz.getDeclaredConstructor();
        constructor.setAccessible(true);
        BlackBoxInt blackBoxInt = constructor.newInstance();

        Field hiddenValue = clazz.getDeclaredField("innerValue");
        hiddenValue.setAccessible(true);

        String input = scanner.nextLine();

        while (!"END".equals(input)) {

            String[] inputParts = input.split("_");

            String methodName = inputParts[0];
            int argument = Integer.parseInt(inputParts[1]);

            Method method = clazz.getDeclaredMethod(methodName, int.class);
            method.setAccessible(true);
            method.invoke(blackBoxInt, argument);

            System.out.println(hiddenValue.get(blackBoxInt));

            input = scanner.nextLine();
        }
    }
}
