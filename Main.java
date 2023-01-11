public class Main {
    public static void main(String[] args) {
        Car mycar = new Car();
        mycar.addDoor();
        mycar.addDoor();
        mycar.addDoor();
        mycar.addDoor();
        mycar.addDoor();
        System.out.println(mycar.doors);
    }
}
class Car {
    public int doors = 0;

    public void addDoor() {
        this.doors++;
    }
}