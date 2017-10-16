package Lesson2;

import org.junit.jupiter.api.Test;


public class TestLesson2Class15 {
    int ticketPrice = 10;

    @Test
    public void testRun() {
        System.out.println("Coffee 555: " + TestLesson(555) + "=" + TestLesson2(555));
        System.out.println("Coffee 312: " + TestLesson(312) + "=" + TestLesson2(312));
        System.out.println("Coffee 629: " + TestLesson(629) + "=" + TestLesson2(629));
        System.out.println("Coffee 666: " + TestLesson(666) + "=" + TestLesson2(666));

    }//end function

    public String TestLesson(int passCode) {
        String coffeeType = "";
        if (passCode == 555) {
            coffeeType = "Espresso";
        } else if(passCode == 312) {
            coffeeType = "Vanilla latte";
        } else if(passCode == 629) {
            coffeeType = "Drip coffee";
        } else {
            coffeeType = "Unknown";
        }//end if
        return coffeeType;
    }//end function

    public String TestLesson2(int passCode) {
        String coffeeType = "";

        switch (passCode) {
            case 555:
                coffeeType = "Espresso";
                break;
            case 312:
                coffeeType = "Vanilla latte";
                break;
            case 629:
                coffeeType = "Drip coffee";
                break;
            default:
                coffeeType = "Unknown";
                break;
        }

        return coffeeType;
    }//end function

}//end class