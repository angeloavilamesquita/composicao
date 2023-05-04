package composicao;

public class Casa {
    private Parede paredeQuarto;
    private Parede paredeBanheiro;
    private Parede paredeCozinha;
    private Telhado telhadoInterno;
    private Telhado telhadoExterno;

    public Casa() {
        this.paredeQuarto = new Parede();
        this.paredeBanheiro = new Parede();
        this.paredeCozinha = new Parede();
        this.telhadoInterno = new Telhado();
        this.telhadoExterno = new Telhado();
    }

    public Parede getParedeQuarto() {
        return paredeQuarto;
    }

    public Parede getParedeBanheiro() {
        return paredeBanheiro;
    }

    public Parede getParedeCozinha() {
        return paredeCozinha;
    }

    public Telhado getTelhadoInterno() {
        return telhadoInterno;
    }

    public Telhado getTelhadoExterno() {
        return telhadoExterno;
    }
}
