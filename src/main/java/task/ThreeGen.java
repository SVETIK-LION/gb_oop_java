package task;


class A {}
class B extends A {}
class C extends A {}
class D {}

public class ThreeGen<T> {
    T obj;

    public ThreeGen(T obj) {
        this.obj = obj;
    }

}

class Gen1 {
    static void test(ThreeGen<? extends A> obj) {
        System.out.println("obj = " + obj);
    }
    public static void main(String[] args){
        A a = new A();
        B b = new B();
        C c = new C();
        D d = new D();

        ThreeGen<A> genA = new ThreeGen<>(a);
        ThreeGen<B> genB = new ThreeGen<>(b);
        ThreeGen<C> genC = new ThreeGen<>(c);
        ThreeGen<D> genD = new ThreeGen<>(d);
        test(genA);
        test(genB);
        test(genC);
//        test(genD);
    }
}
