package avocado.memory;

/**
 * Cell.java
 * The class that stores a single piece of data
 */

public class Cell {
    public String address;
    public String value;
    public Cell(String address, String value) {
        this.address = address;
        this.value   = value;
    }
}
