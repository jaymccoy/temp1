package Lesson2;

import org.junit.jupiter.api.Test;

public class TestLesson2Class7 {

    @Test
    public void TestMain() {
        boolean isLightGreen = !true;
        boolean isLightYellow = !false;
        double carSpeed = 0;

        if (isLightGreen) {
            carSpeed = 100;
            System.out.println("Drive!");
        } else if (isLightYellow) {
            carSpeed = 50;
            System.out.println("Slow down");
        } else {
            carSpeed = 0;
            System.out.println("Drive!");
        }//end if
        System.out.println("Speed is: " + carSpeed);
    }//end function
}//end class
