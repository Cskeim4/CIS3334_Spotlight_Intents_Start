package css.spotlight;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.provider.CalendarContract;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.GregorianCalendar;

public class MainActivity extends AppCompatActivity {

    //Initialize the button variables created in the xml file
    Button buttonWeb1, buttonCalendar1, buttonMap1;
    Button buttonWeb2, buttonCalendar2, buttonMap2;
    Button buttonWeb3, buttonCalendar3, buttonMap3;

    TextView textViewStatus;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textViewStatus = findViewById(R.id.textViewStatus);

        //Call the set of onClick listener methods for each event
        setupButtonWeb1();
        setupButtonCalendar1();
        setupButtonMap1();

        setupButtonWeb2();
        setupButtonCalendar2();
        setupButtonMap2();

        setupButtonWeb3();
        setupButtonCalendar3();
        setupButtonMap3();
    }
    //First Event Code
    private void setupButtonCalendar1() {
        buttonCalendar1 = findViewById(R.id.buttonCalendar1);
        buttonCalendar1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textViewStatus.setText("Code should set a calendar event for performance 1");
                //When the calendar button is clicked start an intent action to add the event to a calendar
                //Send the title, location, and time data in a bundle as extras
                Intent calIntent = new Intent(Intent.ACTION_INSERT);
                calIntent.setType("vnd.android.cursor.item/event");
                calIntent.putExtra(CalendarContract.Events.TITLE, "Crafting a Children's Book Focused on the Common Good");
                calIntent.putExtra(CalendarContract.Events.EVENT_LOCATION, "Virtual");
                GregorianCalendar begDate = new GregorianCalendar(2021, 2, 26, 15, 40);
                GregorianCalendar endDate = new GregorianCalendar(2021, 2, 26, 16, 55);
                calIntent.putExtra(CalendarContract.EXTRA_EVENT_BEGIN_TIME,
                        begDate.getTimeInMillis());
                calIntent.putExtra(CalendarContract.EXTRA_EVENT_END_TIME,
                        endDate.getTimeInMillis());
                //Verify there is an app that can handle the intent
                if (calIntent.resolveActivity(getPackageManager()) != null) {
                    startActivity(calIntent);
                }
            }
        });
    }

    private void setupButtonWeb1() {
        buttonWeb1 = findViewById(R.id.buttonWeb1);
        buttonWeb1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.d("CIS 3334","This should display a website with the browser");
                textViewStatus.setText("This should display event 1 in the browser");

                // Add implicit intent code to open web browser to event 1
                //When the web info button is clicked open a web browser
                Uri webpage = Uri.parse("http://www.css.edu/about/spotlight-arts-and-lectures/calendar.html?trumbaEmbed=eventid%3d150337461%26seotitle%3dCrafting-a-Childrens-Book-Focused-on-the-Common-Good-with-Sarah-Brokke-Erickson-and-Gary-Boelhower%26view%3devent%26-childview%3d");
                Intent webIntent = new Intent(Intent.ACTION_VIEW, webpage);
                //Verify there is an app that can handle the intent
                if (webIntent.resolveActivity(getPackageManager()) != null) {
                    startActivity(webIntent);
                }
            }
        });
    }

    private void setupButtonMap1() {
        buttonMap1 = findViewById(R.id.buttonMap1);
        buttonMap1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.d("CIS 3334","This should display a map");
                textViewStatus.setText("This should display event 1 in the map");

                // Add implicit intent code to open a map to event 1
                //The intent sends the url to the desired location through to the map app
                Uri location = Uri.parse("geo: 46.816591,-92.1062274");
                Intent mapIntent = new Intent(Intent.ACTION_VIEW, location);
                if (mapIntent.resolveActivity(getPackageManager()) != null) {
                    startActivity(mapIntent);
                }
            }
        });
    }

    //Second Event Code
    private void setupButtonCalendar2() {
        buttonCalendar2 = findViewById(R.id.buttonCalendar2);
        buttonCalendar2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textViewStatus.setText("Code should set a calendar event for performance 2");
                //When the calendar button is clicked start an intent action to add the event to a calendar
                //Send the title, location, and time data in a bundle as extras
                Intent calIntent = new Intent(Intent.ACTION_INSERT);
                calIntent.setType("vnd.android.cursor.item/event");
                calIntent.putExtra(CalendarContract.Events.TITLE, "For Whom is the American Dream?");
                calIntent.putExtra(CalendarContract.Events.EVENT_LOCATION, "Virtual");
                GregorianCalendar begDate = new GregorianCalendar(2021, 3, 4, 19, 30);
                GregorianCalendar endDate = new GregorianCalendar(2021, 3, 4, 20, 30);
                calIntent.putExtra(CalendarContract.EXTRA_EVENT_BEGIN_TIME,
                        begDate.getTimeInMillis());
                calIntent.putExtra(CalendarContract.EXTRA_EVENT_END_TIME,
                        endDate.getTimeInMillis());
                //Verify there is an app that can handle the intent
                if (calIntent.resolveActivity(getPackageManager()) != null) {
                    startActivity(calIntent);
                }
            }
        });
    }

    private void setupButtonWeb2() {
        buttonWeb2 = findViewById(R.id.buttonWeb2);
        buttonWeb2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.d("CIS 3334","This should display a website with the browser");
                textViewStatus.setText("This should display event 2 in the browser");

                // Add implicit intent code to open web browser to event 2
                //When the web info button is clicked open a web browser
                Uri webpage = Uri.parse("http://www.css.edu/about/spotlight-arts-and-lectures/calendar.html?trumbaEmbed=eventid%3d146856981%26seotitle%3dFor-Whom-is-the-American-Dream-with-Charlotte-Frantz%26view%3devent%26-childview%3d");
                Intent webIntent = new Intent(Intent.ACTION_VIEW, webpage);
                //Verify there is an app that can handle the intent
                if (webIntent.resolveActivity(getPackageManager()) != null) {
                    startActivity(webIntent);
                }
            }
        });
    }

    private void setupButtonMap2() {
        buttonMap2 = findViewById(R.id.buttonMap2);
        buttonMap2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.d("CIS 3334","This should display a map");
                textViewStatus.setText("This should display event 2 in the map");

                // Add implicit intent code to open a map to event 2
                //The intent sends the url to the desired location through to the map app
                Uri location = Uri.parse("geo: 46.816591,-92.1062274");
                Intent mapIntent = new Intent(Intent.ACTION_VIEW, location);
                if (mapIntent.resolveActivity(getPackageManager()) != null) {
                    startActivity(mapIntent);
                }
            }
        });
    }

    //Third Event Code
    private void setupButtonCalendar3() {
        buttonCalendar3 = findViewById(R.id.buttonCalendar3);
        buttonCalendar3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textViewStatus.setText("Code should set a calendar event for performance 3");
                //When the calendar button is clicked start an intent action to add the event to a calendar
                //Send the title, location, and time data in a bundle as extras
                Intent calIntent = new Intent(Intent.ACTION_INSERT);
                calIntent.setType("vnd.android.cursor.item/event");
                calIntent.putExtra(CalendarContract.Events.TITLE, "What We Can Learn From Newcomers");
                calIntent.putExtra(CalendarContract.Events.EVENT_LOCATION, "Virtual");
                GregorianCalendar begDate = new GregorianCalendar(2021, 3, 23, 19, 30);
                GregorianCalendar endDate = new GregorianCalendar(2021, 3, 23, 21, 00);
                calIntent.putExtra(CalendarContract.EXTRA_EVENT_BEGIN_TIME,
                        begDate.getTimeInMillis());
                calIntent.putExtra(CalendarContract.EXTRA_EVENT_END_TIME,
                        endDate.getTimeInMillis());
                //Verify there is an app that can handle the intent
                if (calIntent.resolveActivity(getPackageManager()) != null) {
                    startActivity(calIntent);
                }
            }
        });
    }

    private void setupButtonWeb3() {
        buttonWeb3 = findViewById(R.id.buttonWeb3);
        buttonWeb3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.d("CIS 3334","This should display a website with the browser");
                textViewStatus.setText("This should display event 3 in the browser");

                // Add implicit intent code to open web browser to event 3
                //When the web info button is clicked open a web browser
                Uri webpage = Uri.parse("http://www.css.edu/about/spotlight-arts-and-lectures/calendar.html?trumbaEmbed=eventid%3d146857019%26seotitle%3dWhat-We-Can-Learn-from-Newcomers-with-Claudia-Kolker%26view%3devent%26-childview%3d");
                Intent webIntent = new Intent(Intent.ACTION_VIEW, webpage);
                //Verify there is an app that can handle the intent
                if (webIntent.resolveActivity(getPackageManager()) != null) {
                    startActivity(webIntent);
                }
            }
        });
    }

    private void setupButtonMap3() {
        buttonMap3 = findViewById(R.id.buttonMap3);
        buttonMap3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.d("CIS 3334","This should display a map");
                textViewStatus.setText("This should display event 3 in the map");

                // Add implicit intent code to open a map to event 3
                //The intent sends the url to the desired location through to the map app
                Uri location = Uri.parse("geo: 46.816591,-92.1062274");
                Intent mapIntent = new Intent(Intent.ACTION_VIEW, location);
                if (mapIntent.resolveActivity(getPackageManager()) != null) {
                    startActivity(mapIntent);
                }
            }
        });
    }
}  // End of class