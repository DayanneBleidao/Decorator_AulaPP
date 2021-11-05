public class Pacote3 extends AssinaturaDecorator {
  public Pacote3(IAssinatura assinatura) {
    super(assinatura);
  }

  @Override
  public void assinar() {
    super.assinar();
    System.out.println("Adicionado pacote 3 - R$29.99");
  }
}