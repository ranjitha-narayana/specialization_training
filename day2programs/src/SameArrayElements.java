public class SameArrayElements {

    // This function prints common elements in ar1
    void findCommon(int ar1[], int ar2[], int ar3[])
    {
// Initialize starting indexes for ar1[], ar2[] and ar3[]
        int i = 0, j = 0, k = 0;

// Iterate through three arrays while all arrays have elements
        while (i < ar1.length && j < ar2.length && k < ar3.length)
        {
// If x = y and y = z, print any of them and move ahead
// in all arrays
            if (ar1[i] == ar2[j] && ar2[j] == ar3[k])
            { System.out.print(ar1[i]+" "); i++; j++; k++; }

// x < y
            else if (ar1[i] < ar2[j])
                i++;

// y < z
            else if (ar2[j] < ar3[k])
                j++;

// We reach here when x > y and z < y, i.e., z is smallest
            else
                k++;
        }
    }

    public static void main(String args[])
    {
        SameArrayElements ob = new SameArrayElements();
        int ar1[] = {12, 35, 310, 120, 640, 180};
int ar2[] = {656, 327, 120, 180, 5600};
int ar3[] = {33, 44, 515, 120, 330, 770, 180, 1120};

        System.out.print("Common elements are ");
        ob.findCommon(ar1, ar2, ar3);
    }
}