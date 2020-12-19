package com.pruebas123.petagram.fragmnet;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.pruebas123.petagram.R;
import com.pruebas123.petagram.adapter.MascotaAdaptador;
import com.pruebas123.petagram.pojo.Mascota;

import java.util.ArrayList;


public class RecyclerviewFragment extends Fragment {

    ArrayList<Mascota> mascotas;
    private RecyclerView listaMascotas;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View v = inflater.inflate(R.layout.fragment_recyclerview, container, false);

        listaMascotas = (RecyclerView) v.findViewById(R.id.rvMascotasTotal);

        LinearLayoutManager llm = new LinearLayoutManager(getActivity());
        llm.setOrientation(LinearLayoutManager.VERTICAL);

        listaMascotas.setLayoutManager(llm);
        iniciaListaMascotas();
        inicializaAdaptador();

        return v;
    }



    public void inicializaAdaptador(){
        MascotaAdaptador adaptador = new MascotaAdaptador(mascotas, getActivity());
        listaMascotas.setAdapter(adaptador);
        adaptador.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getContext(),"se=" + mascotas.get(listaMascotas.getChildAdapterPosition(view)).getNombre(),Toast.LENGTH_SHORT).show();
            }
        });
    }


    public void iniciaListaMascotas(){
        mascotas = new ArrayList<Mascota>();
        mascotas.add(new Mascota(R.drawable.chispa, "Chispa", 0));
        mascotas.add(new Mascota(R.drawable.coco, "Coco", 5));
        mascotas.add(new Mascota(R.drawable.jack, "Jack", 3));
        mascotas.add(new Mascota(R.drawable.lucas, "Lucas", 5));
        mascotas.add(new Mascota(R.drawable.max, "Max", 20));
        mascotas.add(new Mascota(R.drawable.rex, "Rex", 1));
        mascotas.add(new Mascota(R.drawable.rocky, "Rocky", 4));
        mascotas.add(new Mascota(R.drawable.thor, "Thor", 1));
        mascotas.add(new Mascota(R.drawable.toby, "Toby", 0));
        mascotas.add(new Mascota(R.drawable.zeus, "Zeus", 4));

    }

    public ArrayList<Mascota> ListaMascotas(){
        mascotas = new ArrayList<Mascota>();
        mascotas.add(new Mascota(R.drawable.chispa, "Chispa", 0));
        mascotas.add(new Mascota(R.drawable.coco, "Coco", 5));
        mascotas.add(new Mascota(R.drawable.jack, "Jack", 3));
        mascotas.add(new Mascota(R.drawable.lucas, "Lucas", 5));
        mascotas.add(new Mascota(R.drawable.max, "Max", 2));
        mascotas.add(new Mascota(R.drawable.rex, "Rex", 1));
        mascotas.add(new Mascota(R.drawable.rocky, "Rocky", 4));
        mascotas.add(new Mascota(R.drawable.thor, "Thor", 1));
        mascotas.add(new Mascota(R.drawable.toby, "Toby", 0));
        mascotas.add(new Mascota(R.drawable.zeus, "Zeus", 4));
        return  mascotas;

    }

}