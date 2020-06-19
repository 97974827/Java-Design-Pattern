package Builder_2;

// Product
public class Computer {
	
	private String cpu;
	private int ram;
	private String storage;
	
	
	/* ��ť��Ʈ 
	 * @param 
	 * @param
	 * @param
	 */
	
	public Computer(String cpu, int ram, String storage) {
		//super();
		this.cpu = cpu;
		this.ram = ram;
		this.storage = storage;
	}
	
	public String getCpu() {
		return cpu;
	}
	public void setCpu(String cpu) {
		this.cpu = cpu;
	}
	public int getRam() {
		return ram;
	}
	public void setRam(int ram) {
		this.ram = ram;
	}
	public String getStorage() {
		return storage;
	}
	public void setStorage(String storage) {
		this.storage = storage;
	}
	
	// ��ü �Ӽ������� toString �������̵� �ؾ��� 
	@Override
	public String toString() {
		return "Computer[cpu=" + cpu + ", ram=" + ram + ", storage=" + storage + "]";
	}
	
}
