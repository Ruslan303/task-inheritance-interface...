//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
       Carmethods a = new Bmw("BLACK", 320);
      Vehicle aa = new Bmw("BLACK", 320);
        Ferrari b = new Ferrari("red",410);
       Audi c = new Audi("white", 380);
        a.drive();
        a.pickUpSpeed();
        a.gasoline();
        aa.speed();
        aa.display();
        System.out.println("_______________________________________________");
        b.drive();
        b.pickUpSpeed();
        b.gasoline();
        b.speed();
        b.display();
        System.out.println("______________________________________________");
        c.drive();
        c.pickUpSpeed();
        c.gasoline();
        c.speed();
        c.display();











    }
}