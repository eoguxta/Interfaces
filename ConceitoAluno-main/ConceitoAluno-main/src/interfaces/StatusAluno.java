package interfaces;
import javax.swing.JOptionPane;

public class StatusAluno implements Aprovacao{
    public static void main(String[] args) {
        
        String opcao = JOptionPane.showInputDialog("Digite a nota do aluno");
        double nota = Double.parseDouble(opcao);
       
        String Status;
        
        if (nota > 7) {
            Status = "Acima";
            JOptionPane.showMessageDialog(null, Acima);
        } 
        else if (nota == 7) {
            Status = "Media";
            JOptionPane.showMessageDialog(null, Media);
        } 
        else {
            Status = "Abaixo";
            JOptionPane.showMessageDialog(null, Abaixo);
        }
    }
}
