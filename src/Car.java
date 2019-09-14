public class Car {
    private int car_length = 2; //dimensions for car
    private int car_width = car_length / 2;
    int car_xpos = 0; //car c-xoordinate

    public Car(int car_xpos) {
        this.car_length = car_length;
        this.car_width = car_width;
        this.car_xpos = car_xpos;
    }

    public void drive() {
            car_xpos++; //increase x-position
    }
}