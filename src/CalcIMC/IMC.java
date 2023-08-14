package CalcIMC;

import javax.swing.*;

public class IMC {
        public static void main (String[] args) {




            String pes = JOptionPane.showInputDialog(null, "Digite o peso");

            String alt = JOptionPane.showInputDialog(null, "Digite a altura");



            double peso = Double.parseDouble(pes);
            double altura = Double.parseDouble(alt);

            double imc = peso / (Math.pow(altura,2));

            if (imc <= 18.5){
                JOptionPane.showMessageDialog(null, "IMC = " + imc + "\nAbaixo do peso normal");
            }else if (imc <= 29.9) {
                JOptionPane.showMessageDialog(null, "IMC = " + imc + "\nPeso normal");
            }else if (imc <= 34.9) {
                JOptionPane.showMessageDialog(null, "IMC = " + imc + "\nObesidade classe I");
            }else if (imc <= 39.9) {
                JOptionPane.showMessageDialog(null, "IMC = " + imc + "\nObesidade classe II (severa)");
            }else {
                JOptionPane.showMessageDialog(null, "IMC = " + imc + "\nObesidade classe III (mórbida)");
            }
        }

    }
