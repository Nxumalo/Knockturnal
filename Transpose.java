public class Transpose{
  public static void main(String[] args) {
    // creating a matri
    int n = Integer.parseInt("3");
    int [] [] a = new int [n][n];
    
    for(int i = 0; i<n; i++){
      for(int j = 0; j<n; j++){
        a[i][j] = n*j + j;
      }
    }
    // print out initial matrix
    System.out.println("\nBefore");
    System.out.println("------");
    for(int i = 0;i<n;i++){
      for(int j = 0; j<n; j++){
        System.out.printf("%4d",a[i][j]);
      }
      System.out.println();
    }
    // Transpose in-place
    for(int i = 0;i<n;i++){
      for(int j = i+1;j<n;j++){
        int temp = a[i][j];
        a[i][j] = a[j][i];
        a[j][i] = temp;
      }
    }
    // print out transpose matrix
    System.out.println();
    System.out.println("After");
    System.out.println("------");
    for(int i = 0;i<n;i++){
      for(int j = 0; j<n; j++){
        System.out.printf("%4d",a[i][j]);
      }
      System.out.println();
    }
  }
}
