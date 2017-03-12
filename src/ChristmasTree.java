

public class ChristmasTree {

	   
           
            
        public void printTree(int n, char c) {
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n - i; j++){
                    System.out.print(" ");}
                for (int k = 0; k < (2 * i + 1); k++){
                System.out.print(c);}
            System.out.println();
     }
            for (int l = 0; l < n; l++){
                System.out.print(" ");}
            System.out.println("I");
}


    public static void main(String[] args) {
            int n = 5;
            char c = 'X';
            ChristmasTree tree = new ChristmasTree();
            tree.printTree(n, c);
        } 
}