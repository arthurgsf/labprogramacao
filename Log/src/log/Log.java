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
		log.escrever("aqui está um exemplo do log");
		log.escrever("aqui está outro exemplo do log");
		SingletonLog log2 = SingletonLog.getInstancia();//nova instancia ??
		log2.escrever("aqui está mais um exemplo do log");
	}

}
