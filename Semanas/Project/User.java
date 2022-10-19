package Project;

public class User {
    public String name;
    public Type tipo;
    public String email;
    private String senha;
    private String CPF;
    
    //construtor
   
    public User(String name, Type tipo, String email, String senha, String CPF){
        this();
        this.name = name;
        this.tipo = tipo;
        this.email = email;
        this.senha = senha;
        this.CPF = CPF;
    }
    public User(){
        System.out.println("Usuário criado.\n");
    }
    
    
    @Override
    public String toString(){
        return "Nome: " + this.name + "\nTipo: " + this.tipo + "\nEmail: " +
                this.email;
    }
    
    //gets
    public String getName() {
        return name;
    }
    public Type getTipo() {
        return tipo;
    }
    public String getEmail() {
        return email;
    }
    public String getSenha() {
        return senha;
    }
    public String getCPF() {
        return CPF;
    }
    
    //sets
    public void setName(String name) {
        this.name = name;
    }
    public void setTipo(Type tipo) {
        this.tipo = tipo;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public void setSenha(String senha) {
        this.senha = senha;
    }
    public void setCPF(String CPF) {
        this.CPF = CPF;
    }

    
}
