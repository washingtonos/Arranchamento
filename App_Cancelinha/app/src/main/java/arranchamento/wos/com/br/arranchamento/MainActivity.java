package arranchamento.wos.com.br.arranchamento;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void btn_Site1GAAAe (View view){
        Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("http://www.1bdaaaae.eb.mil.br"));
        startActivity(intent);
    }

    public void btn_OFICIAIS (View view){
        Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://docs.google.com/forms/d/e/1FAIpQLSeCF4-AyIKObtxcXrx9Bj4EjyrqQ1u9Uv-AquJ9Y5XT-oGaOA/viewform?c=0&w=1"));
        startActivity(intent);
    }

    public void btn_ST_SGT (View view){
        Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://docs.google.com/forms/d/e/1FAIpQLScEVX8DlMA21Kry7pnUXtd9RYknZd-aPMoHPUIsc04xY10h1A/viewform?c=0&w=1"));
        startActivity(intent);
    }

    public void btn_Cardapio (View view){
        Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://drive.google.com/file/d/17DOcZAB2aUshV6yejQJKIxmlWz7JlmvW/view"));
        startActivity(intent);
    }

}
