public class copyList<E> {
    public Object[] intArr; 
    int size;
    int DEFAULT_CAPACITY=10;

    public copyList (E[] arr1){
        if(arr1==null){
            this.intArr=new Object[DEFAULT_CAPACITY];          
        }
        if(arr1!=null){
            this.intArr=new Object [arr1.length];
            this.intArr=arr1;
            size=arr1.length;
        }
        
    }

    public int returnSize(){
        return this.size;

    }
}
