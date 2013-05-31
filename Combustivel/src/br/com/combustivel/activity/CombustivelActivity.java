package br.com.combustivel.activity;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import br.com.combustivel.R;

@SuppressLint("UseValueOf")
public class CombustivelActivity extends Activity {
	
	Etanol calcular = new Etanol();

	EditText txtPrecoGasolina;
	EditText txtPrecoAlcool;
	TextView txtResultado;

	Button btnCalcular;
	Button btnSair;
	
	double precoGasolina;
	double precoAlcool;
	double resultado;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
    	
    	super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_combustivel);
    	
    	btnCalcular = (Button) findViewById(R.id.btn_calcular);
    	btnSair = (Button) findViewById(R.id.btn_sair);
    	
	}
    
    public void onClick(View v) {
		
		Intent intent = new Intent();
		
		txtPrecoGasolina =  (EditText) findViewById(R.id.txt_preco_gasolina);
    	txtPrecoAlcool =  (EditText) findViewById(R.id.txt_preco_alcool);
//    	txtResultado =  (TextView) txtResultado.findViewById(R.id.txt_resultado);

		if((txtPrecoGasolina!= null && !txtPrecoGasolina.getText().toString().trim().equals("")) && 
				(txtPrecoAlcool != null && !txtPrecoAlcool.getText().toString().trim().equals(""))) {
			precoGasolina = Double.parseDouble(txtPrecoGasolina.getText().toString());
			precoAlcool = Double.parseDouble(txtPrecoAlcool.getText().toString());
			resultado = precoAlcool/precoGasolina;
			intent.setClass(this, Gasolina.class);
			System.out.println("****************** 01 *******************");
			startActivity(intent);
		} else if ((txtPrecoGasolina!= null && !txtPrecoGasolina.getText().toString().trim().equals("")) && 
				(txtPrecoAlcool != null && txtPrecoAlcool.getText().toString().trim().equals(""))) {
			precoGasolina = Double.parseDouble(txtPrecoGasolina.getText().toString());
			resultado = (precoGasolina*(new Double(0.70)));
			intent.setClass(this, Etanol.class);
			System.out.println("****************** 02 *******************");
			startActivity(intent);
		} else if ((txtPrecoGasolina!= null && txtPrecoGasolina.getText().toString().trim().equals("")) && 
				(txtPrecoAlcool != null && !txtPrecoAlcool.getText().toString().trim().equals(""))) {
			precoAlcool = Double.parseDouble(txtPrecoAlcool.getText().toString());
			resultado = (precoAlcool*(new Double(0.70)));
			intent.setClass(this, Etanol.class);
			System.out.println("****************** 03 *******************");
			startActivity(intent);
		}
	}


	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.combustivel, menu);
		return true;
	}

}
