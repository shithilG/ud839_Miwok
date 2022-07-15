/*
 * Copyright (C) 2016 The Android Open Source Project
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.example.android.miwok;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;
// import android.support.v7.app.AppCompatActivity;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        // Set the content of the activity to use the activity_main.xml layout file
        setContentView(R.layout.activity_main);


        TextView textView = (TextView) findViewById(R.id.numbers);
        textView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(view.getContext(), "open numbers list",Toast.LENGTH_SHORT).show();
                Intent i = new Intent(getApplicationContext(),NumbersActivity.class);
                startActivity(i);
            }
        });
        TextView textView1 = (TextView) findViewById(R.id.family);
        textView1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(view.getContext(), "open family activity",Toast.LENGTH_SHORT).show();
                Intent i = new Intent(getApplicationContext(),Family_Members_Activity.class);
                startActivity(i);
            }
        });
        TextView textView2 = (TextView) findViewById(R.id.colors);
        textView2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(view.getContext(),"open colors list",Toast.LENGTH_SHORT).show();
                Intent i = new Intent(getApplicationContext(),Colors_Activity.class);
                startActivity(i);
            }
        });
        TextView textView3 = (TextView) findViewById(R.id.phrases);
        textView3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(view.getContext(),"open phrases list",Toast.LENGTH_SHORT).show();
                Intent i = new Intent(getApplicationContext(),Phrases_Activity.class);
                startActivity(i);
            }
        });
    }


//    public void openNumbersList(View view){
//        Intent i = new Intent(this,NumbersActivity.class);
//        startActivity(i);
//    }
//    public void openFamilyMembersList(View view){
//        Intent i = new Intent(this,Family_Members_Activity.class);
//        startActivity(i);
//    }
//    public void openColorsList(View view){
//        Intent i = new Intent(this,Colors_Activity.class);
//        startActivity(i);
//    }
//    public void openPhrasesList(View view){
//        Intent i = new Intent(this,Phrases_Activity.class);
//        startActivity(i);
//    }

}
