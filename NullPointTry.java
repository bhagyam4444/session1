package Tasks;


import java.util.*;


public class NullPointTry {


public static void main(String[] args) {
String input = null;

try
{
if(input.equals("value"))
System.out.println("Same value");
else
System.out.print (" Not Same value");
}

catch(NullPointerException e)
{
System.out.print("NullPoinerException caught");

}


}


}