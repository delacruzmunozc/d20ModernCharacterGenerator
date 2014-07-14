package com.Supermunch.d20charactergenerator;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.RadioGroup.OnCheckedChangeListener;

public class SelectClass extends Activity {
	RadioGroup rg1;
	RadioGroup rg2;
	int id;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.select_class_activity);
		rg1 = (RadioGroup) findViewById(R.id.radioGroup1);
		rg2 = (RadioGroup) findViewById(R.id.radioGroup2);
		rg1.clearCheck(); 
		rg2.clearCheck();
		rg1.setOnCheckedChangeListener(listener1);
		rg2.setOnCheckedChangeListener(listener2);
	}
	private OnCheckedChangeListener listener1 = new OnCheckedChangeListener() {

        @Override
        public void onCheckedChanged(RadioGroup group, int checkedId) {
            if (checkedId != -1) {
                rg2.setOnCheckedChangeListener(null);
                rg2.clearCheck(); 
                rg2.setOnCheckedChangeListener(listener2);
                id = checkedId;
                Intent resultIntent = new Intent();
            	resultIntent.putExtra("class", id);
            	setResult(Activity.RESULT_OK, resultIntent);
            	description();
            }
        }
    };

    private OnCheckedChangeListener listener2 = new OnCheckedChangeListener() {

        @Override
        public void onCheckedChanged(RadioGroup group, int checkedId) {
            if (checkedId != -1) {
                rg1.setOnCheckedChangeListener(null);
                rg1.clearCheck();
                rg1.setOnCheckedChangeListener(listener1);
                id = checkedId;
                Intent resultIntent = new Intent();
            	resultIntent.putExtra("class", id);
            	setResult(Activity.RESULT_OK, resultIntent);
            	description();
            }
        }
    };
    public void setClassClicked(View view)
    {
    	this.finish();
    }
    public void description()
    {
    	TextView playerClassText = (TextView)findViewById(R.id.textView1);
		switch (id)
		{
		case 2131034177:
			playerClassText.setText(R.string.classMartialArtistDescription);
		break;
		case 2131034178:
			playerClassText.setText(R.string.classDaredevilDescription);
		break;
		case 2131034179:
			playerClassText.setText(R.string.classFieldScientistDescription);
		break;
		case 2131034180:
			playerClassText.setText(R.string.classBodyguardDescription);
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
			playerClassText.setText(R.string.classSoldierDescription);
		break;
		case 2131034188:
			playerClassText.setText(R.string.classInfiltratorDescription);
		break;
		case 2131034189:
			playerClassText.setText(R.string.classGunslingerDescription);
		break;
		}
    }
}
