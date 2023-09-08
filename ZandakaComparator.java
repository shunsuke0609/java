package study;
import java.util.Comparator;

public class ZandakaComparator implements Comparator<Account3>{
	public int compare(Account3 x, Account3 y) {
		return(x.zandaka - y.zandaka);
	}
}
