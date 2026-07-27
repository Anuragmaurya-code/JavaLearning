package CoreJava.MethodReferenceLearning;

public class MethodReferenceMain {
    public static void main(String[] args) {
//        Calculator c1= (int i,int j)-> MathematicCalculator.add(i,j);
//        System.out.println(c1.calculate(10,29));
//
//        // static method reference
//        Calculator c2= MathematicCalculator::add;
//        System.out.println(c2.calculate(20,20));

        //------------------------------------------------------------------------
//        MathematicCalculator obj=new MathematicCalculator();
//        Calculator c3=(int i,int j)->{
//            return obj.multiply(i,j);
//        };
//        System.out.println(c3.calculate(2,4));
//
//        // instance method reference using particular obj
//        Calculator c4=obj::multiply;
//        System.out.println(c4.calculate(3,6));

        //--------------------------------------------------------------
//        Validator v=(String s)->{
//            return s.length();
//        };
//        System.out.println(v.validate("Anurag"));
//        // method reference using arbitary object
//        Validator v2=String::length;
//        System.out.println(v2.validate("Anurag"));

        //---------------------------------------------------------------------------------
        Creator<User> c1=(String s)->{
            return  new User(s);
        };
        User u1=c1.create("Anurag");
        System.out.println(u1.name);

        //Constructor method reference
        Creator<User> c2=User::new;
        User u2=c2.create("Shivam");
        System.out.println(u2.name);


    }
}
