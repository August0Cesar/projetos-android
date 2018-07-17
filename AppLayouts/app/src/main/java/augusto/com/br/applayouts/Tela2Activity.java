package augusto.com.br.applayouts;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class Tela2Activity extends AppCompatActivity {
    public static final int CONSTANTE_TELA_3 = 1;
    TextView textView;
    TextView textoTitulo;
    EditText editNome;
    EditText editEmail;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tela2);
    }

    public void enviaTela1(View view) {
        editNome = (EditText) findViewById(R.id.editNome);
        editEmail = (EditText) findViewById(R.id.editEmail);

        Bundle parametros = new Bundle();
        parametros.putString("nome",editNome.getText().toString());
        parametros.putString("email",editEmail.getText().toString());

        Intent intent = new Intent(getApplicationContext(),Tela3.class);
        intent.putExtras(parametros);

    }

    public void enviaTela2(View view) {
        String teste = "apertou botao 2";
        Toast.makeText(getApplicationContext(),teste,Toast.LENGTH_SHORT).show();
    }

    public void enviaDadosTela3(View view) {
        editNome = (EditText) findViewById(R.id.editNome);
        editEmail = (EditText) findViewById(R.id.editEmail);

        Bundle parametros = new Bundle();
        parametros.putString("nome",editNome.getText().toString());
        parametros.putString("email",editEmail.getText().toString());

        Intent intent = new Intent(getApplicationContext(),Tela3.class);
        intent.putExtras(parametros);
        startActivityForResult(intent,CONSTANTE_TELA_3);//Inicia outra activity esperando
                                                        //parametros de volta
    }

    /**
     *
     * @param requestCode codigo da tela
     * @param resultCode codigo do resultado
     * @param data dados que veio de outra tela
     */
    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        //super.onActivityResult(requestCode, resultCode, data);
        if(requestCode == CONSTANTE_TELA_3){
            Bundle params = data.getExtras();
            if(params != null){
                String mensagem = params.getString("msg");
                Toast.makeText(getApplicationContext(),
                        "Tela "+requestCode+" "+ mensagem, Toast.LENGTH_LONG).show();
            }

        }

    }
}
