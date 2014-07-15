package com.Supermunch.d20charactergenerator;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends Activity {

	int playerClass;
	int playerCreature;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
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
		Intent classIntent = new Intent(this, SelectClassActivity.class);
		startActivityForResult(classIntent, 0);
	}
	public void setCreatureClicked(View view)
	{
		Intent creatureIntent = new Intent(this, SelectCreatureActivity.class);
		startActivityForResult(creatureIntent, 1);
	}
	protected void onActivityResult(int requestCode, int resultCode, Intent data){
	    switch (requestCode)
	    {
	    case 0:
	    	playerClass = data.getIntExtra("class", 0);
	    	setClass();
	    	break;
	    case 1:
	    	playerCreature = data.getIntExtra("creature", 0);
	    	setCreature();
	    	break;
	    }
	}
	public void setClass()
	{
		TextView playerClassText = (TextView)findViewById(R.id.textView2);
		switch (playerClass)
		{
		case 2131034180:
			playerClassText.setText(R.string.classMartialArtist);
		break;
		case 2131034181:
			playerClassText.setText(R.string.classDaredevil);
		break;
		case 2131034182:
			playerClassText.setText(R.string.classFieldScientist);
		break;
		case 2131034183:
			playerClassText.setText(R.string.classBodyguard);
		break;
		case 2131034184:
			playerClassText.setText(R.string.classInvestigator);
		break;
		case 2131034185:
			playerClassText.setText(R.string.classPersonality);
		break;
		case 2131034186:
			playerClassText.setText(R.string.classTechie);
		break;
		case 2131034187:
			playerClassText.setText(R.string.classFieldMedic);
		break;
		case 2131034188:
			playerClassText.setText(R.string.classNegotiator);
		break;
		case 2131034189:
			playerClassText.setText(R.string.classTechie);
		break;
		case 2131034190:
			playerClassText.setText(R.string.classSoldier);
		break;
		case 2131034191:
			playerClassText.setText(R.string.classInfiltrator);
		break;
		case 2131034192:
			playerClassText.setText(R.string.classGunslinger);
		break;
		}
	}
	public void setCreature()
	{
		TextView playerCreatureText = (TextView)findViewById(R.id.TextViewCreature);
		switch (playerCreature)
		{
		case 2131034180:
			playerCreatureText.setText(R.string.creatureAbberation);
		break;
		case 2131034181:
			playerCreatureText.setText(R.string.creatureConstruct);
		break;
		case 2131034182:
			playerCreatureText.setText(R.string.creatureElemental);
		break;
		case 2131034183:
			playerCreatureText.setText(R.string.creatureGiant);
		break;
		case 2131034184:
			playerCreatureText.setText(R.string.creatureMagicalBeast);
		break;
		case 2131034185:
			playerCreatureText.setText(R.string.creatureOutsider);
		break;
		case 2131034187:
			playerCreatureText.setText(R.string.creatureAnimal);
		break;
		case 2131034188:
			playerCreatureText.setText(R.string.creatureDragon);
		break;
		case 2131034189:
			playerCreatureText.setText(R.string.creatureFey);
		break;
		case 2131034190:
			playerCreatureText.setText(R.string.creatureHumanoid);
		break;
		case 2131034191:
			playerCreatureText.setText(R.string.creatureMonstrousHumanoid);
		break;
		case 2131034192:
			playerCreatureText.setText(R.string.creatureOoze);
		break;
		case 2131034194:
			playerCreatureText.setText(R.string.creatureVermin);
		break;
		case 2131034195:
			playerCreatureText.setText(R.string.creaturePlant);
		break;
		case 2131034196:
			playerCreatureText.setText(R.string.creatureUndead);
		break;
		}
	}
}
