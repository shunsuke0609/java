package study;
import java.util.Set;
@FunctionalInterface
public interface PartyInfoConsumer {
	public abstract void process(Set<Hero7> party, Hero7 leader, String pName);
}
