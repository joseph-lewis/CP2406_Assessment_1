public class Main {

    public static void main(String[] args) {
        Car car_obj = new Car();
        StraightRoad road = new StraightRoad();
        int RoadLength = road.length;
        int xaxis = 10;
        int yaxis = 10;
        road.add_road(0, 0);
        while (car_obj.car_xpos < xaxis) {
            System.out.printf("(%s,%s)\n", car_obj.car_xpos, car_obj.car_ypos);
            if (car_obj.car_xpos < xtest){
                System.out.println("On ROAD");
            }
            car_obj.drive();
        }
    }
}

class Vehicle {
    int length;
    int width;
    int xpos;
    int ypos;

}

class Car extends Vehicle {
    Vehicle vehicle = new Vehicle();
    int car_xpos = vehicle.xpos;
    int car_ypos = vehicle.ypos;
    int car_length = vehicle.length;
    int car_width = car_length/2;
    public void drive(){
        car_xpos += 1;
    }
    public void check_road() {

    }
}

class StraightRoad {
    int road_xpos;
    int road_ypos;
    int length = 5;
    int width = 2;
    public void add_road(int x, int y){
        int road_xaxis = x + length;
        int road_yaxis = y - width;
        return road_xaxis

    }
}
//class Motorbike extends Vehicle {
//    int bike_length = (Vehicle.length)/2;
//    int bike_width = Vehcile.width
//}
//class Bus extends Vehicle {
//    int bus_length = Vehicle.length * 3;
//    int car_width = Vehcile.width
//
//}