package com.example.bestappeveralmost;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		//This set's the layout of the activity to our layout resource
		setContentView(R.layout.activity_main);
		
		// We create a button variable and point it to the button we described
		// in our layout
		Button myButton = (Button) findViewById(R.id.my_button);
		// This adds a click listener to our button so we can execute code
		// when it's clicked
		myButton.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// a toast is a little pop-up message that notifies the user tha
				// something has happened
				Toast.makeText(getApplicationContext(), 
						"I said don't press!", Toast.LENGTH_SHORT).show();
				
				// start activity takes us to another activity
				startActivity(new Intent(MainActivity.this, LoggedInActivity.class));
			}
		});
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
}
