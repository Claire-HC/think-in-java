package chapter7;

public class TestOverride extends TestOverload {
	 //another overload
    public void overloadedMethod(char c){
        System.out.println("overloadedMethod(): char");
    }

    @Override
    public void overloadedMethod(String s){
        System.out.println("overloadedMethod(): String is overrided");
    }

    /**
     *  MAIN
     *  @param args void
     */
    public static void main(String[] args){
        TestOverride myOverride=new TestOverride();

        myOverride.overloadedMethod();
        myOverride.overloadedMethod(1);
        myOverride.overloadedMethod("Hello");
        myOverride.overloadedMethod((char)1);
    }

}
