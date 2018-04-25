package com.example.nicolasstegmann.projeto3;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Messages extends AppCompatActivity {
    private String emergencia = "Emergência";
    private String comida = "Preciso de comida";
    private String falar = "Preciso falar com você";
    private String agua = "Preciso de água";
    private String banheiro = "Preciso ir ao banheiro";
    private int number;
    public final static String mensagem = "id_mensagem_a_ser_enviada";
    public final static String numero = "id_numero_do_contato";


    private void openSendActivity(String mensagem_e) {
        Intent intent1 = getIntent();
        final String numero_d = intent1.getStringExtra(ContactsActivity.numero);
        Intent intent = new Intent(this, Send.class);
        //intent.setData(Uri.parse(numero_contato));
        intent.putExtra(mensagem, mensagem_e);
        intent.putExtra(numero, numero_d);
        startActivity(intent);
        finish();
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_messages);

        Button buttonagua = (Button) findViewById(R.id.button_agua);
        Button buttonemergencia = (Button) findViewById(R.id.button_emergencia);
        Button buttonfalar = (Button) findViewById(R.id.button_falar);
        Button buttoncomida = (Button) findViewById(R.id.button_comida);
        Button buttonbanheiro = (Button) findViewById(R.id.button_banheiro);

        buttonagua.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openSendActivity(agua);
            }
        });

        buttonbanheiro.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openSendActivity(banheiro);
            }
        });

        buttoncomida.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openSendActivity(comida);
            }
        });

        buttonemergencia.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openSendActivity(emergencia);
            }
        });

        buttonfalar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openSendActivity(falar);
            }
        });
    }
}
