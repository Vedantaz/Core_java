
class ArrayPractise {
    public static void main(String args[]) {
        // float []marks = {23.4f,45.4f,67.5f,89.6f,67.3f};
        // Scanner sc = new Scanner(System.in);
        // System.out.println("Enter the value you want to search : ");

        // float num = sc.nextFloat();
        // boolean IsInArray = false;
        // for (float ele:marks){
        // if (num == ele){
        // IsInArray = true;
        // break;
        // }
        // }
        // if (IsInArray){
        // System.out.println("The value is present in array..");

        // }
        // else{
        // System.out.println("The value is not present in array..");
        // }

        // problem no. 2

        // float []marks = {23.4f,45.4f,67.5f,89.6f,67.3f};
        // int sum = 0;
        // for (float ele:marks){
        // sum += ele;

        // }
        // System.out.println("The value of the average marks is : " + sum/marks.length);

        // problem 3

        // int [][] mat= {{1,2,3},
        // {4,6,8}};
        // int [][] mat2= {{2,6,4},
        // {7,5,1}};
        // int [][] result= {{0,0,0},
        // {0,0,0}};
        // for (int i=0; i<mat.length; i++){ // row no. of times
        // for (int j=0; j<mat[i].length; j++){ // column no. of times

        // result[i][j] = mat[i][j] + mat2[i][j];
        // System.out.print(result[i][j] + " ");

        // }
        // System.out.println(" \n"); /// print a new line

        // }

        // to reverse the array

        // int [] a= {5,4,7,9,8,1};
        // int l = a.length;
        // int n = Math.floorDiv(a.length,2);
        // int temp;
        // for (int i=0; i<n; i++){
        // // swap a[i] with a[l-1-i];
        // temp = a[i];
        // a[i] = a[l-i-1];
        // a[l-i-1] = temp;
        // }
        // for (int ele : a){
        // System.out.print(ele + " ");
        // }
        // find max in an array...
        // int max = 0;
        // int min = 999999999;
        // for (int e:a){
        // if (e>max){
        // max = e;
        // }
        // if (e<min){
        // min = e;
        // }
        // }
        // System.out.println(max);
        // System.out.println(min);
        // System.out.println(Integer.MIN_VALUE);
        // System.out.println(Integer.MAX_VALUE);
        // to find an array is sorted or not...

        int[] a = {
                3, 8, 1, 4, 9, 6, 7, 8, 9};
        int i = 0;
        boolean isSorted = true;
        while (i < a.length - 1) {
            if (a[i] > a[i + 1]) {
                isSorted = false;
                break;
            }
            i++;
        }
        if (isSorted) {
            System.out.println("The Array is sorted...");
        }
        else {
            System.out.println("The Array is not sorted...");
        }


    }

}
