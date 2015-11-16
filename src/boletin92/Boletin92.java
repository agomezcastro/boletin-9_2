

package boletin92;

import javax.swing.JOptionPane;

/**
 *
 * @author agomezcastro
 */
public class Boletin92 {

    
    public static void main(String[] args) {
        int sum=0, i=10;
        double producto=1;
        while (i>=10 & i<=90){
            sum= sum+i;
            producto= producto*i;
            i++;
            
    }
        JOptionPane.showMessageDialog(null, "la suma es: "+ sum);
        JOptionPane.showMessageDialog(null, "el producto es: "+ producto);
    }
}
