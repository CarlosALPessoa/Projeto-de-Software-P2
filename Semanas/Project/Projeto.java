package Project;
import java.util.ArrayList;
import java.util.LinkedList;

public class Projeto implements AbstractProjeto {
    private String id;
    private String descricao;
    private String data_i;
    private String data_f;
    private String h_i;
    private String h_f;
    private User coordenador;
    private String status;
    private LinkedList<User> userProject = new LinkedList<User>();
    
    //Construtores
    public void Projeto(String id, String descricao){
        this.id = id;
        this.descricao = descricao;
    }
    public void Projeto(String id, String descricao, User coordenador){
        this.id = id;
        this.descricao = descricao;
        this.coordenador = coordenador;
    }
    
    //Método
        //Override
    @Override
    public void addUser(User usuario){
        this.userProject.add(usuario);
    }
    @Override
    public void mudarStatus(String Status){
        setStatus(Status);
    }
    @Override
    public void dataHoraStart(String datai, String horai){
        if("Iniciado".equals(this.getStatus())){
            this.setData_i(datai);
            this.setH_i(horai);
        }
        else{
            System.out.println("Projeto não foi iniciado!");
        }
    }
    @Override
    public void dataHoraTermino(String x, String y){
        if("Em andamento".equals(this.getStatus())){
            
        }
        else{
            System.out.println("Projeto ainda está para iniciar!");
        }
    }

    //Setters publics
    public void setId(String id) {
        this.id = id;
    }
    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
    public void setCoordenador(User coordenador) {
        this.coordenador = coordenador;
    }
    
    //Setters Privados
    private void setStatus(String status) {
        this.status = status;
    }
    private void setData_f(String data_f) {
        this.data_f = data_f;
    }
    private void setData_i(String data_i) {
        this.data_i = data_i;
    }
    private void setH_i(String h_i) {
        this.h_i = h_i;
    }
     
    private void setH_f(String h_f) {
        this.h_f = h_f;
    }

    //Getters
    public String getId() {
        return id;
    }
    public String getDescricao() {
        return descricao;
    }
    public String getData_i() {
        return data_i;
    }
    public String getData_f() {
        return data_f;
    }
    public User getCoordenador() {
        return coordenador;
    }
    public String getStatus() {
        return status;
    }
    public LinkedList<User> getUserProject() {
        return userProject;
    }
    public String getH_i() {
        return h_i;
    }
    public String getH_f() {
        return h_f;
    }
    
    
}
