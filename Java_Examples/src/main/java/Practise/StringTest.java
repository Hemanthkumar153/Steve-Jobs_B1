package Practise;

public class StringTest {
public static void main(String[] text) {
 String str = ("I LOVE YOU FORVER AND EVER AND EVER AND EVER");
 String str1 = str.toLowerCase();
 String str2 = str1.toUpperCase();
 String str3 = str2.replace('E', 'e');
 String[] strSplit = str.split("E");
 
 System.out.println(str3);
 System.out.println(strSplit[0]);
 System.out.println(strSplit[1]);
 System.out.println(strSplit[2]);
 System.out.println(strSplit[3]);
 System.out.println(strSplit[4]);
 System.out.println(strSplit[5]);
 System.out.println(str);
 System.out.println(str1);
 System.out.println(str2);
 System.out.println(str.concat(str2));
 

}
}
