import java.util.Scanner;

public class DinamicallyArray {

    public int[] autoArray(){
        Scanner scanner = new Scanner(System.in);
        int capacity = 5;
        int[] dynamicArray = new int[capacity];
        int size = 0;
        System.out.println("Enter numbers (enter -1 to stop):");
        int num = scanner.nextInt();
        while (num != -1) {
            if (size == capacity) {
                capacity *= 2;
                int[] newArray = new int[capacity];
                System.arraycopy(dynamicArray, 0, newArray, 0, size);
                dynamicArray = newArray;
            }
            dynamicArray[size++] = num;
            num = scanner.nextInt();
        }
        System.out.println("Elements in the dynamic array : ");
        for (int i = 0; i < size; i++) {
            System.out.print(dynamicArray[i] + " ");
        }
        return dynamicArray;
    }


}
