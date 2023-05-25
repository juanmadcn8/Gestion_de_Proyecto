/**
 *
 * @author Usuario
 */
package calculadora;

public class Calculadora {

  private int op1;
  private int op2;

  public Calculadora(int op1, int op2) {
    this.op1 = op1;
    this.op2 = op2;
  }

  public int getOp1() {
    return op1;
  }

  public void setOp1(int op1) {
    this.op1 = op1;
  }

  public int getOp2() {
    return op2;
  }

  public void setOp2(int op2) {
    this.op2 = op2;
  }

  public void suma() {
    System.out.println("El resultado de la suma es: " + (this.op1 + this.op2));
  }

  public void resta() {
    System.out.println("El resultado de la resta es: " + (this.op1 - this.op2));
  }

}
