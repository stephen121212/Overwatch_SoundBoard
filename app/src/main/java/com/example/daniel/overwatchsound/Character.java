package com.example.daniel.overwatchsound;

import android.content.Context;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.io.InputStream;
import java.util.ArrayList;

public class Character {

    public String title;
    public String description;
    public String imageUrl;

    public static ArrayList<Character> getCharactersFromFile(String filename, Context context){
        final ArrayList<Character> characterList = new ArrayList<>();

        try {
            // Load data
            String jsonString = loadJsonFromAsset("characters.json", context);
            JSONObject json = new JSONObject(jsonString);
            JSONArray characters = json.getJSONArray("characters");

            // Get Character objects from data
            for(int i = 0; i < characters.length(); i++){
                Character character = new Character();

                character.title = characters.getJSONObject(i).getString("title");
                character.description = characters.getJSONObject(i).getString("description");
                character.imageUrl = characters.getJSONObject(i).getString("image");

                characterList.add(character);
            }
        } catch (JSONException e) {
            e.printStackTrace();
        }

        return characterList;
    }

    private static String loadJsonFromAsset(String filename, Context context) {
        String json = null;

        try {
            InputStream is = context.getAssets().open(filename);
            int size = is.available();
            byte[] buffer = new byte[size];
            is.read(buffer);
            is.close();
            json = new String(buffer, "UTF-8");
        }
        catch (java.io.IOException ex) {
            ex.printStackTrace();
            return null;
        }

        return json;
    }

}
