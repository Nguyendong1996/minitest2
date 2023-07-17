package MiniTestWeek2;


import java.util.Scanner;

public class MainBook {


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        MethodBook methodBook = new MethodBook();
        int input;
        do {
            System.out.println("1. Enter a five Book ProgrammingBook:");
            System.out.println("2 . Enter  a five Book FictionBook :");
            System.out.println("3 . Enter a Total Money five ProgrammingBook and five FictionBook :");
            System.out.println("4. Count Book category a VienTuong1");
            System.out.println("5. Count Book price < 90000 ");
            System.out.println("Enter a Menu :");
            input = Integer.parseInt(scanner.nextLine());
            if (input<0||input>6){
                System.out.println("Please re-enter");
            }else {
                switch (input){
                    case 1:
                       methodBook.addBookProgramming();
                       break;
                    case 2:
                        methodBook.addBookFictionBook();
                        break;
                    case 3:
                        methodBook.totalMoneyTenBook();
                        break;
                    case 4:
                        methodBook.countBookCategory();
                        break;
                    case 5:
                        methodBook.countBookSmall9000();
                           break;
                }
            }
        }while (true);

    }
}
