import java.util.Random;

public class TrafficLights {
    String state;
    double chance_of_red;
    int xpos;
    public TrafficLights(double chance_of_red, int xpos){// receive the probability of being red (lower the less likely it is to be red)
        this.chance_of_red = chance_of_red;
        this.xpos = xpos;
    }
    public String lightState(){
        Random rand = new Random();
        float random_selected_num = rand.nextFloat(); //select random float value
        if(random_selected_num < chance_of_red){ //if value is less than chance value, then it is red
            state = "red";
        }
        else{
            state = "green"; //if value is larger than chance value, then it is green
        }
        return state;
    }
}
