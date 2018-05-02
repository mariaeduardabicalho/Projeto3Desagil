package com.example.nicolasstegmann.projeto3;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

public class Fragment_msg3 extends Fragment {
    private static final String TAG = "Fragment_comida";
    public final static String mensagem = "id_mensagem_a_ser_enviada";
    private Button button_falar;
    private Button tomsg4;
    private int number;
    public final static String numero = "id_numero_do_contato";
    private String falar = "Preciso falar com você";

    private void openSendActivity(String mensagem_e) {
        Intent intent1 = ((Messages)getActivity()).getIntent();
        final String numero_d = intent1.getStringExtra(ContactsActivity.numero);
        Intent intent = new Intent(((Messages)getActivity()), Send.class);
        //intent.setData(Uri.parse(numero_contato));
        intent.putExtra(mensagem, mensagem_e);
        intent.putExtra(numero, numero_d);
        startActivity(intent);
        ((Messages)getActivity()).finish();
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.message_3, container, false);
        button_falar = (Button) view.findViewById(R.id.button_falar);
        tomsg4 = (Button) view.findViewById(R.id.change_message3);

        button_falar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openSendActivity(falar);
            }
        });

        tomsg4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ((Messages)getActivity()).setViewPager(4);
            }
        });


        return view;
    }
}
