//Annila Nurul Huzna
//BILANGAN 25 , 7 , 9 , 13 , 3
package tugas4_modul4;

public class Nomor1_InsertionSort {
    
    public static void insertionSort(int[] A) {
    for (int i = 1; i < A.length; i++) {
    int key = A[i]; 
    int j = i - 1;
    while (( j >= 0) && (A[j] > key)) {
        A[j + 1 ]=A[j];
        j--;}
    A[j + 1] = key;
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
    Nomor1_InsertionSort.tampil(A);    //cara menamainya yaitu name class_name public static
    Nomor1_InsertionSort.insertionSort(A);
    Nomor1_InsertionSort.tampil(A);
}
}

  
