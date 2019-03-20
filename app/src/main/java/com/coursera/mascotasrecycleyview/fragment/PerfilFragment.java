package com.coursera.mascotasrecycleyview.fragment;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.GridView;
import com.coursera.mascotasrecycleyview.R;
import com.coursera.mascotasrecycleyview.utils.ImageAdapter;

/**
 * A simple {@link Fragment} subclass.
 */
public class PerfilFragment extends Fragment {

    private GridView gridView;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.fragment_perfil, container, false);

        setInitialValues(v);
        setUpLayout();
        setUpUIInteraction();

        return v;
    }

    /**Metodo que agrega los valores a los componentes
     * @return void
     * */
    public void setInitialValues(View v) {
        gridView = (GridView) v.findViewById(R.id.gridview);
        gridView.setAdapter(new ImageAdapter(getContext()));
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
