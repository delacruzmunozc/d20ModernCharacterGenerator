package com.Supermunch.d20charactergenerator;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends ActionBarActivity {

	int playerClass;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		setClass();
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

	@Override
	public boolean onOptionsItemSelected(MenuItem item) {
		// Handle action bar item clicks here. The action bar will
		// automatically handle clicks on the Home/Up button, so long
		// as you specify a parent activity in AndroidManifest.xml.
		int id = item.getItemId();
		if (id == R.id.action_settings) {
			return true;
		}
		return super.onOptionsItemSelected(item);
	}
	public void setClassClicked(View view)
	{
		Intent intent = new Intent(this, SelectClass.class);
		startActivityForResult(intent, 0);
	}
	protected void onActivityResult(int requestCode, int resultCode, Intent data){
	    switch (requestCode)
	    {
	    case 0:
	    	playerClass = data.getIntExtra("class", 0);
	    	setClass();
	    	break;
	    }
	}
	public void setClass()
	{
		TextView playerClassText = (TextView)findViewById(R.id.textView2);
		switch (playerClass)
		{
		case 2131034177:
			playerClassText.setText(R.string.classMartialArtist);
		break;
		case 2131034178:
			playerClassText.setText(R.string.classDaredevil);
		break;
		case 2131034179:
			playerClassText.setText(R.string.classFieldScientist);
		break;
		case 2131034180:
			playerClassText.setText(R.string.classBodyguard);
		break;
		case 2131034181:
			playerClassText.setText(R.string.classInvestigator);
		break;
		case 2131034182:
			playerClassText.setText(R.string.classPersonality);
		break;
		case 2131034184:
			playerClassText.setText(R.string.classFieldMedic);
		break;
		case 2131034185:
			playerClassText.setText(R.string.classNegotiator);
		break;
		case 2131034186:
			playerClassText.setText(R.string.classTechie);
		break;
		case 2131034187:
			playerClassText.setText(R.string.classSoldier);
		break;
		case 2131034188:
			playerClassText.setText(R.string.classInfiltrator);
		break;
		case 2131034189:
			playerClassText.setText(R.string.classGunslinger);
		break;
		}
	}
}
