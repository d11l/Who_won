package Who_won;
import java.util.Scanner;
public class Who_won {
public static void main(String[] args) {
Scanner in = new Scanner(System.in); 

System.out.print("Player1 Name: ");
String player1=in.next();
System.out.print("Player2 Name: ");
String player2=in.next();
System.out.print("Player3 Name: ");
String player3=in.next();
System.out.print("The number of times: ");
int T=in.nextInt();

int p1=0,p2=0,p3=0;
for(int i=0;i<T;i++){
System.out.println("Points: "+player1+" Times: "+(i+1));
p1+=in.nextInt();
System.out.println("Points: "+player2+" Times: "+(i+1));
p2+=in.nextInt();
System.out.println("Points: "+player3+" Times: "+(i+1));
p3+=in.nextInt();}

String winner="";
if(p1>p2&&p1>p3)
winner=player1;
else if(p2>p1&&p1>p3)
winner=player2;
else if(p1==p2&&p1>p3&&p2>p3)
winner=player1+" tied with "+player2; 
else if(p2==p3&&p1<p2&&p1<p3)  
winner=player2+"tied with"+player3; 
else if(p1==p3&&p1>p2&&p2<p3)
winner=player1+"tied with"+player3;   
else if(p1==p2&&p1==p3&&p2==p3)   
winner="Equal";
else
winner=player3;
 
System.out.println("winner: "+winner);
System.out.println(player1+" | number of points: "+p1);
System.out.println(player2+" | number of points: "+p2);
System.out.println(player3+" | number of points: "+p3);
}}
    

