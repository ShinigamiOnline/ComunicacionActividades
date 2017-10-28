package comunicacionentreactividades.comunicacionactividades;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private EditText txt_nombre;
    private Button btn_verificar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        txt_nombre = (EditText) findViewById(R.id.txt_nombre);
        btn_verificar  =(Button) findViewById(R.id.btn_Verificar);


        btn_verificar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intento = new Intent(MainActivity.this,Activity_Aceptar_Condiciones.class);

                Bundle bundle = new Bundle();
                bundle.putString("Verificar",txt_nombre.getText().toString());

                // Añadimos la información al intent
                intento.putExtras(bundle);

                startActivity(intento);

            }
        });




    }
}
