public class Strings{
    public static void main(String[] args) {
        String nam = "Mahesh";
        nam = "helna";
        nam = nam+"has";//we cannot change but can add more value
        System.out.println(nam);
        String name = new String("husian");
        System.out.println(name);
        System.out.println(name.hashCode());
        System.out.println(name.charAt(0));
        System.out.println(name.concat(" Shaikh"));
        //Mutable(change) and Immutable(unchange)
        name = name + " Salam"; // we cannot change but can assign
        System.out.println(name);
        String s1 = "Husain";
        String s2 = "Husain";
        System.out.println(s1==s2);
        // StringBuffuer
        StringBuffer sb = new StringBuffer("haya");
        System.out.println(sb.capacity());
        System.out.println(sb.length());
        sb.append(" shaikh");
        System.out.println(sb);
        sb.delete(0, 3);
        System.out.println(sb);
        sb.deleteCharAt(6);
        System.out.println(sb);
        sb.insert(6, "k");
        System.out.println(sb);
        sb.substring(2, 2);
        System.out.println(sb);
        //convert StringBuffer to String use to.String()
        // String str = sb.toString();
        // System.out.println(str);
        // stringBuffer is thred safe and StringBuilder is not
        nam = "jannat";
        System.out.println(nam);
    }
}
