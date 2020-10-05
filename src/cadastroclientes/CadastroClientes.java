
package cadastroclientes;

public class CadastroClientes {

    public static void main(String[] args) {
        
        UICadastro1 form = new UICadastro1();
        Clientes c = new Clientes(form.nome,form.cpf,form.sexo,form.endereco,form.cidade,form.estado);
        
        
        
    }
    
}
