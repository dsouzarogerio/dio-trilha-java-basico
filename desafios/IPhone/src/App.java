import com.iphone.Models.Interfaces.IPhone;
import com.iphone.Models.NavegadorWeb;
import com.iphone.Models.ReprodutorMusical;
import com.iphone.Models.Telefone;

public class App {
    public static void main(String[] args) {
        var telefone = new Telefone();
        telefone.isLigado();
        telefone.ligarParaNumero("62912345678");

        var musica = new ReprodutorMusical();
        musica.selecionandoMusica("Parabens");

        var navegador = new NavegadorWeb();
        navegador.exibirPagina("http://localhost");
        navegador.adicionarNovaAba();
        navegador.desligar();

    }
}