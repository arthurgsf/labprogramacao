package SingletonLog;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class SingletonLog {
	
	private File arquivo;
	
	private static SingletonLog instancia;
	
	private SingletonLog(File arq) {
		arquivo = arq;
	}
	
	
	public static synchronized SingletonLog getInstancia() {
		if (instancia == null) instancia = new SingletonLog(new File("Log.txt"));
		return instancia;
	}
	
	public synchronized void escrever(String conteudoLog) {
		try(FileWriter writer = new FileWriter(arquivo,true)){
			writer.write(conteudoLog + "\n");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
