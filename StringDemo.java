public class StringDemo
{
    public static void main (String args[])
    {
        String name="likhitha";
        String sname=new String("sps");
        System.out.println(name+""+sname);
        System.out.println(name.charAt(1));
        String s1="Likhitha";
        String s2="Likhitha";
        System.out.println(s1==s2);
        /*string variable remains constant. value does not change even after concatinating.it stores the
         concatinated value in different address.it does not change orginal initial value.
        This is stored in String constnat pool inside heapmemory.
        whenever we declare the string variable with a value,it searches in sring constant pool whether same value is present or not.
        if it finds the value ,then it assigns same address to the new varible also.it helps us in saving memory.
        once we created string object ,we can not change the value.If we dont want created variable,we use
         garbage collector concept to freeup memory space.
        strings are immutable objects.
        if we want to use string as mutuable,we use string buffer and stringbuilder concepts.*/
        StringBuffer sb = new StringBuffer("hi");
        //although we give empty,string buffer intially assigns some capacity.
        System.out.println(sb.capacity());
        System.out.println(sb.length());
    
    sb.append("kolasani");
    System.out.println(sb);
    sb.deleteCharAt(0);
    System.out.println(sb);
//we have ensure capacity,setlength methods

    }
}
