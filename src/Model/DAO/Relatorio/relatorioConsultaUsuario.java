/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model.DAO.Relatorio;

import java.util.ArrayList;
import javax.swing.table.AbstractTableModel;

/**
 *https://www.youtube.com/watch?v=WJ3700ZIxBc
 * trabalhando JTable
 * @author Fabinhu
 */
public class relatorioConsultaUsuario extends AbstractTableModel {
    
    private ArrayList linhas = null;
    private String[] colunas = null;
    
public relatorioConsultaUsuario(ArrayList lin, String[] col){
    
    setLinhas(lin);
    setColunas(col);
    
}

public ArrayList getLinhas(){
    return linhas;
}

public void setLinhas(ArrayList dados){
    linhas = dados;
}

public String[] getColunas(){
    return colunas;
}

// Responsavel pelos nomes das colunas
public void setColunas(String[] nomes){
    colunas = nomes;
}
    
public int getColumnCount(){
    // Metodo que conta a quantidade de Colunas
    return colunas.length;
}

public int getRowCount(){
    return linhas.size();
}

//metodo responsavel por pegar o nome das colunas no banco
public String GetColumnName(int numCol){
    return colunas[numCol];
}

//Montando a Tabela
public Object getValueAt(int numeroLinhas, int numeroColunas){
    
Object[] linha = (Object[]) getLinhas().get(numeroLinhas);
return linha[numeroColunas];
}

}
