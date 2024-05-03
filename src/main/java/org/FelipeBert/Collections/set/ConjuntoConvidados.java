package org.FelipeBert.Collections.set;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class ConjuntoConvidados {
    private Set<Convidado> convidadoSet;

    public ConjuntoConvidados() {
        this.convidadoSet = new HashSet<>();
    }

    public void adicionarConvidado(String nome, int codigo){
        convidadoSet.add(new Convidado(nome, codigo));
    }

    public void removerConvidadoPorCodigo(int codigo){
        Convidado convidadoParaRemover = null;
        for(Convidado c : convidadoSet){
            if(c.getCodigoConvite() == codigo){
                convidadoParaRemover = c;
                break;
            }
        }
        convidadoSet.remove(convidadoParaRemover);
    }

    public int contarConvidados(){
        return convidadoSet.size();
    }

    public void exibirConvidados(){
        System.out.println(convidadoSet);
    }

    public Set<Convidado> pesquisaPorCodigo(int codigo){
        Set<Convidado> contatoPorCodigo = new HashSet<>();
        for(Convidado c : convidadoSet){
            if(c.getCodigoConvite() == codigo){
                contatoPorCodigo.add(c);
                break;
            }
        }
        return contatoPorCodigo;
    }

    public Set<Convidado> pesquisaPorNome(String nome){
        Set<Convidado> contatoPorNome = new HashSet<>();
        for(Convidado c : convidadoSet){
            if(c.getNome().startsWith(nome)){
                contatoPorNome.add(c);
            }
        }
        return contatoPorNome;
    }

    public void atualizarCodigo(String nome, int novoCodigo){
        for(Convidado c : convidadoSet){
            if(c.getNome().equalsIgnoreCase(nome)){
                c.setCodigoConvite(novoCodigo);
                break;
            }
        }
    }

    public Set<Convidado> exibirPorNome(){
        Set<Convidado> convidadosPorNome = new TreeSet<>(convidadoSet);
        return convidadosPorNome;
    }

    public Set<Convidado> exibirPorCodigo(){
        Set<Convidado> convidadosPorCodigo = new TreeSet<>(new ComparatorPorCodigo());
        convidadosPorCodigo.addAll(convidadoSet);
        return convidadosPorCodigo;
    }

}
