import model.Projeto;

public class Main
{
    public static void main(String[] args)
    Projeto projeto = new Projeto();
    projeto.setId(1);
    projeto.setNome("Sistema Acadêmico");
    projeto.setDescricao("Sistema para gerenciamento acadêmico");
    projeto.setCategoria("Software");
    projeto.setStatus("Em desenvolvimento");

    System.out.println(projeto.getId());
    System.out.println(projeto.getNome());
    System.out.println(projeto.getDescricao());
    System.out.println(projeto.getCategoria());
    System.out.println(projeto.getStatus());


    {
        System.out.println("==============================");
        System.out.println("    SISTEMA DE PROJETOS");
        System.out.println("==============================");
        System.out.println("");
        System.out.println("");
        System.out.println("");
        System.out.println("Projeto: Portfólio Acadêmico");
        System.out.println("Desenvolvido em Java");
        System.out.println("Versão 1.0");
        
    }
}
