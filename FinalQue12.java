
public class FinalQue12 {

    public static void main(String[] args) {
        String[][] trafficLights = { {"red","yellow", "green"}, {"green","red", "yellow"}, {"red", "green", "orange"}};

        // ADD YOUR CODE HERE //
        //Outer for loop
        for (int row = 0; row < trafficLights.length; row++){

            //Inner for loop
            for (int col = 0; col < trafficLights[row].length; col++){

                //If to check whether the value is yellow
                if (trafficLights[row][col].equals("yellow")){
                    //Assign the new value
                    trafficLights[row][col] = "orange";
                }
            }
        }

    }
}
