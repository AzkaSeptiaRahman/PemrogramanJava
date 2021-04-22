/* Nama : Azka Septia Rahman
   NIM  : 11200930000013
   Waktu Penyelesaian : 22/04/2021
   Tool : IntelliJ IDEA
*/
package UTS.KonversiSuhu_6;

public class KelvinToReamur {
    double kelvin;
    double reamur;

    private void Kelvin() {
        kelvin = Double.parseDouble(InputField.getText());
        reamur = (kelvin - 273.15) * 0.8;
        resKelvin.setText("Kelvin  : " + kelvin);
        resReamur.setText("Reamur  : " + reamur);
    }
    private void Reamur(){
        reamur = Double.parseDouble(InputField.getText());
        kelvin = (reamur / 0.8) + 273.15;
        resKelvin.setText("Kelvin  : " + kelvin);
        resReamur.setText("Reamur  : " + reamur);
    }
    private void btnConvertActionPerformed(java.awt.event.ActionEvent evt) {
        if (chKelvin.isSelected()) {
            Kelvin();
        } else if (chReamur.isSelected()) {
            Reamur();
        }
    }

}
