package com.Supermunch.d20charactergenerator;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;
import android.widget.RadioGroup;
import android.widget.RadioGroup.OnCheckedChangeListener;

public class SelectClass extends Activity {
	RadioGroup rg1;
	RadioGroup rg2;
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
                Log.e("XXX2", "do the work");
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
                Log.e("XXX2", "do the work");
            }
        }
    };
}
