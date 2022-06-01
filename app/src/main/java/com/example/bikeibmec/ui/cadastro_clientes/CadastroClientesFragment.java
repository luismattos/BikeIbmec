package com.example.bikeibmec.ui.cadastro_clientes;

import androidx.lifecycle.ViewModelProvider;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.bikeibmec.R;
import com.example.bikeibmec.databinding.FragmentCadastroClientesBinding;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.textfield.TextInputLayout;

public class CadastroClientesFragment extends Fragment {

    private FragmentCadastroClientesBinding binding;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        CadastroClientesViewModel cadastroClientesViewModel =
                new ViewModelProvider(this).get(CadastroClientesViewModel.class);

        binding = FragmentCadastroClientesBinding.inflate(inflater, container, false);
        View root = binding.getRoot();

//        MaterialButton materialButton = binding.cadastroClientesSubmit;
//        System.out.println(binding.cadastroClientesMatricula.getEditText().getText());
//        binding.cadastroClientesNome;
//        binding.cadastroClientesSobrenome;
//        binding.cadastroClientesSexo;
//        binding.cadastroClientesSexoMasculino;
//        binding.cadastroClientesSexoFeminino;
//        binding.cadastroClientesCursoEngComp;
//        binding.cadastroClientesCursoEngCiv;
//        binding.cadastroClientesCursoEngProd;
//        binding.cadastroClientesCursoEngMec;
//        binding.cadastroClientesCelular;
//        binding.cadastroClientesEmail;
//        binding.cadastroClientesCartaoBandeiraElo;
//        binding.cadastroClientesCartaoBandeiraMastercard;
//        binding.cadastroClientesCartaoBandeiraVisa;
//        binding.cadastroClientesCartaoNumero;
//        binding.cadastroClientesCartaoTitular;
//        binding.cadastroClientesCartaoValidade;
//        binding.cadastroClientesCartaoCv;

//        materialButton.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//
//            }
//        });

//        final TextView textView = binding.textCadastroClientes;
//        cadastroClientesViewModel.getText().observe(getViewLifecycleOwner(), textView::setText);
        return root;
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }

}