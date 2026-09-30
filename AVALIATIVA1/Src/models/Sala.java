package Src.models;

import java.util.ArrayList;

public class Sala {

    private int numero;
    private char bloco;
    private int capacidadeMax;
    private String tipo;
    private ArrayList<Atendimento> atendimentos;
    private Veterinario veterinario;


    public Sala(int numero, char bloco, int capacidadeMax, String tipo) {
        this.numero = numero;
        this.bloco = bloco;
        this.capacidadeMax = capacidadeMax;
        this.tipo = tipo;
        this.atendimentos = new ArrayList<>();
    }

    public boolean atribuirVeterinario(Veterinario veterinario){
        if (veterinario.getSala() != null) {
            return false;
        }
        if (this.veterinario != null) {
            this.veterinario.atribuirSala(null);
        }
        this.veterinario = veterinario;
        veterinario.atribuirSala(this);
        return true;
    }

    public boolean addAtendimento(Atendimento atendimento){
        if (!atendimento.getStatus().equals("agendado")) {
            return false;
        }
        if (veterinario == null) {
            return false;
        }
        if (atendimentos.size() >= capacidadeMax) {
            return false;
        }
        if (!atendimentos.isEmpty()) {
            String procedimentoDaSala = atendimentos.get(0).getProcedimento().getNome();
            if (!procedimentoDaSala.equalsIgnoreCase(atendimento.getProcedimento().getNome())) {
                return false;
            }
        }
        atendimentos.add(atendimento);
        atendimento.iniciar(this);
        return true;
    }

    public void removerAtendimento(Atendimento atendimento){
        atendimentos.remove(atendimento);
    }

    public void exibirAtendimentos(){
        for (Atendimento atendimento : atendimentos) {
            atendimento.exibir();
        }
    }

    public void exibirQtdAtendimentos(){
        System.out.println("total de atendimentos nessa sala: "+ atendimentos.size());
    }

    public void exibir(){
        System.out.println("Sala " + numero + " | Bloco " + bloco + " | Capacidade: " + capacidadeMax + " | Tipo: " + tipo);
        if (veterinario == null) {
            System.out.println("Veterinario: nenhum");
        } else {
            veterinario.exibir();
        }
    }




    public int getNumero() {
        return numero;
    }
    public void setNumero(int numero) {
        this.numero = numero;
    }
    public char getBloco() {
        return bloco;
    }
    public void setBloco(char bloco) {
        this.bloco = bloco;
    }
    public int getCapacidadeMax() {
        return capacidadeMax;
    }
    public void setCapacidadeMax(int capacidadeMax) {
        this.capacidadeMax = capacidadeMax;
    }
    public String getTipo() {
        return tipo;
    }
    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
    public ArrayList<Atendimento> getAtendimentos() {
        return atendimentos;
    }
    public Veterinario getVeterinario() {
        return veterinario;
    }



}
