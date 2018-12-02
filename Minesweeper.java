public class Minesweeper{
  public static void main(String[] args) {
    int m = 10;
    int n = 10;

    double p = 15;

    // game grid

    boolean [] [] bombs = new boolean[m+2][n+2];
    for(int i = 1;i <= m ; i++){
      for(int j = 1; j<= n; j++){
        bombs[i][j] = (Math.random()<p);
      }
    }
    // print game
    for(int i = 1; i<= m ;i++){
      for(int j = 1; j<= n; j++){
        if(bombs[i][j])
            System.out.print("* ");
            else
              System.out.print(". ");
      }
      System.out.println();
    }
    // sol [i] [j] = # bombs adjacent to cell (i ,j)
    int [] [] sol = new int [m+2][n+2];
    for(int i = 1; i<= m ; i++){
      for(int j = 1; j <= n; j++){
        // ii jj indexes neighboring cellls
        for(int ii = i - 1;ii<= i+1;i++){
          for(int jj = j -1; jj <= j+1;jj ++){
            if(bombs[ii][jj]){
              sol[i][j]++;
            }
          }
        }
      }
    }
    System.out.println();
    for(int i = 1; i <= m; i++){
      for(int j = 1; j<= n;j++){
        if(bombs[i][j])
          System.out.print("* ");
          else
            System.out.print(sol[i][j]+ " ");
      }
      System.out.println();
    }

  }
}
