package dao;

public interface LoDaoPersonne<T> {
	public T getByMail(String mail);
}
