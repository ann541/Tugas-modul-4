//Annila Nurul Huzna
package tugas4_modul4;
public class Nomor2_BubbleSort {
 public static void bubbleSort(int[] A) {
        int i = 1, j, n = A.length;
        int temp;
        while (i < n){
            j = n-1 ;
            while( j >= 1){
                if (A[j-1] > A[j]){
                    temp = A[j];
                    A[j]=A[j-1];
                    A[j-1] =temp;
                }
                j = j - 1;
            }
            i = 1 + i;
        }
    }
        public static void tampil(int data[]) {
    for (int i=0; i < data.length;i++) {
        System.out.print(data[i] + " ");
    }
    System.out.println();
}
public static void main(String args[]){
    System.out.println("ANNILA NURUL HUZNA 20090114");
    int A[]= { 25 , 7 , 9 , 13 , 3 };
    Nomor2_BubbleSort.tampil(A);    //cara menamainya yaitu name class_name public static
    Nomor2_BubbleSort.bubbleSort(A);
    Nomor2_BubbleSort.tampil(A);  
}}    
