import com.sun.org.apache.xpath.internal.SourceTree;

/**
 * Created by ITEA on 25.11.2014.
 */
public class Switch {
    public static void main(String[] args) {
//1
         int a=10;
        do {
            System.out.print(a++ +" ");
        }
        while (a<21);

        System.out.println();
        System.out.println();
//1-2
        for (int i=0; i<100; i++){
            if(i>9&&i<21) System.out.print(i+" ");
        }

        System.out.println();
        System.out.println();
//2
        for (int i=0; i<100;i++){

            while (i%3==0)
                System.out.print(i++ + " ");

        }
        System.out.println();
        System.out.println();
//3
        int[] arr=new int[101];

        for (int j=100; j>0; j--) {
            arr[j]=j;
            System.out.print(arr[j]+ " ");
        }

        System.out.println();
        System.out.println();
//4
        int sum=0;
        int[] arr2={2,3,6,7,2,3,10,1,3,8};
        for(int i=1;i<arr2.length-1;i++){
            sum+=arr2[i];
            }
        System.out.println("Summa = "+sum);
}
}
