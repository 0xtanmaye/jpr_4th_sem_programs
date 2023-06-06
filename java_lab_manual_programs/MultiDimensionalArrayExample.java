public class MultiDimensionalArrayExample {
  public static void main(String[] args) {
    // Declare a 2-dimensional array
    int[][] arr = new int[3][4];

    // Initialize the elements of the array
    for(int i = 0; i < arr.length; i++) {
      for(int j = 0; j < arr[i].length; j++) {
        arr[i][j] = i + j;
      }
    }

    // Print the elements of the array
    for(int i = 0; i < arr.length; i++) {
      for(int j = 0; j < arr[i].length; j++) {
        System.out.print(arr[i][j] + " ");
      }
      System.out.println();
    }
  }
}