package devandroid.hamilko.applistacurso1.view;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import devandroid.hamilko.applistacurso1.R;
import model.Pessoa;

public class MainActivity extends AppCompatActivity {

    Pessoa pessoa;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        pessoa = new Pessoa()
        pessoa.setPrimeiroNome("Diego");
        pessoa.setSobreNome("Hamilko");
        pessoa.getCursoDesejado("Android");
        pessoa.getTelefoneContato("46 99971-1230");
    }
}