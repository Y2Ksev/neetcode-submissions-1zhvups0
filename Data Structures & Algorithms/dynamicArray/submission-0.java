class DynamicArray {

    int[] arr;
    int size = 0;

    public DynamicArray(int capacity) {
        if(capacity > 0)
        {
           arr = new int[capacity];
        }
    }

    public int get(int i) {
        return arr[i]; 
    }

    public void set(int i, int n) {
        arr[i] = n;
    }

    public void pushback(int n) {
        if(arr.length == size){
          resize();
          arr[size] = n;
          size++;
        }
        else{
            arr[size] = n;
            size++;
        }   
    }

    public int popback() {
        int lastVal = arr[size -1];
        size -= 1; 
        return lastVal;
    }

    private void resize() {
        int[] newArr = new int[size *2];
        for(int i = 0; i < size; i++){
            newArr[i] = arr[i];
        }
        arr = newArr;
    }

    public int getSize() {
        return size;
    }

    public int getCapacity() {
        return arr.length;
    }
}
