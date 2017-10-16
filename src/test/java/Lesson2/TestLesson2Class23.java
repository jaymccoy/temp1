package Lesson2;

import org.junit.jupiter.api.Test;


public class TestLesson2Class23 {
    int ticketPrice = 10;

    @Test
    public void testRun() {
        System.out.println("Price: " + TestLesson(10, false));
        System.out.println("Price: " + TestLesson(16, false));
        System.out.println("Price: " + TestLesson(16, true));
        System.out.println("Price: " + TestLesson(61, false));
        System.out.println("Price: " + TestLesson(61, true));
    }//end function

    public int TestLesson(int age, boolean isStudent) {
        ticketPrice = 10;
        if (age < 16 || age > 60 || isStudent) {
            ticketPrice = 5;
        } //end if
        return ticketPrice;
    }//end function
}//end class