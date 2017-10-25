package comunicacionentreactividades.comunicacionactividades;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class Activity_Aceptar_Condiciones extends AppCompatActivity {

    Bundle extras = getIntent().getExtras();
    String s = extras.getString(MainActivity.);


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity__aceptar__condiciones);
    }
}
