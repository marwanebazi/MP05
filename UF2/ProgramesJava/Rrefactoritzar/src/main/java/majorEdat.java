public class majorEdat {
    public static void main(String[] args) {
        persona e1 = new persona(11, "Manuel Alfonseca");
        persona e2 = new persona(22, "John Carmack");

        extracted(e1);
        extracted(e2);
    }

    private static void extracted(persona e1) {
        if((e1.edat >=18)){
            System.out.println(e1.nom + " pot passar");
        } else {
            System.out.println(e1.nom + " no " + " pot passar");
        }
    }
}