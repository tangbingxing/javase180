package day8.interfaceTest;

//接口可以多重实现,不同的接口间用,隔开  当同时有继承时，继承写在实现前面

public class BBB extends AAA implements AAAA,BBBB{
    @Override
    public void test() {

    }

    @Override
    public int say(int a, int b) {
        return 0;
    }
}
