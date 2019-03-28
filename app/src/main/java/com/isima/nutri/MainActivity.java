package com.isima.nutri;

import androidx.appcompat.app.AppCompatActivity;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;


import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;



public class MainActivity extends AppCompatActivity {


    private static final String TAG = "MainActivity";

    /*EditText editText = (EditText) findViewById(R.id.editText);
     TextView posText = (TextView) findViewById(R.id.textView);
     TextView negText = (TextView) findViewById(R.id.textView2);
     TextView scoreText = (TextView) findViewById(R.id.textView3);
*/

    private EditText editText;
    private TextView posText ,negText , scoreText;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

         editText = (EditText) findViewById(R.id.editText);
         posText = (TextView) findViewById(R.id.textView);
         negText = (TextView) findViewById(R.id.textView2);
         scoreText = (TextView) findViewById(R.id.textView3);


    }

    public void calculerScore(View view) {

        String id = editText.getText().toString();
        if (id.isEmpty()){
            Toast.makeText(getApplicationContext(),"champ vide",Toast.LENGTH_SHORT).show();          }
        else{
            ApiHelper.getInstance().getProduitApi().getProduit(id).enqueue(new Callback<Produit>() {
                @Override
                public void onResponse(Call<Produit> call, Response<Produit> response) {
                    Produit p = response.body();
                    posText.setText(p.getQualities().toString());
                    negText.setText(p.getDefaults().toString());
                    scoreText.setText(p.getScore().toString());
                }

                @Override
                public void onFailure(Call<Produit> call, Throwable t) {
                    Log.d(TAG, "Erreur appel reseau "+ t.getMessage());
                    t.printStackTrace();
                }
            });
        }
    }
}
