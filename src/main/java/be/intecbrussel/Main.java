package be.intecbrussel;

public class Main {
    public static void main(String[] args) {
        CRUDOperations crudOperations = new CRUDOperations();
        crudOperations.insertEntity();
        crudOperations.findEntity();
        crudOperations.updateEntity();
        crudOperations.removeEntity();


    }
}