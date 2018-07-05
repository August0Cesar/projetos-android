package augusto.com.br.applayouts;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Tela2Activity extends AppCompatActivity {
    Handler handler = new Handler();
    TextView textView;
    Button btn_processamento;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tela2);
        textView = (TextView) findViewById(R.id.valorView);
        btn_processamento = (Button) findViewById(R.id.btn_processamento);
    }

    public void iniciaProcessamento(View view) {
        float tamanhoTexto = 25;
        textView.setText("Parabéns");
        textView.setTextSize(tamanhoTexto);
        btn_processamento.setActivated(false);
        btn_processamento.setVisibility(View.INVISIBLE);
    }
}
