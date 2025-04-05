class Animal{
public void sound(){
System.out.println("Animal makes sound");
}
}

class Dog extends Animal{
public void bark(){
System.out.println("Dog barks");
}
}
public class SingleInheritance{
public static void main(String[] args){
Dog myobj=new Dog();
myobj.bark();

Animal obj=new Animal();
obj.sound();
}
}