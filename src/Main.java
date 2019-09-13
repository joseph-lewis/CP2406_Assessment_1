public class Main {

    public static void main(String[] args) {
        Car car_obj = new Car(0); //Create new instances of classes
        Road road_1 = new Road(0, 5, 1); //First road object
        Road road_2 = new Road(5, 5, 1); //Second road object
        TrafficLights traffic_lights = new TrafficLights(0.3, road_1.end_xpos);
        int road_number;
        road_number = 0;
        int road_position;
        while (car_obj.car_xpos < (road_1.length + road_2.length)) { //Create the main loop that will continue until finished (Car reaches end of roads)
            String traffic_light_state = traffic_lights.lightState(); //Update traffic light
            road_position = road_1.roadPosition(car_obj.car_xpos); //Store current road position
            if (car_obj.car_xpos <= road_1.end_xpos) {
                road_number = 1; } //Store current road
            if (car_obj.car_xpos > road_1.end_xpos) {
                road_number = 2; }
            System.out.printf("Car is on road %s at x-position:%s, road position:%s, light:%s\n", road_number, car_obj.car_xpos, road_position, traffic_light_state);
            if ((car_obj.car_xpos == (road_1.end_xpos - 1)) && traffic_light_state == "red") {//check what color light is to see if it needs to stop
            assert true; //Skip iteration if traffic light is red 1 segment before lights
            }
            else{
                car_obj.drive();
            }
        }

    }
}

