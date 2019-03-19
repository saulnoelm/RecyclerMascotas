package com.coursera.mascotasrecycleyview.layouts;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.view.View.OnClickListener;
import android.widget.ImageButton;
import android.annotation.SuppressLint;
import com.coursera.mascotasrecycleyview.R;
import com.coursera.mascotasrecycleyview.pojos.Mascota;
import com.coursera.mascotasrecycleyview.utils.MascotaAdaptador;
import android.view.View;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ArrayList<Mascota> mascotas;
    private RecyclerView listaMascotas;

    private ImageButton btnSiguiente;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        setInitialValues();
        setUpLayout();
        setUpUIInteraction();
    }

    /**Metodo que agrega los valores a los componentes
     * @return void
     * */
    public void setInitialValues() {
        Toolbar miActionBar = (Toolbar) findViewById(R.id.miActionBar);
        setSupportActionBar(miActionBar);

        listaMascotas =(RecyclerView) findViewById(R.id.rvMascotas);

        LinearLayoutManager llm = new LinearLayoutManager(this);
        llm.setOrientation(LinearLayoutManager.VERTICAL);

        listaMascotas.setLayoutManager(llm);
        inicializarListaMascotas();
        inicializarAdaptador();
    }

    /**Metodo que inicializa los componentes
     * @return void
     * */
    public void setUpLayout() {

    }

    /**Metodo donde se definen los comportamientos de los componente con los eventos de usuario
     * @return void
     * */
    public void setUpUIInteraction() {
        btnSiguiente = (ImageButton) findViewById(R.id.imgBtnStar);
        btnSiguiente.setOnClickListener(new OnClickListener() {
            @SuppressLint("ResourceType")
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, Resumen.class);
                startActivity(intent);
            }
        });
    }

    public void inicializarListaMascotas() {
        mascotas = new ArrayList<>();

        mascotas.add(new Mascota("Albino", "4", R.drawable.albino));
        mascotas.add(new Mascota("Pelo Laroo", "4", R.drawable.angora));
        mascotas.add(new Mascota("Champagne", "4", R.drawable.champang));
        mascotas.add(new Mascota("Chocolate", "4", R.drawable.chocolate));
        mascotas.add(new Mascota("Patas Negras", "4", R.drawable.patas_negras));
        mascotas.add(new Mascota("Plata", "4", R.drawable.plata));
        mascotas.add(new Mascota("Sable", "4", R.drawable.sable));
    }
    public void inicializarAdaptador() {
        MascotaAdaptador adaptador = new MascotaAdaptador(mascotas);
        listaMascotas.setAdapter(adaptador);
    }
}
