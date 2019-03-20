package com.coursera.mascotasrecycleyview.fragment;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.support.v7.widget.LinearLayoutManager;
import com.coursera.mascotasrecycleyview.R;
import com.coursera.mascotasrecycleyview.pojos.Mascota;
import com.coursera.mascotasrecycleyview.utils.MascotaAdaptador;
import java.util.ArrayList;

public class RecyclerViewFragment extends Fragment {

    private RecyclerView listaMascotas;
    ArrayList<Mascota> mascotas;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.fragment_recyclerview, container, false);

        setInitialValues(v);
        setUpLayout();
        setUpUIInteraction();

        return v;
    }

    /**Metodo que agrega los valores a los componentes
     * @return void
     * */
    public void setInitialValues(View v) {
        listaMascotas =(RecyclerView) v.findViewById(R.id.rvMascotas);

        LinearLayoutManager llm = new LinearLayoutManager(getActivity());
        llm.setOrientation(LinearLayoutManager.VERTICAL);

        listaMascotas.setLayoutManager(llm);
        inicializarListaMascotas();
        inicializarAdaptador();
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
}
