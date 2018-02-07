package org.noob2ee.padavan.level0;

public class StringPoolExample {

    public static void main(String[] args) {
        System.out.println("=======test1:");
        test1();
        System.out.println("=======test2:");
        test2();
        System.out.println("=======test3:");
        test3();
        System.out.println("=======test4:");
        test4();
        System.out.println("=======test5:");
        test5();
    }

    public static void test1() {
        String s = "abc4";
        String s1 = "abc4";
        System.out.println(s.equals(s1));//true
        System.out.println(s == s1);//true
    }

    public static void test2() {
//But in case if we explicitely call operator new java will create new instance of a string so that operator == returns false:
        String s = "abc4";
        String s1 = new String("abc4");
        System.out.println(s.equals(s1));//true
        System.out.println(s == s1);//false
    }

    public static void test3() {
//Also java is smart enoufg to evaluate two literals and avoid creation of new instance of string object:
        String s = "abc4";
        String s1 = "abc" + "4";
        System.out.println(s.equals(s1));//true
        System.out.println(s == s1);//true
    }

    public static void test4() {
// unless concatination requires runtime execution
        String s = "abc4";
        String s1 = "abc" + s.length() ;
        System.out.println(s.equals(s1));//true
        System.out.println(s==s1);//false
    }

    public static void test5() {
// intern forces java to lookup in stringpool
        String s = "abc4";
        String s1 = "abc" + s.length() ;
        System.out.println(s.equals(s1));//true
        System.out.println(s==s1.intern());//true
    }
}
