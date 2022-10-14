package com.example.holamundo;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
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
    public boolean onCreateOptionsMenu(Menu menu){
        getMenuInflater().inflate(R.menu.menu_en_actividad, menu);
        return true;
    }

    public boolean onOptionsItemSelect(MenuItem item){
        int id = item.getItemId();

        if(id == R.id.item1){
                Intent Intent = new Intent(MainActivity.this, opcion1.class);
                startActivity(Intent);
                return true;
        } else if (id == R.id.item2){
            Intent Intent = new Intent(MainActivity.this, opcion2.class);
            startActivity(Intent);
            return true;
        } else if (id == R.id.item3){
            Intent Intent = new Intent(MainActivity.this, opcion3.class);
            startActivity(Intent);
            return true;
        } else if (id == R.id.item4){
            Intent Intent = new Intent(MainActivity.this, opcion4.class);
            startActivity(Intent);
            return true;

        }
        return super.onOptionsItemSelected(item);
    }
}