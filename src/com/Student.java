package com;

/**
 * @author Li Ersan
 */
public class Student {
    private String name;

    private int score;

    public Student(String name, int score) {
        this.name = name;
        this.score = score;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", score=" + score +
                '}';
    }

    public static void main(String[] args) {
        Array<Student> array = new Array<>();
        array.addLast(new Student("Alice", 100));
        array.addLast(new Student("Bob", 66));
        array.addLast(new Student("Charlie", 88));

        System.out.println(array);
    }
}
