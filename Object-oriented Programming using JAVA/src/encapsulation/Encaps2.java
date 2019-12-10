package encapsulation;
import java.util.Scanner;
public class Encaps2 {

		public static void main(String[] args) {
			// TODO Auto-generated method stub
			Scanner s=new Scanner(System.in);
			        Casestudy51 cc=new Casestudy51();
			        int i=1,a;double total=0,ss=0;
			System.out.println("enter price of ticket");
			cc.setPrice(s.nextInt());
			System.out.println("enter no of person");
			cc.setP(s.nextInt());
			a=cc.getP();
			do {
			System.out.printf("ENTER DETAILS OF P%d\n",i);i++;
			System.out.println("enter name");
			cc.setName(s.next());
			System.out.println("enter gender(F/M)");
			cc.setG(s.next());
			System.out.println("enter age");
			cc.setAge(s.nextInt());
			cc.addmember(cc.getName(),cc.getAge(),cc.getG(),cc.getP());
			total=cc.totalprice(cc.getAge(),cc.getG(),cc.getPrice(),cc.getP(),ss);
			ss=total;

			if(a==1)
			{
			cc.ticket5(cc.getPrice(),cc.getP(),ss);
			cc.display(cc.getP());
			}
			a--;
			}while(a>0);
			 }

			}
			class Casestudy51 {
			int price;
			int p;int i=0,j=1;
			String name;
			String g;
			int age;
			String per[]=new String[25];
			String ge[]=new String[25];
			int ag[]=new int[25];

			double total=0,sum=0;
			public int getPrice() {
			return price;
			}
			public void setPrice(int price) {
			this.price = price;
			}
			public int getP() {
			return p;
			}
			public void setP(int p) {
			this.p = p;
			}
			public String getName() {
			return name;
			}
			public void setName(String name) {
			this.name = name;
			}
			public String getG() {
			return g;
			}
			public void setG(String g) {
			this.g = g;
			}
			public int getAge() {
			return age;
			}
			public void setAge(int age) {
			this.age = age;
			}
			void addmember(String name,int age,String g,int p)
			{

			per[i]=name;
			ag[i]=age;
			ge[i]=g;
			i++;
			}
			void display(int p) {
			int k=1;
			for(i=0;i<p;i++)
			{
			System.out.printf("%d)%s(%s %d)\n",k,per[i],ge[i],ag[i]);
			k++;
			}
			}



			double totalprice(int age,String g,int price,int p,double total)
			{

			if(j<=p)
			{
			if(age<16)
			{
			sum=total+(price-50);
			j++;
			return sum;
			}
			else if(g.equals("F")&&age>=16)
			{
			sum=total+(price-10);
			j++;
			return sum;
			}
			else if(age>64)
			{
			sum=total+(price-25);
			j++;
			return sum;
			}
			else
			{
			sum=price+total;
			j++;
			return sum;
			}
			}
			else {
			j++;
			return sum;

			}}
			public void ticket5(int price, int p,double total) {
			System.out.printf("TICKET DETAILS ARE....\n");
			System.out.printf("NO: OF PASSENGERS:%d\n",p);
			System.out.printf("PRICE OF TICKET:%d\n",price);
			System.out.printf("TOTAL:%.1f\n",total);

			}


	}

