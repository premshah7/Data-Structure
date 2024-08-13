
class SingleQ{
    int r,f,n;
    int[] q;
    SingleQ(int n){
        this.n = n;
        this.r = -1;
        this.f=-1;
        q = new int[n];
    }
    
    
    public void enqueue(int x){
        if(r>=n){
            System.out.println("Queue if full");
        }
        r++;
        q[r] = x;
        if(f == -1){
            f=0;
            return;
        }
    }

    public void dequeue(int x){
        if(f==0){
            System.out.println("Queue is empty");
            return;
        }
        q[f]=x;
        if(f == r){
            f = r = -1;
        }else{
            f++;
        }
    }
    
    public void display(){
        System.out.print("Queue is : ");
        for(int i=f;i<=r;i++){
            System.out.print(q[i]+" ");
        }   
    }
}

public class SinglyQueue {
    public static void main(String[] args) {
        SingleQ sq = new SingleQ(5);
        sq.enqueue(10);
        sq.enqueue(20);
        sq.enqueue(30);
        sq.dequeue(10);
        sq.display();
    }    
}
