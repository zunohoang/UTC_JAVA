package tests;

import java.lang.Class;
import java.lang.reflect.Modifier;

public class MyTest {
    public static void main(String[] args) throws ClassNotFoundException {
        Class<?> abstractClass = MyAbstractClass.class;

        // Lấy danh sách tất cả các class
        Class<?>[] classes = Class.forName("").getClasses();

        // Duyệt qua danh sách các class
        for (Class<?> cls : classes) {
            // Kiểm tra xem class có phải là class con của abstract class hay không
            if (abstractClass.isAssignableFrom(cls) && !Modifier.isAbstract(cls.getModifiers())) {
                System.out.println(cls.getName());
            }
        }
    }
}

abstract class MyAbstractClass {
}

class MyClass1 extends MyAbstractClass {
}

class MyClass2 extends MyAbstractClass {
}