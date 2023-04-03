package Generics.Container;

public class TestStack {
    public static void main(String[] args) {
        Stack<String> personList = new Stack<>();
        personList.push("Gunther");
        personList.push("Helena");
        personList.push("Fabienne");
        for (String i : personList) {
            System.out.println(i);
        }
        personList.pop();
        System.out.println();
        for (String i : personList) {
            System.out.println(i);
        }
    }
}
