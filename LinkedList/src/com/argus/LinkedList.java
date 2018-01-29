package com.argus;

/**
 *
 * @author Satyajit
 */
public class LinkedList {

    private Element head;
    private Element tail;

    /**
     * Creates an element with given value and append it to linkedlist.
     *
     * @param value with which Element will be created
     * @return Created Element
     */
    public Element append(int value) {
        Element element = new Element(value);
        if (tail == null) { //in case of empty linkedlist
            head = element;
        } else {
            tail.setNextElement(element);
        }
        tail = element;
        return element;
    }

    /**
     * Removes last element from the linkedlist.
     *
     * @return Removed Element
     */
    public Element removeTail() {
        Element result = null;
        if (head == null) {
            System.out.println("List is empty.");
        } else if (head == tail) { //when there is only one element
            result = head;
            head = null;
            tail = null;
        } else {
            Element element = head;
            //finding second last element
            while (element.getNextElement().getNextElement() != null) {
                element = element.getNextElement();
            }
            result = element.getNextElement();
            element.setNextElement(null); //breaking link
            tail = element; //unshifting tail
        }
        return result;
    }

    /**
     * Removes all the element which has greater value than given targetValue.
     *
     * @param targetValue Target value
     * @return Number of elements removed
     */
    public int removeAllElementGreaterThanValue(int targetValue) {
        int result = 0;

        Element previous = null;
        Element current = head;

        while (current != null) {
            if (current.getValue() > targetValue) { //this current element needs to be removed
                result++;
                if (head == tail) { //when there is only one element
                    head = null;
                    tail = null;
                    break;
                } else if (current == head) {
                    head = current.getNextElement(); //shifting head when current is head
                } else {
                    if (current.getNextElement() == null) { //if current is last element
                        tail = previous; //unshifting tail
                    }
                    //breaking link of current element
                    previous.setNextElement(current.getNextElement());
                    current = previous;
                }
            }
            //shifting pointers
            previous = current;
            current = current.getNextElement();
        }
        return result;
    }

    /**
     * Printing list.
     */
    public void print() {
        System.out.print("List : [ ");
        if (head == null) {
            System.out.print("EMPTY");
        } else {
            Element element = head;
            System.out.print(element.getValue());
            while (element.getNextElement() != null) {
                element = element.getNextElement();
                System.out.print(" -> " + element.getValue());
            }
        }
        System.out.print(" ]\n");
    }
}
