package com.argus;

/**
 *
 * @author Satyajit
 */
public class Element {

    private int value;
    private Element nextElement;

    public Element(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public Element getNextElement() {
        return nextElement;
    }

    public void setNextElement(Element nextElement) {
        this.nextElement = nextElement;
    }
}
