package comunicacionentreactividades.comunicacionactividades;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.net.Inet4Address;

public class MainActivity extends AppCompatActivity {

    private EditText txt_nombre;
    private Button btn_verificar;
    private TextView txt_result;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        txt_nombre = (EditText) findViewById(R.id.txt_nombre);
        btn_verificar  =(Button) findViewById(R.id.btn_Verificar);
        txt_result = (TextView) findViewById(R.id.txt_resultado);


        btn_verificar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intento = new Intent(MainActivity.this,Activity_Aceptar_Condiciones.class);

                Bundle bundle = new Bundle();
                bundle.putString("Verificar",txt_nombre.getText().toString());
                txt_nombre.setText("");

                // Añadimos la información al intent
                intento.putExtras(bundle);

                startActivityForResult(intento,666);

            }
        });

    }
    @Override
    protected void onActivityResult (int requestCode, int resultCode, Intent data){

    if(requestCode==666 && resultCode == RESULT_OK){
        boolean resultado = data.getExtras().getBoolean("resultado");

        if(resultado){
            txt_result.setText("Resultado: Aceptado");

        }else{
            txt_result.setText("Resultado: Rechazado");
        }

    }
    }

}
