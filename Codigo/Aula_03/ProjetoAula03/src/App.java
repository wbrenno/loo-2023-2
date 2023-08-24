import java.time.LocalDate;

import uniderp.loo.escola.dominio.Cliente;

public class App {
    public static void main(String[] args) throws Exception {
        
        Cliente C1 = new Cliente();
        C1.setCodigo(1);
        C1.setNome("Pedro");
        C1.setEndereco("Rua X, 10");
        C1.setTelefone("998763521");
        C1.setDataNascimento(LocalDate.of(1945, 10, 15));
        C1.setRg("987654321");
        C1.setCpf("32165498765");
        C1.setDataInsercao(LocalDate.now());
    }
}
