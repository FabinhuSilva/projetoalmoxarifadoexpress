/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

/**
 *
 * @author Fabinhu
 * https://mballem.com/post/manipulando-arquivo-txt-com-java/
 */
public class arquivoConfiguracaoBanco {

    public arquivoConfiguracaoBanco() {
    
    }
    
    
    private String nomeBanco;
    private String enderecoBanco;
    private int portaBanco;
    private String usuarioBanco;
    private String senhaBanco;
    
       
	//Gere os métodos getters e setters
	//Subscreva o método toString()   

    public arquivoConfiguracaoBanco(String nomeBanco, String enderecoBanco, int portaBanco, String usuarioBanco, String senhaBanco) {
        this.nomeBanco = nomeBanco;
        this.enderecoBanco = enderecoBanco;
        this.portaBanco = portaBanco;
        this.usuarioBanco = usuarioBanco;
        this.senhaBanco = senhaBanco;
    }

    public String getNomeBanco() {
        return nomeBanco;
    }

    public void setNomeBanco(String nomeBanco) {
        this.nomeBanco = nomeBanco;
    }

    public String getEnderecoBanco() {
        return enderecoBanco;
    }

    public void setEnderecoBanco(String enderecoBanco) {
        this.enderecoBanco = enderecoBanco;
    }

    public int getPortaBanco() {
        return portaBanco;
    }

    public void setPortaBanco(int portaBanco) {
        this.portaBanco = portaBanco;
    }

    public String getUsuarioBanco() {
        return usuarioBanco;
    }

    public void setUsuarioBanco(String usuarioBanco) {
        this.usuarioBanco = usuarioBanco;
    }

    public String getSenhaBanco() {
        return senhaBanco;
    }

    public void setSenhaBanco(String senhaBanco) {
        this.senhaBanco = senhaBanco;
    }
    
     
      
public void escrever(){
    
        
    setNomeBanco("almoxarifado");
    setEnderecoBanco("127.0.0.1");
    setPortaBanco(5432);
    setUsuarioBanco("postgres");
    setSenhaBanco("VrPost@Server");
    
}

    
    
    @SuppressWarnings("empty-statement")
    public static void escreverTXT(){
        
        arquivoConfiguracaoBanco carregarVariaveis = new arquivoConfiguracaoBanco();
        carregarVariaveis.escrever();
        
        //Criando o diretorio
        java.io.File diretorio = new java.io.File("C:\\AlmoxarifadoExpress"); 
        boolean statusDiretorio = statusDiretorio = diretorio.mkdir();
        System.out.print("Repositorio Criado? = "+statusDiretorio);        
        
        
        //Criando o Arquivo
        java.io.File arquivo = new java.io.File(diretorio, "almoxarifado.txt"); 
        try{
        	boolean statusArq = arquivo.createNewFile();
                System.out.print("Arquivo e Pasta Criado? " + statusArq);    
        }catch(IOException e){
             e.printStackTrace();
        }
        
        
        File diretorioArquivo = new File("C:\\AlmoxarifadoExpress");
        File arquivoConfiguracao = new File(diretorioArquivo,"almoxarifado.txt");
        
        try{
            //neste ponto criamos o arquivo fisicamente
            arquivoConfiguracao.createNewFile();
            
            /*
            1 - Devemos passar no construtoro do FileWireter qual o araquivo vamos manipular
                1.1 - Este Construtor aceita dois parametros (File ou String)
            2 - O Paremetro TRUE indica que reescreveremos no arquivo sem apagar o que ja Existe
            3 - O FALSE apagaria o Conteuo do Arquivo e escrreveria o novo conteudo
            4 - Se nao usar o segundo parametro, elepor padrao sera FALSE
            */
            
            //Esta Linha abre o Fluzo do Arquivo
            FileWriter gravarEmArquivo = new FileWriter(arquivoConfiguracao,false);
            
            //Agora na classe PrintWriter vamos escrever no arquivo
            PrintWriter escreverEmArquivo = new PrintWriter(gravarEmArquivo);
            
            //Agora Vamos escrever no arquivo
            
            escreverEmArquivo.println(carregarVariaveis.getNomeBanco());
            escreverEmArquivo.println(carregarVariaveis.getEnderecoBanco());
            escreverEmArquivo.println(carregarVariaveis.getPortaBanco());
            escreverEmArquivo.println(carregarVariaveis.getUsuarioBanco());
            escreverEmArquivo.println(carregarVariaveis.getSenhaBanco());
            
            //metodo FLUSH que libera escrita no arquivo
            
            escreverEmArquivo.flush();
            
            gravarEmArquivo.close();
            
        }catch(IOException e){
            
            e.printStackTrace();
        }
        
    }
    
    public static void lerTXT(){
        
        //Estanciamos o caminho do Arquivo e o Arquivo
        File diretorioSistema = new File ("C:\\AlmoxarifadoExpress");
        File arquivoConfiguracao = new File (diretorioSistema,"almoxarifado.txt");
        
       try{
           //Indicamos o arquivo que será lido
           FileReader leituraArquivo = new FileReader(arquivoConfiguracao);
           
           //Criamos um objeto com o conteudo do arqvuio, utilizando o metodo de letirua readLine();
           BufferedReader conteudoArquivo = new BufferedReader (leituraArquivo) ;
           
           //String que recebera cada linha do arquivo
           String linha = "";
           
            /*
                Fazemos um loop linha a linha no arquivo,
                enquanto ele seja diferente de null.
                O método readLine() devolve a linha na
                posicao do loop para a variavel linha.
           */
      int contador = 1;        
            while ( (linha= conteudoArquivo.readLine()) != null) {
             //Aqui imprimimos a linha
           
             String texto01 = "";
             String texto02 = "";
             String texto03 = "";
             String texto04 = "";
             String texto05 = "";
                if(contador == 1){
                texto01 = linha;
                    }else if(contador == 2){
                     texto02 = linha;
                        }else if(contador == 3){
                        texto03 = linha;
                            }else if(contador == 4){
                            texto04= linha;
                            }else if(contador == 5) {
                                texto05 = linha;
            }
   contador++;
             System.out.println("Variavel Texto01 = " + texto01);
             System.out.println("Variavel Texto02 = " +texto02);
             System.out.println("Variavel Texto03 = " +texto03);
             System.out.println("Variavel Texto04 = " +texto04);
             System.out.println("Variavel Texto05 = " +texto05);
            }
            
            leituraArquivo.close();
            
            conteudoArquivo.close();
            
           
       }catch(IOException e){
        e.printStackTrace();   
       }
        
    }
}
    

