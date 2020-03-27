package javatutorial;

public class ClassesAndObjects {
public static void main(String[] args) {
	Person ashee = new Person("Ashee");
	ashee.setAge(19);
	Person nishee = new Person("Nishee");
    nishee.setAge(13);
    ashee.sayHelloTo(nishee);
    nishee.sayHelloTo(ashee);
    System.out.println(ashee.getName() + " is " + ashee.getAge() + " years old.");
    System.out.println(nishee.getName() + " is " + nishee.getAge() + " years old.");

}

}
