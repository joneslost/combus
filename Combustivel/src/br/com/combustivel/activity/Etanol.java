package br.com.combustivel.activity;

import br.com.combustivel.R;
import android.app.Activity;
import android.os.Bundle;

public class Etanol extends Activity{
	
    @Override
    protected void onCreate(Bundle savedInstanceState) {
    	
    	super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_etanol);
		
    }
    
    
	private double precoGasolina;
	private double precoEtanol;	
	private double resultado;
	
	
	public double getPrecoGasolina() {
		return precoGasolina;
	}
	public void setPrecoGasolina(double precoGasolina) {
		this.precoGasolina = precoGasolina;
	}
	public double getPrecoEtanol() {
		return precoEtanol;
	}
	public void setPrecoEtanol(double precoEtanol) {
		this.precoEtanol = precoEtanol;
	}
	public double getResultado() {
		return resultado;
	}
	public void setResultado(double resultado) {
		this.resultado = resultado;
	}

	
	
}
