package MiniTestWeek2;

import java.util.Scanner;

public class MethodBook {
    ProgrammingBook[] programmingBooks ;
    FictionBook[] fictionBooks;
    Scanner scanner;
    public MethodBook() {
        scanner = new Scanner(System.in);
        programmingBooks = new ProgrammingBook[0];
        fictionBooks = new FictionBook[0];
    }
//    public void addBockProgrammingBook(){
//        ProgrammingBook[] programmingBook =new ProgrammingBook[programmingBooks.length+5];
//        for (int i = 0; i < 5; i++) {
//            System.out.println("Enter a BookCode : ");
//            int bookCode = Integer.parseInt(scanner.nextLine());
//            System.out.println("Enter name: ");
//            String name = scanner.nextLine();
//            System.out.println("Enter price: ");
//            double price = Double.parseDouble(scanner.nextLine());
//            System.out.println("Enter author : ");
//            String author = scanner.nextLine();
//            System.out.println("Enter language: ");
//            String language = scanner.nextLine();
//            System.out.println("Enter framework :");
//            String framework = scanner.nextLine();
//            programmingBook[i] =new ProgrammingBook(bookCode, name, price, author, language, framework);
//            programmingBooks =programmingBook;
//        }
//        System.out.println("List programmingBooks is : ");
//        for (int i = 0; i < programmingBooks.length; i++) {
//            System.out.println(programmingBooks[i]);
//        }
Book programmingBooks1 = new ProgrammingBook(100,"Code Complete",120000,"Steve McConnell","English","Lap trinh");
Book programmingBooks2 = new ProgrammingBook(101,"The Clean Coder",220000,"Robert C. Martin","English","Lap trinh");
Book programmingBooks3 = new ProgrammingBook(102,"The Pragmatic Programmer",250000,"Andrew Hunt","English","Lap trinh");
Book programmingBooks4 = new ProgrammingBook(103,"The Mythical Man-month",320000,"Frederick Brooks","English","Lap trinh");
Book programmingBooks5 = new ProgrammingBook(104,"Peopleware",100000,"Tom DeMarco ","English","Lap trinh");
Book[] books1 ={programmingBooks1, programmingBooks2, programmingBooks3, programmingBooks4, programmingBooks5};
FictionBook fictionBook1 = new FictionBook(10,"Những Vị Thần Nước Mỹ",300000,"Greed","Viet Nam","vien tuong ","VienTuong1");
FictionBook fictionBook2 = new FictionBook(10,"Những Vị Thần Nước Pháp",250000,"red","Viet Nam","vien tuong ","VienTuong2");
FictionBook fictionBook3 = new FictionBook(10,"Những Vị Thần Nước Việt Nam",100000,"while","Viet Nam","vien tuong ","vienTuong3");
FictionBook fictionBook4 = new FictionBook(10,"Những Vị Thần Nước Trung Quốc",350000,"method","Viet Nam","vien tuong ","vienTuong4");
FictionBook fictionBook5 = new FictionBook(10,"Những Vị Thần Nước Ấn Độ ",400000,"property","Viet Nam","vien tuong ","vienTuong5");
FictionBook[] books2 ={fictionBook1,fictionBook2,fictionBook3,fictionBook4,fictionBook5};
Book[] books ={programmingBooks1,programmingBooks2,programmingBooks3,programmingBooks4,programmingBooks5,fictionBook1,fictionBook2,fictionBook3,fictionBook4,fictionBook5};
//    }
public void addBookProgramming(){
    for (Book book : books1) {
        System.out.println(book);
    }
}
    public void addBookFictionBook(){
        for (Book book : books2){
            System.out.println(book);
        }
    }
    public void totalMoneyTenBook(){
    int sum2 = 0;
    int sum1=0;
        for (Book book : books1) {
            sum2 += book.getPrice();
        }
        for (Book book : books2) {
            sum1 += book.getPrice();
        }
        int sum = sum1 + sum2;
        System.out.println(sum);
    }
    public void countBookCategory() {
    int count =0 ;
        for (int i = 0; i < books2.length; i++) {

    if(books2[i].getCategory() =="VienTuong1"){
        count++;
    }
}
        System.out.println("số lượng quyển sách có Loại là VienTuong1 : " + count);

    }
        public void countBookSmall9000 () {
    int count = 0 ;
            for (Book book : books) {
                if (book.getPrice() <= 90000) {
                    count++;
                }
            }
            System.out.println("So luong Quyen sach co gia nho hon 90.000 d : "+count);
        }
    }
    