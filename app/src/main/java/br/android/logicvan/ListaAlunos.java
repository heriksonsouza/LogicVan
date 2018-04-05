package br.android.logicvan;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by aluno on 04/04/18.
 */

public class ListaAlunos extends AppCompatActivity {

    private AdapterAlunos adapterAlunos;
    private ListView listAlunos;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lista_alunos);

        listAlunos = (ListView) findViewById(R.id.listAlunos);
    }

    private void preencherListView() {
        adapterAlunos = new AdapterAlunos(this, getListaAlunos());
        listAlunos.setAdapter(adapterAlunos);
    }

    private List<Aluno> getListaAlunos() {
        List<Aluno> ltAln = Aluno.listAll(Aluno.class);
        return ltAln;
    }

    @Override
    protected void onPostResume() {
        super.onPostResume();
        preencherListView();
    }

}
