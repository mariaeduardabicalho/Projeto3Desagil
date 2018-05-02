package com.example.nicolasstegmann.projeto3;

import android.content.Intent;
import android.support.annotation.Nullable;
import android.support.v4.view.ViewPager;
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
    private SectionsStatePagerAdapter mSectionsStatePagerAdapter;
    private ViewPager mViewPager;

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

        mSectionsStatePagerAdapter = new SectionsStatePagerAdapter(getSupportFragmentManager());
        mViewPager = (ViewPager) findViewById(R.id.container);

        setupViewPager(mViewPager);


    };

    private void setupViewPager(ViewPager viewPager){
        SectionsStatePagerAdapter adapter = new SectionsStatePagerAdapter(getSupportFragmentManager());
        adapter.addFragment(new Fragment_msg0(), "banheiro");
        adapter.addFragment(new Fragment_msg1(), "comida");
        adapter.addFragment(new Fragment_msg2(), "falar_comvc");
        adapter.addFragment(new Fragment_msg3(), "agua");
        adapter.addFragment(new Fragment_msg4(),"emergencia");
        viewPager.setAdapter(adapter);
    }

    public void setViewPager(int fragmentNumber) {
        mViewPager.setCurrentItem(fragmentNumber);
    }
}
