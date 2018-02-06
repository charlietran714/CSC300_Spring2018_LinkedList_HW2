package com.example.awesomefat.csc300_spring2018_linkedlist;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity
{
    private Button button1;
    private Button button2;
    private EditText inputET;
    private TextView listView;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        LinkedList ll = new LinkedList();
        ll.addFront(2);
        ll.addFront(5);
        ll.addFront(7);
        ll.addEnd(9);
        ll.display();
    }
    public void onButtonPressed(View v)
    {
        LinkedList ll = new LinkedList();
        int payload = Integer.parseInt(this.inputET.getText().toString());
        ViewGroup VLL = (ViewGroup)this.findViewById(R.id.linearlayout);
        if(v == button1)
        {
            ll.addFront(payload);
        }
        if(v == button2)
        {
            ll.addEnd(payload);
        }
        listView.setText(ll.toString());
        VLL.addView(listView);


    }
}
