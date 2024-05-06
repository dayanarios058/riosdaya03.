public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");



        public class insertionSort {
            public static void main(String[] args){
                int[]arr ={ 15, 19, 10, 5, 6};

                System.out.println('Array antes de ordenar');
                prinArray(Arr);

                intertionSort(arr);

                System.out.println('Array despues del ordenador');
                printArray(Arr);

            }
        }
        public static void insertionSort(int[]arr){
            for(int i<n;++i){
                int n =arr.length;
                int key =arr[i];
                int j = i - 1;

                //mover los elementos del arreglo que son mayores que key
                //a una posicion adelante de su pocicion actual
                while(j>=0 && arr[j]> key){
                    j=j-1;

                }
                arr[j+1]=key
            }
        }
        public static void prinArray(int[]arr){
            for(int i=0;i< arr.length;++i){
                System.out.println(arr[i]+'');
            }
            System.out.println();
        }
    }
}
