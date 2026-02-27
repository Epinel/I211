public class RecursiveSelectionSort {
    public static void sort(double[] list){
        sort(list,0,list.length-1);
    }

    private static void sort(double[] list, int low, int high){
        if(low<high){
            int indexofMin = low;
            double min = list[low];
            for (int i=low+1;i<=high;i++){
                if (list[i]<min){
                    min = list[i];
                    indexofMin=i;
                }
            }

            list[indexofMin]=list[low];
            list[low]=min;

            sort(list, low+1, high);
        }
    }

    public static void main(String[] args){
        double[] list = {2,1,3,1,2,5,2,-1,0};
        sort(list);

        for (int i =0; i<list.length;i++)
        System.out.println(list[i]+" ");
    }
}
