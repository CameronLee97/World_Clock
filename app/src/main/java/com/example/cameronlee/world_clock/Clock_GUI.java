package com.example.cameronlee.world_clock;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;
    import android.widget.TextClock;
import android.widget.TextView;

public class Clock_GUI extends AppCompatActivity{
        TextClock current_clock;
        Spinner cityChoices;
        TextView cityName;
        Button military_time;
        Button standard_time;
        ArrayAdapter<String> arrayAdpt;
            @Override
            protected void onCreate(Bundle savedInstanceState) {
                super.onCreate(savedInstanceState);
                setContentView(R.layout.activity_clock__gui);
                //initializing widgets, buttons, and text fields
                military_time = (Button) findViewById(R.id.m_time);
                standard_time = (Button) findViewById(R.id.s_time);
                cityName = (TextView) findViewById(R.id.location);
                current_clock = (TextClock) findViewById(R.id.current_time);
                cityChoices = (Spinner) findViewById(R.id.city_choices);
                cityChoices.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
                    @Override
                    public void onItemSelected(AdapterView<?> parent, View view,
                                               int position, long id) {
                        //Uses position as indicator as to which city has been selected.
                        // Position is indexed based off order of Arraylist of cities starting at 0
                        switch (position){
                            case 0:
                                current_clock.setTimeZone("GMT-4:00");
                                cityName.setText("New York City, NY");
                                break;
                            case 1:
                                current_clock.setTimeZone("GMT-5:00");
                                cityName.setText("Chicago, IL");
                                break;
                            case 2:
                                current_clock.setTimeZone("GMT-5:00");
                                cityName.setText("Mexico City, Mexico");
                                break;
                            case 3:
                                current_clock.setTimeZone("GMT-6:00");
                                cityName.setText("Denver, CO");
                                break;
                            case 4:
                                current_clock.setTimeZone("GMT-7:00");
                                cityName.setText("Los Angeles, CA");
                                break;
                            case 5:
                                current_clock.setTimeZone("GMT-8:00");
                                cityName.setText("Anchorage, AK");
                                break;
                            case 6:
                                current_clock.setTimeZone("GMT-10:00");
                                cityName.setText("Honolulu, HI");
                                break;
                            case 7:
                                current_clock.setTimeZone("GMT+9:00");
                                cityName.setText("Seoul, South Korea");
                                break;
                            case 8:
                                current_clock.setTimeZone("GMT+7:00");
                                cityName.setText("Bangkok, Thailand");
                                break;
                            case 9:
                                current_clock.setTimeZone("GMT+5:30");
                                cityName.setText("New Delhi, India");
                                break;
                            case 10:
                                current_clock.setTimeZone("GMT+4:30");
                                cityName.setText("Tehran, Iran");
                                break;
                            case 11:
                                current_clock.setTimeZone("GMT+3:00");
                                cityName.setText("Moscow, Russia");
                                break;
                            case 12:
                                current_clock.setTimeZone("GMT+2:00");
                                cityName.setText("Rome, Italy");
                                break;
                            case 13:
                                current_clock.setTimeZone("GMT+1:00");
                                cityName.setText("London, United Kingdom");
                                break;
                            case 14:
                                current_clock.setTimeZone("GMT-3:00");
                                cityName.setText("Buenos Aires, Argentina");
                                break;
                            case 15:
                                current_clock.setTimeZone("GMT-5:00");
                                cityName.setText("Lima, Peru");
                                break;
                            default:
                                break;
                        }
                    }
                    @Override
                    public void onNothingSelected(AdapterView<?> parent) {
                        return;
                    }
                });
                // Sets OnClickListener to change time to 24-hour mode
                military_time.setOnClickListener(new View.OnClickListener(){
                    @Override
                    public void onClick(View v) {
                        current_clock.setFormat12Hour("HH:mm:ss");
                    }
                });
                // Sets OnClickListener to change time to 12-hour mode
                standard_time.setOnClickListener(new View.OnClickListener(){
                    @Override
                    public void onClick(View v) {
                        current_clock.setFormat12Hour("h:mm:ss a");
                    }
                });
            }
}

