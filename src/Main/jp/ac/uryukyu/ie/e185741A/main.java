package jp.ac.uryukyu.ie.e185741A;

public class main {
    public static void main(String[] args) {
        System.out.println("開始します");
        try{
            String[] str = null;
            System.out.println(str);
        }
        catch(NullPointerException e){
            System.out.println("配列の範囲を超えています");
        }
        System.out.println("終わりました");
        }
}
