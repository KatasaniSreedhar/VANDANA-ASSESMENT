import java.util.*;
import java.util.Arrays;
import java.util.Random;

public class shuffle{
  public static void main(String[] args){

    int[] array={1,2,3,4,5,6,7};

    Random b=new Random();

    for(int i=0;i<array.length;i++){
      int randomIndex=b.nextInt(array.length);
      int temp=array[randomIndex];
      array[randomIndex]=array[i];
      array[i]=temp;
      
    }
    System.out.println(Arrays.toString(array));
  }
}