/**
 * 
 */
package log;
import SingletonLog.SingletonLog;
/**
 * @author arthu
 *
 */
public class Log {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SingletonLog log = SingletonLog.getInstancia();
		log.escrever("aqui est� um exemplo do log");
		log.escrever("aqui est� outro exemplo do log");
		SingletonLog log2 = SingletonLog.getInstancia();//nova instancia ??
		log2.escrever("aqui est� mais um exemplo do log");
	}

}
