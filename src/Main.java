public class Main {
    public static void main(String[] args) {
        double closestTerminalX;
        double closestTerminalY;
        double terminalHeading;
        double clawLength;
        int stage = 0;
        double coneXPosition;
        double coneYPosition;



        myLocalizer.setPoseEsimate(PoseStorage.currentPose);

        if(gamepad1.left_bumper){
            drive.turn(Math.toRadians(180) + 1e-6);
        }
        if(gamepad1.right_bumper){
            closestTerminalX = Math.round(myPose.getX() / 24);
            closestTerminalY = Math.round(myPose.getY() / 24);
            terminalHeading = myPose.getHeading();


           nearestTerminal(clawX(terminalHeading,getClawLength(stage)), clawY(terminalHeading, getClawLength(stage)));






        }
    }
    public static double getClawLength(int stage){
        int height = stage * 10;
        return  (height / Math.tan(69));
    }
    public static double clawX(double heading, double liftLength){
        double a = 7 * heading;
        double r = 7;
        //return formula im just too lazy
        return 0;

    }
    public static double clawY(double heading, double liftLength){
        double a = 7 * heading;
        double r = 7;
        //return formula im just too lazy
        return 0;
    }
    public static void nearestTerminal(double x, double y){
        //put traj here
    }

}