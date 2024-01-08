public class App {
    public static void main(String[] args) throws Exception {
    int j = 60;
    int a = 0;
    for(int i = 1; j !=0 ; i++){
        if(i == 1){
            a = i +3;
            System.out.println("I=" +i +" J=" +j );
        }else if(i == a){
            a = i+3;
            j = j -5;
            System.out.println("I=" +i +" J=" +j );
        }
    }
    }
}
