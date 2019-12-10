package inheritance;

import java.util.Scanner;

public class Hierarchy1 {

public static void main(String[] args) {
// TODO Auto-generated method stub
Scanner s = new Scanner(System.in);
int A;
System.out.println("Enter the Number of persons");
int p = s.nextInt();
System.out.println("Enter the Number of Days");
int dy = s.nextInt();
System.out.println("Enter the Tariff for single person");
double tf = s.nextInt();
System.out.println("Enter the Room Type");
String type = s.next();
if (type.equals("ac")) {
A = 250;
} else {
A = 150;

}

Lean ob = new Lean();
Peak ob1 = new Peak();
double cd = ob.Booker(p, dy, tf, A);

System.out.println("Month ");
int m = s.nextInt();

switch (m) {
case 4:
case 5:
case 6:
case 9:
case 11:
case 12:
ob1.peak(cd);
break;

case 1:
case 2:
case 3:
case 7:
case 8:
case 10:
ob.lean(cd);
break;

}
}

}

class Bookk {
double tot;

double Booker(int p, int dy, double tf, int A) {
tot = (p * dy * tf) + A;

return tot;
}
}

class Peak extends Bookk

{
Scanner s = new Scanner(System.in);
double tot1;

void peak(double cd) {

System.out.println("Enter the peak charge");
int dcc = s.nextInt();
double tot223 = (cd * dcc) / 100;
tot1 = cd + tot223;
System.out.println("Total Tarif  :" + tot1);

}
}

class Lean extends Bookk {
double tot2;
Scanner s = new Scanner(System.in);

void lean(double cd) {
System.out.println("Enter the  discount");
int dc = s.nextInt();
double tot22 = (cd * dc) / 100;
tot2 = cd - tot22;
System.out.println("Total Tariff  :" + tot2);
}
}