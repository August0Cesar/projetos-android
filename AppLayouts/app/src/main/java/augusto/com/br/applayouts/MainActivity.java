package augusto.com.br.applayouts;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private User user;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //Button btn1 = (Button) findViewById(R.id.btn_primeiroButton);
    }

    public void imprimeMensagem(View view) {
        String teste = "apertou botao";
        Toast.makeText(getApplicationContext(), teste, Toast.LENGTH_SHORT).show();
    }

    public void abreNovaTela(View view) {
        Intent intent = new Intent(getApplicationContext(), Tela2Activity.class);

        Bundle params = new Bundle();
        params.putString("nome", "Augusto Cesar");
        intent.putExtras(params);//enviando parametros para outra tela
        startActivity(intent);
    }
}
