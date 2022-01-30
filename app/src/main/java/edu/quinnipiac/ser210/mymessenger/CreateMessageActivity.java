package edu.quinnipiac.ser210.mymessenger;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.os.Bundle;
import android.content.Intent;
import android.view.View;
import android.widget.EditText;

public class CreateMessageActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_create_message);
    }

    //call this when button clicked
    public void onSendMessage(View view) {
        EditText messageView = (EditText) findViewById(R.id.message); //the EditText in the xml file
        String messageText = messageView.getText().toString(); //get the text from the EditText

        /*
        Intent intent = new Intent(this, ReceiveMessageActivity.class); //establish connection with other activity (explicit)
        intent.putExtra(ReceiveMessageActivity.EXTRA_MESSAGE, messageText); //give the connection a string data to carry over to the activity
        startActivity(intent); //start the other activity with the intent */


        Intent intent = new Intent(Intent.ACTION_SEND); //implicit; don't care which activity is used to accomplish this
        intent.setType("text/plain");
        intent.putExtra(Intent.EXTRA_TEXT, messageText);
        String chooserTitle = getString(R.string.chooser);
        Intent chosenIntent = Intent.createChooser(intent, chooserTitle); //makes it so that there is not option to set a default app and to create your own title for the Activity searcher
        startActivity(chosenIntent);

    }
}



//android:ems="10" (how wide should the EditText be?)
/*createChooser() allows
you to specify a title for
the chooser dialog, and
doesn’t give the user
the option of selecting
an activity to use by
default. It also lets the
user know if there are
no matching activities
by displaying a message.*/