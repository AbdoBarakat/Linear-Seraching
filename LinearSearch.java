package linear.searching;

public class LinearSearching {

    public static void main(String[] args) {

        int[] arr = new int[100];
        int nElements = 0;
        int j;

        arr[0] = 77;
        arr[1] = 99;
        arr[2] = 44;
        arr[3] = 55;
        arr[4] = 22;
        arr[5] = 88;
        arr[6] = 11;

        nElements = 7;

        for (j = 0; j < nElements; j++) {
            System.out.print(arr[j] + " ");
        }
        System.out.println("");
        
        int searchKey=67;
        for (j=0; j<nElements; j++) {
            if (arr[j] == 67) {
                break;
            }

    }
        if (j == nElements) {
            System.out.println("Can't Find " + searchKey);
        }
        else {
            System.out.println("Found it");
        }
    }
}