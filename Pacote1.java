public class Pacote1 extends AssinaturaDecorator {
  public Pacote1(IAssinatura assinatura) {
    super(assinatura);
  }

  @Override
  public void assinar() {
    super.assinar();
    System.out.println("Adicionado pacote 1 - R$19.99");
  }
}