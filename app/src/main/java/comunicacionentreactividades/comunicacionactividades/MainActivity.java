package comunicacionentreactividades.comunicacionactividades;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    //private Button btn_Verificar;
  //   private TextView txtCambiado ;

    Intent intent = new Intent(this,MainActivity.class);
    intent.putExtra();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
       // txtCambiado = (TextView) findViewById(R.id.txt_nombre);
        //txtCambiado.setText("loquesea");



    }
}
