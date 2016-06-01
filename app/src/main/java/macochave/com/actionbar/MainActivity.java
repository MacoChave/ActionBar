package macochave.com.actionbar;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_menu, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int id = item.getItemId();
        switch (id) {
            case R.id.action_settings:
                Toast.makeText(getApplicationContext(), "Menu: settings", Toast.LENGTH_SHORT).show();
                return true;
            case R.id.acercaDe:
                Toast.makeText(getApplication(), "Menu: acerca de", Toast.LENGTH_SHORT).show();
            case R.id.salir:
                Toast.makeText(getApplication(), "Menu: salir", Toast.LENGTH_SHORT).show();
        }
        return super.onOptionsItemSelected(item);
    }


}
