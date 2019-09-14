public class CarTest {
    public static void main(String args[]){
        Car car = new Car(0);
        while(car.car_xpos < 5){
            car.drive();
            System.out.printf("Car x-position - %s\n", car.car_xpos);
        }
    }
}
