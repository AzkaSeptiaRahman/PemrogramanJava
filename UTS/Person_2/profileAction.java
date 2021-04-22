/* Nama : Azka Septia Rahman
   NIM  : 11200930000013
   Waktu Penyelesaian : 22/04/2021
   Tool : IntelliJ IDEA
*/
package UTS.Person_2;

public class profileAction {
    public static void main(String[] args) {
        profile person = new profile();
        person.Name = "John Smith";
        person.Age  = 24;
        person.printperson1();

        System.out.println("");

        person.Name = "Mary Sharp";
        person.Age = 52;
        person.printperson2();
    }
}
