package augusto.com.br.applayouts;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class Tela3 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tela3);
        TextView nome = (TextView) findViewById(R.id.texto_nome);
        TextView email = (TextView) findViewById(R.id.texto_email);
        Intent intent = getIntent();
        Bundle parametros = intent.getExtras();
        if(parametros != null){
            nome.setText(parametros.get("nome").toString());
            email.setText(parametros.get("email").toString());
        }
    }

    public void recusou(View view) {
        Intent intent = new Intent();
        intent.putExtra("msg","recusou");
        setResult(2,intent);
        finish();
    }
    public void aceitou(View view) {
        Intent intent = new Intent();
        intent.putExtra("msg","aceitou");
        setResult(1,intent);
        finish();
    }
}
