
public class Problem2 {

    public boolean equillibrium(int n, int x[], int y[], int z[]) {
        if (n <= 0)
            throw new IllegalArgumentException("N is out of range");

        int totalsumofX = 0;
        int totalsumofY = 0;
        int totalsumofZ = 0;

        while (n > 0) {
            totalsumofX += x[n-1];
            totalsumofY += y[n-1];
            totalsumofZ += z[n-1];
            n--;
        }
        if (totalsumofX + totalsumofY + totalsumofZ == 0)
            return true;
        else
            return false;
    }

}
