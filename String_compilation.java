public class String_compilation {
    public static void main(String[] args) {
        
        String a="tejashree";
        System.out.println("original string "+a);

        System.out.println(a.length());
        System.out.println(a.toUpperCase());
        System.out.println(a.toLowerCase());
        System.out.println(a.trim());
        System.out.println("strip");
        System.out.println(a.strip());
        System.out.println(a.indexOf("a"));
        System.out.println(a.lastIndexOf("e"));
        System.out.println("tejashree".equals(a));
        System.out.println("Tejashree".equalsIgnoreCase(a));
        System.out.println(a.replace("a","x"));
        System.out.println(a.concat("p"));
        System.out.println(a.endsWith("shree"));
        System.out.println(a.startsWith("teja"));
        System.out.println(String.join("*",a));
        System.out.println(a.contains("teja"));
        System.out.println(a.substring(2,4));
        System.out.println(a.substring(1));




    }
    
}
