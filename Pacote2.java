public class Pacote2 extends AssinaturaDecorator {
  public Pacote2(IAssinatura assinatura) {
    super(assinatura);
  }

  @Override
  public void assinar() {
    super.assinar();
    System.out.println("Adicionado pacote 2 - R$9.99");
  }
}