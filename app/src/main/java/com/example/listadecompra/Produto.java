package com.example.listadecompra;

public class Produto {
    private String EditText_Nome;
    private String EditText_Marca;

    public String getEditText_Nome() {
        return EditText_Nome;
    }

    public void setEditText_Nome(String editText_Nome) {
        EditText_Nome = editText_Nome;
    }

    public String getEditText_Marca() {
        return EditText_Marca;
    }

    public void setEditText_Marca(String editText_Marca) {
        EditText_Marca = editText_Marca;
    }

    @Override
    public String toString() {
        return "Produto{" +
                "EditText_Nome='" + EditText_Nome + '\'' +
                ", EditText_Marca='" + EditText_Marca + '\'' +
                '}';
    }
}
