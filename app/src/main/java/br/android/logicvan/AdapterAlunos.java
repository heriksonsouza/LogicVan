package br.android.logicvan;

import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;


public class AdapterAlunos extends BaseAdapter {

    private Activity activity;
    public List<Aluno> listaAluno;

    public AdapterAlunos(Activity activity, List<Aluno> listaAluno) {
        this.activity = activity;
        this.listaAluno = listaAluno;
    }

    @Override
    public int getCount() {
        return listaAluno.size();
    }

    @Override
    public Object getItem(int position) {
        return listaAluno.get(position);
    }

    @Override
    public long getItemId(int position) {
        return listaAluno.get(position).getId();
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View view = LayoutInflater.from(activity).inflate(R.layout.linha_lista_alunos, parent, false);

        Aluno aln = (Aluno) getItem(position);
        TextView nome = (TextView) view.findViewById(R.id.textViewNome);
        TextView endereco = (TextView) view.findViewById(R.id.textViewEndereco);
        TextView fone = (TextView) view.findViewById(R.id.textViewTelefone);

        nome.setText(aln.getNome());
        endereco.setText(aln.getEndereco());
        fone.setText(aln.getTelefone());

        return view;
    }
}

