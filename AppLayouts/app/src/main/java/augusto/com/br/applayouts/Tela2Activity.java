package augusto.com.br.applayouts;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class Tela2Activity extends AppCompatActivity {
    Handler handler = new Handler();
    TextView textView;
    TextView textoTitulo;
    Button btn_processamento;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tela2);
    }

    public void iniciaProcessamento(View view) {
        float tamanhoTexto = 25;
        textView.setText("Parabéns");
        textView.setTextSize(tamanhoTexto);
        btn_processamento.setActivated(false);
        btn_processamento.setVisibility(View.INVISIBLE);
    }

    public void enviaTela1(View view) {
        String teste = "apertou botao 1";
        Toast.makeText(getApplicationContext(),teste,Toast.LENGTH_SHORT).show();
    }

    public void enviaTela2(View view) {
        String teste = "apertou botao 2";
        Toast.makeText(getApplicationContext(),teste,Toast.LENGTH_SHORT).show();
    }
}
