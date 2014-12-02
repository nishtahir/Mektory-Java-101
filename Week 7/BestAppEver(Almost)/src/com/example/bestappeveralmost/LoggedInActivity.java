package com.example.bestappeveralmost;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class LoggedInActivity extends Activity {
	private int count = 0;
	private TextView myTextView;
	private Button myButton;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		//change layout to the one we just made
		setContentView(R.layout.activity_logged_in);
		
		myTextView = (TextView) findViewById(R.id.my_text_view);
		myButton = (Button) findViewById(R.id.my_button);
		
		myButton.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				myTextView.setText("You've clicked the button, " + count++);
			}
		});
	}
}
