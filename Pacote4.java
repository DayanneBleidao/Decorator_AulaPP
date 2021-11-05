public class Pacote4 extends AssinaturaDecorator {
  public Pacote4(IAssinatura assinatura) {
    super(assinatura);
  }

  @Override
  public void assinar() {
    super.assinar();
    System.out.println("Adicionado pacote 4 - R$49.99");
  }
}