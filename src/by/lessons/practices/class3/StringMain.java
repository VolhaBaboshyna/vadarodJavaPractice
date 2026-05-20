package by.lessons.practices.class3;

public class StringMain {
    public static void main(String[] args) {
        StringClass str=new StringClass();
        System.out.println(str.newString("I love Java!!!"));

        String str2="Строка для задания 2";
        int index=str2.length()-1;
        System.out.println(str2.charAt(index));

        System.out.println(str2.endsWith("Java!!!"));

        System.out.println(str2.startsWith("Добро пож"));

        String str3="I love Java!!!";
        System.out.println(str3.substring(7,11));
        System.out.println(str3.contains("Java"));
        System.out.println(str3.indexOf("Java"));




    }
}
