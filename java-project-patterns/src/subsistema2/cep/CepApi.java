package subsistema2.cep;

public class CepApi {
    
    //usando singleton eager
    private static CepApi instancia = new CepApi();

    private CepApi() {
        super();
    }

    public static CepApi getInstancia() {
        return instancia;
    }

    public String recuperarCidade(String cep) {
        return "São Paulo";
    }

    public String recuperarEstado(String estado) {
        return "SP";
    }
}
