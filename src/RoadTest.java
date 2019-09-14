public class RoadTest {
    public static void main(String args[]){
        Road road = new Road(0, 6, 2);
        int car_xpos_test = 3;
        int car_road_xpos = road.roadPosition(car_xpos_test);
        int end_pos = road.end_xpos;
        System.out.printf("Car x-position - %s\n" +
                "Car road-position - %s\n" +
                "Road end x-position - %s", car_xpos_test, car_road_xpos, end_pos);
        }
    }

