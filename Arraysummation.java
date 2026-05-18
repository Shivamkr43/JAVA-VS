public class Arraysummation{
    public static void main(String args[]){
        int arr[] = {4, 8, 6, 9, 12};
        int sum = 0;
        for(int i = 0; i< arr.length; i++){
            sum += arr[i];
        }
        System.out.println("sum of given array is: "+ sum);
        
    }
}
