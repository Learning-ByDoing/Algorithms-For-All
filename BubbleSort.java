class BubbleSort
{
    void bubbleSort(int arr[])
    {
            boolean swapped = true;
            int i = 0;
            int tmp;
            while (swapped) {
                  swapped = false;
                  i++;
                  for (int j = 0; j < arr.length - i; j++) {                                       
                        if (arr[j] > arr[j + 1]) {                          
                              tmp = arr[j];
                              arr[j] = arr[j + 1];
                              arr[j + 1] = tmp;
                              swapped = true;
                        }
                  }                
            }
      
    }
 
    /* Prints the array */
    void printArray(int arr[])
    {
        int n = arr.length;
        for (int i=0; i<n; ++i)
            System.out.print(arr[i] + " ");
        System.out.println();
    }
 
    // Driver method to test above
    public static void main(String args[])
    {
        BubbleSort ob = new BubbleSort();
        int arr[] = {64, 25, 12, 22, 11};
        ob.bubbleSort(arr);
        System.out.println("Sorted array");
        ob.printArray(arr);
    }
}
