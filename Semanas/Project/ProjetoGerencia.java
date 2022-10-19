package Project;
import java.util.ArrayList;
import java.util.Scanner;

public class ProjetoGerencia {
    //Verificação de index por meio do nome na lista de usuários
        public static int indxUser(String nome, ArrayList<User> userArray){
            for (int i = 0; i < userArray.size(); i++) {
                User x = userArray.get(i);
                System.out.println(x);
                if (nome.equals(userArray.get(i).getName())){
                    return i;
                }
            }
            return -1;
        }
    
    //Função para adicionar novo usuário
    /*public static User novoUser(){
        System.out.println("");
        return new User();
    }*/
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
        /*for(User s: userArray){
            System.out.println(s.toString());
        }*/
        
        int option;
        
        while(true){
            System.out.println("""
                               Escolha uma opção:
                               1 - Fazer Login;
                               2 - Criar Projeto
                               4 - Remover Usuário
                               5 - Sair do Sistema""");
            option = sc.nextInt();
            if(option == 1){
                    sc.nextLine();
                    String email = sc.nextLine();
                    String senha = sc.nextLine();
                    for (User users : userArray) {
                        if(email.equals(users.getEmail()) && senha.equals(users.getSenha())){
                            System.out.println("Entrou");
                        }
                    }
            }
            else if(option == 2){
                System.out.println("Entrou!");
                    projetoUp.add(new Projeto("223", "App BancoUniversity", userArray.get(2)));
                    
            }
                // projetoUp.add(new Projeto(224, "App BancoUniversity", coordenador);
                //case 3:    
            else if(option == 4){
                    //removendo users por index
                    sc.nextLine();
                    String s = sc.nextLine();
                    if(indxUser(s, userArray) != -1){
                        userArray.remove(indxUser("Rafael", userArray));
                        System.out.println("Usuário " + s + " removido!");
                    }
           }
           else if(option == 5){
                    for(Projeto proj : projetoUp){
                        System.out.println(proj.toString());
                    }
                    
                    
            } else{
                System.out.println("Digite uma opção válida!");
            }
        //Imprimindo users
        }
    }
}
