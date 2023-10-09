import java.util.Scanner;
class GnAtI{

    public static void main(String[] args){
    Scanner input = new Scanner(System.in);

    System.out.println("Number 1: ");
    int num1 = input.nextInt();

    System.out.println("Number 2: ");
    int num2 = input.nextInt();

    System.out.println("Number 3: ");
    int num3 = input.nextInt();

    if (num1>num2)
     if (num1 > num3)
    System.out.println("number "+num1+" is Greater");
    
    if (num2>num1)
     if (num2>num3)
    System.out.println("number "+num2+" is Greater");
    
    if (num3>num1)
     if (num3>num2)
    System.out.println("number "+num3+" is Greater");

}

}
