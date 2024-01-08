public class index {
    public static void main(String[] args) {
        int j = 7;
        for(int i = 1; i < 10; i++){
            if(i%2 !=0){
                System.out.println("I=" +i +" J=" +j);
                j --;
                System.out.println("I=" +i +" J=" +j);
                j --;
                System.out.println("I=" +i +" J=" +j);
                j = j+ 4;

            }
        }
    }
}
