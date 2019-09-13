import java.util.ArrayList;
import java.util.List;

public class Road {
    int end_xpos;
    int length;
    int width;

    public Road(int start_xpos, int length, int width){//receive the starting position for road, its length and its width
        int[] xpositions = new int[2]; //Create int array
        xpositions[0] = start_xpos; // assign index 0 to starting position for road
        xpositions[1] = (start_xpos + length) -1; //assign finishing position is for road
        end_xpos = xpositions[1];
        this.length = length;
        this.width = width;
    }
    public int roadPosition(int car_xpos){
        int road_pos;
        if(car_xpos < this.length){
            road_pos = car_xpos; //if car is less than it's length, then its position is just it's x position
        }
        else{
            road_pos = (car_xpos - this.length); //else the position is just car position minus length of road 1
        }
        return road_pos; //return the cars position on the road
        }
}

