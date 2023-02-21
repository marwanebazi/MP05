public class bixest {
    /**
     * Diu si un any és o no bixest
     * @param year any del qual volem saber si és bixest o no
     * @return true si any és bixest i false en cas contrari
     */
    public static boolean calculBixest(int year){
        return year >= 1584 && (year % 400 == 0 || year % 4 == 0 && year % 100 != 0);
    }
}
