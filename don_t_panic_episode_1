import java.util.*;

class Player {

    public static void main(String args[]) {
        
        Scanner in = new Scanner(System.in);
        
        // Initialization input
        int nbFloors = in.nextInt(); // number of floors
        int width = in.nextInt(); // width of the area
        int nbRounds = in.nextInt(); // maximum number of rounds
        int exitFloor = in.nextInt(); // floor on which the exit is found
        int exitPos = in.nextInt(); // position of the exit on its floor
        int nbTotalClones = in.nextInt(); // number of generated clones
        int nbAdditionalElevators = in.nextInt(); // ignore (always zero)
        int nbElevators = in.nextInt(); // number of elevators
        
        // Generate targets
        Map<Integer,Integer> targets = new HashMap<Integer,Integer>();
        targets.put(-1, 0); // no leading clone
        targets.put(exitFloor, exitPos);
        for (int i = 0; i < nbElevators; i++)
            targets.put(in.nextInt(), in.nextInt()); // key: floor value: pos
        System.err.println("Targets: " + targets.toString());

        // Game loop
        while (true) {

            // Input for one game turn
            int cloneFloor = in.nextInt(); // floor of the leading clone
            int clonePos = in.nextInt(); // position of the leading clone on its floor
            String direction = in.next(); // direction of the leading clone: LEFT or RIGHT

            System.err.println("cloneFloor: " + cloneFloor 
                                + "; clonePos: " + clonePos 
                                + "; direction: " + direction
                                + "; target: " + targets.get(cloneFloor));

            if( clonePos < targets.get(cloneFloor) && direction.equals("LEFT") 
                || clonePos > targets.get(cloneFloor) && direction.equals("RIGHT"))
                System.out.println("BLOCK");
            else
                System.out.println("WAIT");    

        }
    }
}
