package com.coursera.mascotasrecycleyview.activities;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;

import com.coursera.mascotasrecycleyview.R;
import com.coursera.mascotasrecycleyview.pojos.Mascota;
import com.coursera.mascotasrecycleyview.utils.MascotaAdaptador;

import java.util.ArrayList;

public class Resumen extends AppCompatActivity {

    ArrayList<Mascota> mascotas;
    private RecyclerView listaMascotas;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_resumen);

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
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        listaMascotas =(RecyclerView) findViewById(R.id.rvMascotasResumen);

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

    }

    public void inicializarListaMascotas() {
        mascotas = new ArrayList<>();

        mascotas.add(new Mascota("Albino", "4", R.drawable.albino));
        mascotas.add(new Mascota("Pelo Laroo", "4", R.drawable.angora));
        mascotas.add(new Mascota("Champagne", "4", R.drawable.champang));
        mascotas.add(new Mascota("Chocolate", "4", R.drawable.chocolate));
        mascotas.add(new Mascota("Patas Negras", "4", R.drawable.patas_negras));
    }
    public void inicializarAdaptador() {
        MascotaAdaptador adaptador = new MascotaAdaptador(mascotas);
        listaMascotas.setAdapter(adaptador);
    }
}
