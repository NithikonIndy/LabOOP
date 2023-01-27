import java.util.Scanner;



public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter size : ");
        int size = s.nextInt(); //recived size of array
        while (size<=0){ //check size negative
            Scanner s1 = new Scanner(System.in);
            System.out.print("Enter size : ");
            size = s1.nextInt();
        }

        int[] arr = new int[size];// create array

        for (int i = 0; i < arr.length; i++) { // recived input number
            Scanner num = new Scanner(System.in);
            System.out.print("Enter your number : ");
            int temp = num.nextInt();
            arr[i] = temp;
        }

        sort(arr);
        show(arr);
    }

    static void sort(int[] a) { // sort array
        for (int i = 0; i < a.length; i++) {
            for (int j = i + 1; j < a.length; j++) {
                int temp = 0;
                if (a[j] < a[i]) {
                    temp = a[i];
                    a[i] = a[j];
                    a[j] = temp;
                }
            }

        }
    }
    static void show(int[] s) { // show array
        for(int i=0;i<s.length;i++){
            System.out.println("Array "+ "[ " + i +" ] : " + s[i]+ "  ");
        }
    }


}
