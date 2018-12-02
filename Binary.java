public class Binary{

  public static void BinaryNum(int n){
    int num = n;
    int power = 1;
    while (power < num/2){
      power = power*2;
    }
    while(power > 0){
      if(num < power){
        System.out.print(0);
      }
      else{
        System.out.print(1);
        num = num - power;
      }
      power = power/2;
    }
    System.out.println();
  }
  public static void main(String [] args){
    System.out.print("THIS NUM in binary is ");BinaryNum(44);
}
}
