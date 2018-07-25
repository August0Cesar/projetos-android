package augusto.com.br.appactionbartemas;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.SearchView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Toolbar myToolbar = (Toolbar) findViewById(R.id.my_toolbar);
        setSupportActionBar(myToolbar);

        ActionBar actionBar = getSupportActionBar();
        actionBar.setDisplayHomeAsUpEnabled(true);
        actionBar.setTitle("App");


    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_main, menu);
        MenuItem menuItem = menu.findItem(R.id.action_search);
        SearchView searchView = (SearchView) menuItem.getActionView();
        searchView.setOnQueryTextListener(onSearch());
        return true;
    }
    //escuta o que foi digitado no SearchView
    private SearchView.OnQueryTextListener onSearch() {
        return new SearchView.OnQueryTextListener(){
            @Override
            public boolean onQueryTextSubmit(String query) {
                // Usuário fez a busca
                Toast.makeText(getApplicationContext(),"Buscar o texto: " + query,Toast.LENGTH_SHORT)
                        .show();
                return false;
            }
            @Override
            public boolean onQueryTextChange(String newText) {
                // Mudou o texto digitado
                Toast.makeText(getApplicationContext(),"Buscar o texto: " + newText,Toast.LENGTH_SHORT)
                        .show();
                return false;
            }
        };
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {

        switch (item.getItemId()){
            case R.id.action_settings:
                return true;

            case R.id.action_search:
                Toast.makeText(getApplicationContext(),"Muito bom.",Toast.LENGTH_LONG).show();
                return true;

            case R.id.action_text:
                Intent intent = new Intent(getApplicationContext(),NovaTelaActivity.class);
                startActivity(intent);
                return true;
        }
        return super.onOptionsItemSelected(item);
    }
}
