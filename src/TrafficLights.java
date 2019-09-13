import java.util.Random;

public class TrafficLights {
    String state;
    double chance_of_red;
    int xpos;
    public TrafficLights(double chance_of_red, int xpos){
        this.chance_of_red = chance_of_red;
        this.xpos = xpos;
    }
    public String lightState(){
        Random rand = new Random();
        float random_selected_num = rand.nextFloat();
        if(random_selected_num < chance_of_red){
            state = "red";
        }
        else{
            state = "green";
        }
        return state;
    }
}
