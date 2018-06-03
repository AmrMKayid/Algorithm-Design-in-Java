package IntroToAlgoDesign;

public class Sorting {

    public static void main(String[] args) {

        int arr[] = {9, 6, 7, 5, 4, 3, 1, 0};
        System.out.print("Before Sorting:\t\t\t");
        display(arr);

        insertionSort(arr);
        System.out.print("After Insertion Sort:\t");
        display(arr);
    }

    public static void insertionSort(int arr[]) {

        int i, j;

        for (i = 1; i < arr.length; ++i) {
            j = i;
            while ((j > 0) && (arr[j] < arr[j-1])) {
                int tmp = arr[j];
                arr[j] = arr[j-1];
                arr[j-1] = tmp;
                j--;
            }
        }
    }

    public static void display(int arr[]) {

        for (int i = 0; i < arr.length; ++i) {
            if(i == arr.length - 1)
                System.out.print(arr[i]);
            else
                System.out.print(arr[i] + ", ");
        }

        System.out.println();

    }
}
