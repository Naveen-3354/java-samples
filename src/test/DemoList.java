package test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Stack;

public class DemoList {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(1231);
        list.add(987);
        list.add(78);
        list.add(2973);
        list.add(5980);
        list.add(688);
        System.out.println(list
        );

        Stack<Integer> stack = new Stack<>();
        stack.add(1231);
        stack.add(987);
        stack.add(78);
        stack.add(2973);
        stack.add(5980);
        stack.add(688);
        System.out.println(stack);
        System.out.println(stack.pop());
        System.out.println(stack);


        HashMap<Integer, String> map = new HashMap<>();
        map.put(1, "qwer");
        map.put(2, "asdf");
        map.put(3, "asdf");
        map.put(4, "poiu");
        map.put(1, "mnbv");
        System.out.println(map);


        List<Chaining> list1 = new ArrayList<>();
        list1.add(new Chaining());
        list1.add(new Chaining());
        list1.add(new Chaining());
        list1.add(new Chaining());
        list1.add(new Chaining());
        list1.add(new Chaining());

        System.out.println(list1);
    }
}
