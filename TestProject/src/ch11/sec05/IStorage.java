package ch11.sec05;

public interface IStorage <T>{
	public void add(T itme, int index);
	public T get(int index);
}
