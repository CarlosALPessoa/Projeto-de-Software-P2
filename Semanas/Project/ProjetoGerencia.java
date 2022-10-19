package Project;
import java.util.ArrayList;
import java.util.Scanner;

public class ProjetoGerencia {
    public static int indxUser(String nome, ArrayList<User> userArray){
        for (int i = 0; i < userArray.size(); i++) {
            if (userArray.get(i).name.equals(nome))
               return i;
        }   
        return -1;
      }
    
    public static User novoUser(){
        System.out.println("");
        return new User();
    }
    public static void main(String[] args) {
        //Listas
        ArrayList<User> userArray = new ArrayList<User>();
        ArrayList<Projeto> projetoUp = new ArrayList<Projeto>();
        
        //Scanner
        Scanner sc = new Scanner(System.in);
        
        //Criação de usuário
        userArray.add(new User("Rafael", Type.aluno_graduação, "raf@gmail.com", "lafa", "12345678978"));
        userArray.add(new User("Lourenço", Type.analista, "lou@gmail.com", "louren", "12345678922"));
        userArray.add(new User("Fabio", Type.pesquisador, "fab@gmail.com", "biofa", "12345678913"));
        
        int option;
        
        while(true){
            System.out.print("Escolha a opção:"
                                + "1 - Fazer Login;"
                                + "2 - Criar Projeto"
                 //            + "3 - Criar Usuário."   - Personalizar depois
                                + "4 - Remover Usuário."
                                + "5 - Sair do Sistema");
            option = sc.nextInt();
            switch(option){
            case 1:
                String email = sc.nextLine();
                String senha = sc.nextLine();
                for (User users : userArray) {
                    if(email.equals(users.getEmail()) && senha.equals(users.getSenha())){
                        System.out.println("Entrou");
                    }
                }
                
                //removendo users por index
                if(indxUser("Rafael", userArray) != -1){
                    userArray.remove(indxUser("Rafael", userArray));
                }
            case 2:
            //case 3:    
            case 4:
                
            case 5:
                System.out.println("Sair do sistema");
                break;
            default: 
                System.out.println("Digite uma opção válida!");
            }
        }
       
        //Imprimindo users
        
    }
    
}
