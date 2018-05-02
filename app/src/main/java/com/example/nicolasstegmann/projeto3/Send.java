package com.example.nicolasstegmann.projeto3;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.content.Intent;
import android.telephony.PhoneNumberUtils;
import android.telephony.SmsManager;
import android.view.View;
import android.widget.Button;

public class Send extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_send);

        Intent intent = getIntent();
        final String numero_d = intent.getStringExtra(Messages.numero);
        final String mensagem_d = intent.getStringExtra(Messages.mensagem);
        Button buttonenvio = (Button) findViewById(R.id.enviar);

        buttonenvio.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (mensagem_d.isEmpty()) {
                    Utils.showToast(Send.this, "Mensagem vazia!");
                    return;
                }

                if (!PhoneNumberUtils.isGlobalPhoneNumber(numero_d)) {
                    Utils.showToast(Send.this, numero_d);
                    Utils.showToast(Send.this, "Telefone inválido!");
                    return;
                }

                SmsManager manager = SmsManager.getDefault();
                manager.sendTextMessage(numero_d, null, mensagem_d, null, null);
                Utils.showToast(Send.this, "Mensagem enviada");
            }
        });
    }
}

