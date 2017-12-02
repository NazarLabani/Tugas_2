package sttg.nazar.tugas_2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.ContextMenu;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    String [] isi = {"Menu 1","Menu 2","Menu 3","Menu 4","Menu 5","Menu 6"};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ArrayAdapter adapter = new ArrayAdapter(this,R.layout.list_view,isi);
        ListView listView = (ListView) findViewById(R.id.list);
        listView.setAdapter(adapter);
        registerForContextMenu(listView);
    }
    public void onCreateContextMenu(ContextMenu menu ,View v,ContextMenu.ContextMenuInfo menuInfo){
        super.onCreateContextMenu(menu,v,menuInfo);
        menu.setHeaderTitle("Pilih Action Yang dilakukan");
        menu.add(0,v.getId(),0,"Bold");
        menu.add(0,v.getId(),0,"Italic");
        menu.add(0,v.getId(),0,"Normal");
    }
    public boolean onContextItemSelected(MenuItem item) {
        if (item.getTitle() == "Bold") {
            Toast.makeText(getApplicationContext(), "Memilih Bold", Toast.LENGTH_SHORT).show();
        } else if (item.getTitle() == "Italic") {
            Toast.makeText(getApplicationContext(), "Memilih Italic", Toast.LENGTH_SHORT).show();
        } else if (item.getTitle() == "Normal") {
            Toast.makeText(getApplicationContext(), "Memilih Normal", Toast.LENGTH_SHORT).show();
        } else {
            return false;
        }
        return true;
    }



    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }
    public boolean onOptionsItemSelected( MenuItem item) {
        switch (item.getItemId()) {
            case R.id.bookmark:
                Toast.makeText(getApplicationContext(), "Menu Bookmark dipilih", Toast.LENGTH_SHORT).show();
                return true;
            case R.id.search:
                Toast.makeText(getApplicationContext(), "Menu 2 Search", Toast.LENGTH_SHORT).show();
                return true;
            case R.id.share:
                Toast.makeText(getApplicationContext(), "Menu 3 share", Toast.LENGTH_SHORT).show();
                return true;
            case R.id.delete:
                Toast.makeText(getApplicationContext(), "Menu 4 delete", Toast.LENGTH_SHORT).show();
                return true;
            case R.id.preferences:
                Toast.makeText(getApplicationContext(), "Menu 5 Preferences", Toast.LENGTH_SHORT).show();
                return true;
            case R.id.save:
                Toast.makeText(getApplicationContext(), "Menu 6 save", Toast.LENGTH_SHORT).show();
                return true;
            default:
                return super.onOptionsItemSelected(item);

        }
    }
}
