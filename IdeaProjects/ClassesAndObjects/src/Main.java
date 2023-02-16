import sun.security.pkcs11.wrapper.PKCS11Constants;

public class Main {
    public static void main(String[] args) {
        TomJerry t1 = new TomJerry();
        t1.name = "tomm";
        t1.color = "blue";
        t1.weight=30;

        t1.introduceSelf();

        TomJerry j1 = new TomJerry();
        j1.name = "Jerrie";
        j1.color = "red";
        j1.weight = 45;

        j1.introduceSelf();

    }
}
