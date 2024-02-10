package com.lamarrulla.empresa.bussines.implement;

import com.lamarrulla.empresa.bussines.IBussinesExamen;
import com.lamarrulla.empresa.entity.Objeto;
import com.lamarrulla.empresa.entity.ObjetoRes;
import org.springframework.stereotype.Component;

import java.io.Console;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

@Component
public class BussinesExamen implements IBussinesExamen {

    List<Objeto> objetoList1 = new ArrayList<>();
    List<Objeto> objetoList2 = new ArrayList<>();
    List<ObjetoRes> objetoRespuestaList = new ArrayList<>();
    @Override
    public List<ObjetoRes> operacion(Integer id) {
        return ejecutaOperacion();
    }
    private void fillList(){
        // Se llena la lista de objetos 1
        objetoList1.add(new Objeto("Mochila"));
        objetoList1.add(new Objeto("Plátano"));
        objetoList1.add(new Objeto("Manzana"));
        objetoList1.add(new Objeto("Auto"));
        objetoList1.add(new Objeto("Manzana"));
        objetoList1.add(new Objeto("Celular"));
        objetoList1.add(new Objeto("Lámpara"));
        objetoList1.add(new Objeto("Plátano"));
        objetoList1.add(new Objeto("Pera"));
        objetoList1.add(new Objeto("Monitor"));
        objetoList1.add(new Objeto("Escritorio"));
        objetoList1.add(new Objeto("CPU"));
        objetoList1.add(new Objeto("Bocina"));
        objetoList1.add(new Objeto("Mouse"));
        objetoList1.add(new Objeto("Manzana"));
        objetoList1.add(new Objeto("Teclado"));
        objetoList1.add(new Objeto("Manzana"));
        objetoList1.add(new Objeto("Plátano"));
        // Se llena la lista de objetos 2
        objetoList2.add(new Objeto("Manzana"));
        objetoList2.add(new Objeto("Plátano"));
        objetoList2.add(new Objeto("Pera"));
    }

    List<ObjetoRes> ejecutaOperacion(){
        objetoList1 = new ArrayList<>();
        objetoList2 = new ArrayList<>();
        objetoRespuestaList = new ArrayList<>();
        fillList();
        ListaDeDuplicadosUsandoFiltros();
        return objetoRespuestaList;
    }

    List<ObjetoRes> ListaDeDuplicadosUsandoFiltros() {
        objetoList1.forEach(this::ComparaListas);
        return objetoRespuestaList;
    }

    void ComparaListas(Objeto objeto){
        var nombre = objetoRespuestaList.stream().filter(objetoR-> objetoR.getName().equals(objeto.getName())).findAny().orElse(null);
        if(nombre == null){
            if(objetoList2.stream().filter(objeto2->objeto2.getName().equals(objeto.getName())).findAny().orElse(null)!=null){
                objetoRespuestaList.add(new ObjetoRes(objeto.getName(),1));
            }
        }else{
            Integer repeticiones = objetoRespuestaList.stream().filter(name-> name.getName().equals(objeto.getName())).findAny().orElse(null).getRepeticiones();
            objetoRespuestaList.stream().filter(name-> name.getName().equals(objeto.getName())).findAny().orElse(null).setRepeticiones(repeticiones+1);
        }
    }
}
