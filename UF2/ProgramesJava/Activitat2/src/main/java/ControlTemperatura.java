public class ControlTemperatura {
    public static int potencia(int temperatura, int termostat) {
        int sortida = 0;

        if (temperatura > termostat) {
            sortida = 0;
        } if (temperatura - termostat == 0 || temperatura - termostat == 1 || temperatura - termostat == 2 ||
          temperatura - termostat == -1 || temperatura - termostat == -2){
            sortida = 1;
        } else {
            sortida = 2;
        }

        return sortida;
    }
}
