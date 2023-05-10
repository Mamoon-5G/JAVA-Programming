import java.io.*;
class trim {
public static void main(String args[])
throws IOException
{
BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
String str;
System.out.println("Enter 'stop' to quit.");
System.out.println("Enter Country: ");
do {
str= br.readLine();
str= str.trim();
if(str.equals("India"))
System.out.println("Capital is Delhi.");
else if(str.equals("Pakistan"))
System.out.println("Capital is Lahor.");
else if(str.equals("California"))
System.out.println("Capital is Sacramento.");
else if(str.equals("Washington"))
System.out.println("Capital is Olympia.");
} while (!str.equals("stop"));
}
}
