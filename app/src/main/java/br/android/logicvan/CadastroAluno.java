package br.android.logicvan;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.EditText;

public class CadastroAluno extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cadastro_aluno);
    }

    public void salvarAluno(View view) {

        Aluno aluno = new Aluno();

        EditText nome = (EditText) findViewById(R.id.editTextNome);
        EditText cpf = (EditText) findViewById(R.id.editTextCpf);
        EditText rg = (EditText) findViewById(R.id.editTextRg);
        EditText telefone = (EditText) findViewById(R.id.editTextFone);
        EditText endereco = (EditText) findViewById(R.id.editTextEndereco);
        EditText cep = (EditText) findViewById(R.id.editTextCep);
        EditText escola = (EditText) findViewById(R.id.editTextEscola);
        EditText email = (EditText) findViewById(R.id.editTextEmail);

        aluno.setNome(nome.getText().toString());
        aluno.setCpf(cpf.getText().toString());
        aluno.setRg(rg.getText().toString());
        aluno.setTelefone(telefone.getText().toString());
        aluno.setEndereco(endereco.getText().toString());
        aluno.setCep(cep.getText().toString());
        aluno.setEscola(escola.getText().toString());
        aluno.setEmail(email.getText().toString());

        String valNome = nome.getText().toString();
        if(TextUtils.isEmpty(valNome)){
            nome.requestFocus();
            nome.setError("Campo obrigatório");
        }
        String valFone = telefone.getText().toString();
        if(TextUtils.isEmpty(valFone)){
            telefone.requestFocus();
            telefone.setError("Campo obrigatório");
            return;
        }
        ListaAlunosDAO.listaAlunos.add(aluno);
    }

}

