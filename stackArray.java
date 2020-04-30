public class stackArray{

    int max = 20;
    int arr[] = new int[max];
    int top = -1;

    public void insert(int num){
        if(top <= max-1){
            System.out.println("overflow");
            return;
        } else {
            top++;
            arr[top] = num;
        }
    }

    public void pop(){
        if(top <= -1){
            System.out.println("underflow");
            return;
        } else {
            System.out.println(arr[top]);
            top--; 
        }
    }

    public void show(){
        if(top == -1){
            System.out.println("Underflow");
            return;
        }
        for(int i=0; i<=top; i++){
            System.out.println(arr[i]);
        }
    }
}