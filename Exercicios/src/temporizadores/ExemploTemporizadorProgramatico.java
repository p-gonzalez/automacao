package temporizadores;
import javax.annotation.Resource;
import javax.ejb.Timeout;
import javax.ejb.TimerService;
import javax.swing.JOptionPane;




public class ExemploTemporizadorProgramatico {
	@Resource
	TimerService timerService;
	
	public void setTemporizador() {
		timerService.createTimer(50000, " Novo temporizador. ");
	}
	
	
	@Timeout
	public void executeTarefa() {
		
		//System.out.println("Tarefa executada com sucesso.");
		JOptionPane.showMessageDialog(null, "Teste de controle de tempo");
	}
	
	
	public static void main(String[] args) {
		
		ExemploTemporizadorProgramatico t = new ExemploTemporizadorProgramatico();
	t.executeTarefa();
	
	
	}
	

}
