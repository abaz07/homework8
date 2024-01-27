public class Main {
    public static void main(String[] args) {
        //Задача 1
        System.out.println("Задача 1");
        int [] weight = new int [3];
        weight[0] = 1;
        weight[1] = 2;
        weight[2] = 3;
        System.out.println(weight[0]);
        System.out.println(weight[1]);
        System.out.println(weight[2]);
        System.out.println("Задача 1.1");
        double [] weight1 = {1.57, 7.654, 9.986};
        System.out.println(weight1[0]);
        System.out.println(weight1[1]);
        System.out.println(weight1[2]);
        System.out.println("Задача 1.2");
        int [] weight2 = new int [2];
        weight2[0] = 100;
        weight2[1] = 200;
        System.out.println(weight2[0]);
        System.out.println(weight2[1]);
        double [] weight3 = {7.77, 8.08, 8.88, 9.99};
        System.out.println(weight3[0]);
        System.out.println(weight3[1]);
        System.out.println(weight3[2]);
        System.out.println(weight3[3]);
        //Задача 2
        System.out.println("Задача 2");
        int [] setOfNumbers = {1, 2, 77, 88};
        for(int i = 0; i < setOfNumbers.length; i++){
            System.out.print(setOfNumbers[i]);
            if(i != setOfNumbers.length -1){
                System.out.print(", ");
            }
        }
        System.out.println();
        int [] setOfNumbers1 = {0, 7, 990, 8808};
        for(int i = 0; i < setOfNumbers1.length; i++){
            System.out.print(setOfNumbers1[i]);
            if(i != setOfNumbers1.length -1){
                System.out.print(", ");
            }
        }
        System.out.println();
        int [] setOfNumbers3 = {58, -2, 707};
        for(int i = 0; i < setOfNumbers3.length; i++){
            System.out.print(setOfNumbers3[i]);
            if(i != setOfNumbers3.length -1){
                System.out.print(", ");
            }
        }
        System.out.println();
        //Задача 3
        System.out.println("Задача 3");
        int [] setOfNumbers4 = {1, 2, 77, 88};
        for(int i = setOfNumbers4.length - 1; i >=0; i--){
            System.out.print(setOfNumbers4[i]);
            if(i != 0){
                System.out.print(", ");
            }
        }
        System.out.println();
        int [] setOfNumbers5 = {0, 7, 990, 8808};
        for(int i = setOfNumbers5.length - 1; i >=0; i--){
            System.out.print(setOfNumbers5[i]);
            if(i != 0){
                System.out.print(", ");
            }
        }
        System.out.println();
        int [] setOfNumbers6 = {58, -2, 707};
        for(int i = setOfNumbers6.length - 1; i >=0; i--){
            System.out.print(setOfNumbers6[i]);
            if(i != 0){
                System.out.print(", ");
            }
        }
        System.out.println();
        //Задача 4
        System.out.println("Задача 4");
        for(int i = 0; i < weight.length; i++){
            if(weight[i] %2 != 0){
                weight[i] = weight[i] + 1;
            }
            System.out.print(weight[i]);
            if(i != weight.length -1){
                System.out.print(", ");
            }
        }
    }
}