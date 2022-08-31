package com.example.listadecompra;

import androidx.appcompat.app.AppCompatActivity;

import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.ListView;

import com.example.bancoDados.DBHelper;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    List<Produto>ListaProduto;
    EditText Nome;
    EditText Marca;
    ListView Lista;
    SQLiteDatabase conexao;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        DBHelper db = new DBHelper(this);
        conexao = db.getWritableDatabase();

        Nome = findViewById(R.id.EditText_Produto);
        Marca = findViewById(R.id.EditText_Marca);
        Lista = findViewById(R.id.Listagem_Produtos);
        ListaProduto = new ArrayList<>();
        ArrayAdapter adapter = new ArrayAdapter(this, androidx.appcompat.R.layout.support_simple_spinner_dropdown_item, ListaProduto);

        Lista.setAdapter(adapter);
    }
    public void Salvar(View view){
        Produto produto = new Produto();
        produto.setEditText_Nome(Nome.getText().toString());
        produto.setEditText_Marca(Marca.getText().toString());
        ListaProduto.add(produto);
    }
}