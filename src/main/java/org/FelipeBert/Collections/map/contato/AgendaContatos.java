package org.FelipeBert.Collections.map.contato;

import java.util.HashMap;
import java.util.Map;

public class AgendaContatos {
    private Map<String, Integer> agendaContatoMap;

    public AgendaContatos() {
        this.agendaContatoMap = new HashMap<>();
    }

    public void adicionarContato(String nome, int contato){
        agendaContatoMap.put(nome, contato);
    }

    public void removerContatoPorNome(String nome){
        if(!agendaContatoMap.isEmpty()){
            agendaContatoMap.remove(nome);
        }
    }

    public void exibirContatos(){
        System.out.println(agendaContatoMap);
    }

    public Integer pesquisarPorNome(String nome){
        if(!agendaContatoMap.isEmpty()){
            return agendaContatoMap.get(nome);
        }
        return null;
    }
}
