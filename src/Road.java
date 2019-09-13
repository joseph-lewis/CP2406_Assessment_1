import java.util.ArrayList;
import java.util.List;

public class Road {
    int[] xpositions = new int[2];
    int end_xpos;
    int length;
    int width;
    public Road(int start_xpos, int length, int width){
        xpositions[0] = start_xpos;
        xpositions[1] = (start_xpos + length) -1;
        end_xpos = xpositions[1];
        this.length = length;
        this.width = width;
        }
    public int roadPosition(int car_xpos){
        int road_pos;
        if(car_xpos < this.length){
            road_pos = car_xpos;
        }
        else{
            road_pos = (car_xpos - this.length);
        }
        return road_pos;
        }
}

