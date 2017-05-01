package com.example.daniel.overwatchsound;


import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;

import java.util.ArrayList;

/**
 * Created by Daniel on 01/05/2017.
 */
public class CharacterActivity extends AppCompatActivity {

    private ListView mListView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_character);

        mListView = (ListView) findViewById(R.id.character_list_view);

        final ArrayList<Character> characterList = Character.getCharactersFromFile("characters.json", this);

        OverwatchAdapter adapter = new OverwatchAdapter(this, characterList);
        mListView.setAdapter(adapter);
    }
}
