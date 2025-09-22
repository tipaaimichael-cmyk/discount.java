//program to calculate libraryfine
import java.util.Scanner;
import java.time.LocalDate;
import java.time.Duration;
public class Libraryfine {
public static void main(String[] args) {
Scanner  scanner = new Scanner(System.in);
System.out.println("enter bookID");
String bookID = scanner.nextline();
System.out.println("enter duedate:");
localdate duedate= LocalDate.parse(scanner.nextline());
System.out.println("enter returndate:");
String returndatestring = scanner.nextline();
//calculate daysoverdue://
Duration duration = duration.between(duedate,returndate);
long daysOverdue = duration.toDays();
if(daysoverdue < 0){
Double finerate = 0.0;
}
else if(daysoverdue <= 7){
 finerate = 20.0;
}
else if(daysOverdue <= 14){
finerate = 50.0;
}
else{
	finerate = 100.0;
}
Double fineamount = daysOverdue*finerate;
System.out.println("libraryfine details:");
System.out.println("bookID:"+bookID);
System.out.println("duedate:"+duedate);
System.out.println("returndate:"+returndate);
System.out.println("days Overdue :" +daysOverdue);
System.out.println("finerate perday:+finerate");
System.out.println("fine amount :" +fineamount);
scanner.nextline();
  }
}



