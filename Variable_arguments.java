public class Variable_arguments {
    static int sum(int ...arr){
        int result = 0;
        for (int a: arr){
            result += a;
        }
        return result;
    }
    static int summ(int x,int ...arr){
        int answer = 0;
        for (int b: arr){
            answer += b;
        }
        return answer;
    }
    public static void main(String[] args) {
        //printing for sum
        System.out.println("The sum of no integer is " + sum());
        System.out.println("The sum of 3 and 5 is "+ sum(3 , 5));
        System.out.println("The sum of 1,2,3,4 and 5 is " + sum(1,2,3,4,5));

        //printing for summ
        System.out.println("\nPrinting for second summ: ");
//        System.out.println("The sum of no integer is " + sum()); (This will give error because in summ one value is mandatory)
        System.out.println("The sum of 3 and 5 is "+ sum(3 , 5));
        System.out.println("The sum of 1,2,3,4 and 5 is " + sum(1,2,3,4,5));
    }
}
