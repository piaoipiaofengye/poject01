package cn.itcast.demo;

public class LambdaTest {


    public static void main(String[] args) {
        Thread thread=new Thread(()-> System.out.println("hello"));
        thread.start();

    }
}
