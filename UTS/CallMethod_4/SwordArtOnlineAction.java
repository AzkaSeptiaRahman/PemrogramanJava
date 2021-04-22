/* Nama : Azka Septia Rahman
   NIM  : 11200930000013
   Waktu Penyelesaian : 22/04/2021
   Tool : IntelliJ IDEA
*/
package UTS.CallMethod_4;

public class SwordArtOnlineAction {
    public static void main(String[] args) {
        SwordArtOnline Status = new SwordArtOnline();

        System.out.println("Character 1");
        Status.Name = "Kirigaya Kazuto";
        Status.Weapons = "Excalibur";
        Status.Attack = 101;
        Status.Character();

        System.out.println("\nCharacter 2");
        Status.Name = "Yuuki Asuna";
        Status.Weapons = "Lambent Light";
        Status.Attack = 122;
        Status.Character();

        System.out.println("\nCharacter 3");
        Status.Name = "Asada Shino";
        Status.Weapons = "Sniper";
        Status.Attack = 100;
        Status.Character();
    }
}
