package Lesson_1;

public class Cat extends Animal {
    int age;

    public Cat(String name, int age) {
        super(name);
        this.age = age;
    }

    @Override
    void info() {
        System.out.println("Cat " + name + " " + age);
    }

    //
//    void info(String name, int age) {
//        System.out.println(age + " " + name);
//    }
//
//    void info(int count, String surname) {
//        System.out.println(age + " " + name);
//    }

//    void info(int... mass) {
////        int a = 10;
//////        int b = 10;
//////
//////        int z = a + b;
////
////        int res = a > 0 ? 1 : 0;
//
//        System.out.println(age + " " + name);
//    }
}
