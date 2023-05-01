package devandroid.wittmann.applistacurso.view;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

import devandroid.wittmann.applistacurso.R;
import devandroid.wittmann.applistacurso.model.Pessoa;

public class MainActivity extends AppCompatActivity {

    Pessoa pessoa;
    Pessoa outraPessoa;

    String dadosPessoa;
    String dadosOutraPessoa;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Objeto
        pessoa = new Pessoa();
        // Atribuir dados ao Objeto
        pessoa.setPrimeiroNome("Roberto");
        pessoa.setSobreNome("Wittmann");
        pessoa.setCursoDesejado("Android");
        pessoa.setTelefoneContato("19 9 9999 9999");

        outraPessoa = new Pessoa();
        outraPessoa.setPrimeiroNome("Carmela");
        outraPessoa.setSobreNome("Wittmann");
        outraPessoa.setCursoDesejado("Java");
        outraPessoa.setTelefoneContato("19 9 8888 9999");

        dadosPessoa = "Primeiro nome: ";
        dadosPessoa += pessoa.getPrimeiroNome();
        dadosPessoa += " Sobrenome: ";
        dadosPessoa += pessoa.getSobreNome();
        dadosPessoa += " Curso desejado: ";
        dadosPessoa += pessoa.getCursoDesejado();
        dadosPessoa += " Telefone de contato: ";
        dadosPessoa += pessoa.getTelefoneContato();

        dadosOutraPessoa = "Primeiro nome: ";
        dadosOutraPessoa += outraPessoa.getPrimeiroNome();
        dadosOutraPessoa += " Sobrenome: ";
        dadosOutraPessoa += outraPessoa.getSobreNome();
        dadosOutraPessoa += " Curso desejado: ";
        dadosOutraPessoa += outraPessoa.getCursoDesejado();
        dadosOutraPessoa += " Telefone de contato: ";
        dadosOutraPessoa += outraPessoa.getTelefoneContato();

        Log.i("POOAndroid","Objeto pessoa: "+pessoa.toString());
        Log.i("POOAndroid","Objeto outraPessoa: "+outraPessoa.toString());

    }
}