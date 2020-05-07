
package SogutucuDenetleyicisiSistemi;

import java.util.Scanner;
/**
 *
 * @author lenovo
 */
public class TusTakimi implements ITusTakimi {
    public int veriAl()
    {
        Scanner input = new Scanner(System.in);
        return input.nextInt();
    }
}
