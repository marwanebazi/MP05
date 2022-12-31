public class TransportsJeanCloud {
    public static int kilos(int pes, int capacitat){
        int resposta;

        if (pes >= 500 && pes <= 900 && capacitat >= 500 && capacitat <= 750 && pes <= capacitat){
            resposta = 0;
        } else {
            resposta = -1;
        }
        return resposta;
    }
}