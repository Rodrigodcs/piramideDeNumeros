public class App {
    public static void main(String[] args) throws Exception {
        int number = 6;

        for(int i = 0; i<number;i++){
            for(int j = 0; j<i;j++){
                System.out.print(i);
            }
            System.out.println();
        }
    }
}
