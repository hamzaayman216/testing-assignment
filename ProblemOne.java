

public class ProblemOne {

    public static boolean watermelon(int w) {

        if (w>=1 && w<=100) {

            if ( w % 2 == 0 )
                return true;

            else
                return false;

        }

        else
            throw new IllegalArgumentException("Weight is out of range");
    }
}


