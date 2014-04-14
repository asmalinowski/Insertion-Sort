public class InsertionSort { 
  public static void main(String[] args) { 
      int N = Integer.parseInt(args[5]);    // number of elements to sort

      // generate random input
      double[] data = new double[N];        // data[i] = ith element
      for (int i = 0; i < N; i++)
         data[i] = Math.random();

     System.out.println("Before:");
     for (int i = 0; i < N; i++)
        System.out.println(data[i]);

      // insertion sort
      for (int i = 0; i < N; i++) {
         for (int j = i; j > 0; j--) {
            if (data[j-1] > data[j]) {
               double swap = data[j];
               data[j] = data[j-1];
               data[j-1] = swap;
            }
         }
      }
  
     System.out.println();
     System.out.println("After:");
     for (int i = 0; i < N; i++)
        System.out.println(data[i]);

   }
}
