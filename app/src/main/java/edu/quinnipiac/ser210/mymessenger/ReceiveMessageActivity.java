package edu.quinnipiac.ser210.mymessenger;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class ReceiveMessageActivity extends AppCompatActivity {

    public static final String EXTRA_MESSAGE = "message";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_receive_message);
        Intent intent = getIntent(); //get the intent carried over from other activity once started
        String messageText = intent.getStringExtra(EXTRA_MESSAGE); //get the custom extra text from the intent
        TextView messageView = (TextView) findViewById(R.id.message);
        messageView.setText(messageText);
    }
}