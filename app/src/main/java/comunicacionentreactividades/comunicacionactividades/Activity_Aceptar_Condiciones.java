package comunicacionentreactividades.comunicacionactividades;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Activity_Aceptar_Condiciones extends AppCompatActivity {

    private TextView txt_nombre;
    private Button btn_aceptar;
    private Button btn_rechazar;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity__aceptar__condiciones);

        txt_nombre = (TextView) findViewById(R.id.txt_holausuario);
        btn_aceptar = (Button) findViewById(R.id.Button);
        btn_rechazar = (Button) findViewById(R.id.button2);

        Bundle extras = getIntent().getExtras();
        String nombre = extras.getString("Verificar");
        txt_nombre.setText("Hola " + nombre + ", ¿Aceptas las condiciones?");

        btn_aceptar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intento = new Intent();
                intento.putExtra("resultado", true);
                setResult(RESULT_OK, intento);
                finish();
            }


        });
        btn_rechazar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intento = new Intent();
                intento.putExtra("resultado", false);
                setResult(RESULT_OK, intento);
                finish();
            }

        });
    }



}
