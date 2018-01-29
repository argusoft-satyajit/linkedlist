package com.argus;

/**
 *
 * @author Satyajit
 */
public class Runner {

    public static void main(String[] args) {
        Menu menu = new Menu();
        LinkedList linkedList = new LinkedList();
        while (true) {
            System.out.println("\n--------------------------------------------------------------------------------\n");
            linkedList.print();
            int option = menu.ask();
            if (option != 0) {
                int value = menu.next(option);
                switch (option) {
                    case 1: {
                        Element element = linkedList.append(value);
                        System.out.println(element.getValue() + " appended to linkedlist.");
                        break;
                    }
                    case 2: {
                        Element element = linkedList.removeTail();
                        if (element != null) {
                            System.out.println(element.getValue() + " removed from linkedlist.");
                        }
                        break;
                    }
                    case 3:
                        int numberOfElementsRemoved = linkedList.removeAllElementGreaterThanValue(value);
                        System.out.println(numberOfElementsRemoved + " elements removed from linkedlist.");
                        break;
                }
            }
        }
    }

}
